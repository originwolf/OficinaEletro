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
public class DAOAparelho {
    
    DAOCliente daoCliente = new DAOCliente();
    public List<Aparelho> getLista() {
        String sql = "select * from aparelho";
        List<Aparelho> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Calendar cal = Calendar.getInstance();
                Aparelho obj = new Aparelho();
                obj.setIdAparelho(rs.getInt("idAparelho"));
                obj.setNomeAparelho(rs.getString("nomeAparelho"));
                obj.setMarcaAparelho(rs.getString("marcaAparelho"));
                java.sql.Date dt = rs.getDate("dataRecebimentoAparelho");
                java.sql.Date da = rs.getDate("dataGarantia");
                Calendar c = Calendar.getInstance();
                Calendar d = Calendar.getInstance();
                c.setTime(dt);
                d.setTime(da);
                obj.setDataRecebimentoAparelho(c);
                obj.setDataGarantia(d);
                obj.setIdCliente(daoCliente.localizar(rs.getInt("Cliente_idCliente")));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Aparelho obj) {
        if (obj.getIdAparelho() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }

    public boolean incluir(Aparelho obj){
        String sql = "Insert into aparelho(nomeAparelho,marcaAparelho,dataRecebimentoAparelho,dataGarantia,Cliente_IdCliente) values(?,?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1, obj.getNomeAparelho());
            pst.setString(2, obj.getMarcaAparelho());
            pst.setDate(3, new java.sql.Date(obj.getDataRecebimentoAparelho().getTimeInMillis()));
            pst.setDate(4, new java.sql.Date(obj.getDataGarantia().getTimeInMillis()));
            pst.setInt(5, obj.getIdCliente().getIdCliente());
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
    
    public boolean alterar(Aparelho obj){
        String sql = "Update aparelho set nomeAparelho=?, marcaAparelho=?, dataRecebimentoAparelho=?, dataGarantia=?, Cliente_idCliente=? where idAparelho=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomeAparelho());
            pst.setString(2,obj.getMarcaAparelho());
            pst.setDate(3, new java.sql.Date(obj.getDataRecebimentoAparelho().getTimeInMillis()));
            pst.setDate(4, new java.sql.Date(obj.getDataGarantia().getTimeInMillis()));
            pst.setInt(5, obj.getIdCliente().getIdCliente());
            pst.setInt(6, obj.getIdAparelho());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Aparelho alterado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Aparelho não alterado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Aparelho não alterado. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Aparelho obj){
        String sql = "delete from aparelho where idAparelho=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdAparelho());          
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Aparelho removido com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Aparelho não removido");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Aparelho não removido. Erro de SQL"+e.getMessage());
            return false;
        }
    }
    
    public Aparelho localizar(Integer id){
       String sql = "select * from aparelho where idAparelho=?";
       Aparelho obj = new Aparelho();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdAparelho(rs.getInt("idAparelho"));
               obj.setNomeAparelho(rs.getString("nomeAparelho"));
               obj.setMarcaAparelho(rs.getString("marcaAparelho"));
               //pst.setDate(1, new java.sql.Date(obj.getDataGarantia().getTimeInMillis()));
               //pst.setDate(2, new java.sql.Date(obj.getDataRecebimentoAparelho().getTimeInMillis()));               
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
    public Aparelho localizarId(Integer id){
       String sql = "select nomeAparelho from aparelho where idAparelho=?";
       Aparelho obj = new Aparelho();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdAparelho(rs.getInt("idAparelho"));
               obj.setNomeAparelho(rs.getString("nomeAparelho"));             
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
}
