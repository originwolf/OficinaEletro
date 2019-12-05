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
 * @author Josi
 */
public class DAOEstoque {
 
    public List<Estoque> getLista() {
        String sql = "select * from estoque";
        List<Estoque> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Estoque obj = new Estoque();
                obj.setIdEstoque(rs.getInt("idEstoque"));
                obj.setNomePeca(rs.getString("nomePeca"));
                obj.setQuantidadePeca(rs.getInt("quantidadePeca"));
                obj.setValorPeca(rs.getDouble("valorPeca"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Estoque obj) {
        if (obj.getIdEstoque() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }
    
    public boolean incluir(Estoque obj){
        String sql = "Insert into estoque(nomePeca,quantidadePeca,valorPeca) values(?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomePeca());
            pst.setInt(2, obj.getQuantidadePeca());
            pst.setDouble(3, obj.getValorPeca());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Peça cadastrada com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Peça não cadastrada");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Estoque obj){
        String sql = "Update estoque set nomePeca=?, quantidadePeca=?, valorPeca=? where idEstoque=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomePeca());
            pst.setInt(2,obj.getQuantidadePeca());
            pst.setDouble(3,obj.getValorPeca());
            pst.setInt(4,obj.getIdEstoque());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Peça alterada com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Peça não alterada");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Peça não alterada. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Estoque obj){
        String sql = "delete from estoque where idEstoque=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdEstoque());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Peça removida com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Peça não removida");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Peça não removida. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public Estoque localizar(Integer id){
       String sql = "select * from estoque where idEstoque=?";
       Estoque obj = new Estoque();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdEstoque(rs.getInt("idEstoque"));
               obj.setNomePeca(rs.getString("nomePeca"));
               obj.setQuantidadePeca(rs.getInt("quantidadePeca"));
               obj.setValorPeca(rs.getDouble("valorPeca"));             
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
}
