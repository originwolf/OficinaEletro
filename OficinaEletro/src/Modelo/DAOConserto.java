package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CelsoAugusto
 */
public class DAOConserto {
    
    DAOTecnico daoTecnico = new DAOTecnico();
    DAOAparelho daoAparelho = new DAOAparelho();
    
    public List<Conserto> getLista() {
        String sql = "select * from conserto";
        List<Conserto> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //Calendar cal = Calendar.getInstance();
                Conserto obj = new Conserto();
                obj.setIdConserto(rs.getInt("idConserto"));
                obj.setPrecoConserto(rs.getDouble("precoConserto"));
                java.sql.Date dt = rs.getDate("dataConserto");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setDataConserto(c);
                obj.setIdTecnico(daoTecnico.localizar(rs.getInt("Tecnico_idTecnico")));
                obj.setIdAparelho(daoAparelho.localizar(rs.getInt("Aparelho_idAparelho")));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL in DAO LIST: " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Conserto obj) {
        if (obj.getIdAparelho() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }
    
    public boolean incluir(Conserto obj){
        String sql = "Insert into conserto(precoConserto,dataConserto,Tecnico_idTecnico,Aparelho_idAparelho) values(?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setDouble(1,obj.getPrecoConserto());
            pst.setDate(2, new java.sql.Date(obj.getDataConserto().getTimeInMillis()));
            pst.setInt(3, obj.getIdTecnico().getIdTecnico());
            pst.setInt(4, obj.getIdAparelho().getIdAparelho());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Aparelho cadastrado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Aparelho não cadastrado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Conserto obj){
        String sql = "Update conserto set precoConserto=?, dataConserto=?, Tecnico_idTecnico=?, Aparelho_idAparelho=? where idConserto=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setDouble(1,obj.getPrecoConserto());
            pst.setDate(2, new java.sql.Date(obj.getDataConserto().getTimeInMillis()));
            pst.setInt(3, obj.getIdTecnico().getIdTecnico());
            pst.setInt(4, obj.getIdAparelho().getIdAparelho());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Conserto alterado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Conserto não alterado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Conserto não alterado. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Conserto obj){
        String sql = "delete from conserto where idConserto=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdConserto());          
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Conserto removido com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Conserto não removido");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Conserto não removido. Erro de SQL"+e.getMessage());
            return false;
        }
    }
    
    public Conserto localizar(Integer id){
       String sql = "select * from conserto where idConserto=?";
       Conserto obj = new Conserto();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdConserto(rs.getInt("idConserto"));
               obj.setPrecoConserto(rs.getDouble("precoConserto"));
               pst.setDate(1, new java.sql.Date(obj.getDataConserto().getTimeInMillis()));
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: on dao locate "+e.getMessage());
       }
       return null;
   }
    
}
