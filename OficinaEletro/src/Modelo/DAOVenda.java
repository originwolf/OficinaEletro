/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author 11171010115
 */
public class DAOVenda {
    DAOCliente daoCliente = new DAOCliente();
    public List<Venda> getLista() {
        String sql = "select * from venda";
        List<Venda> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Calendar cal = Calendar.getInstance();
                Venda obj = new Venda();
                obj.setIdVenda(rs.getInt("idVenda"));
                java.sql.Date dt = rs.getDate("dataVenda");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setDataVenda(c);
                obj.setIdCliente(daoCliente.localizar(rs.getInt("Cliente_idCliente")));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Venda obj) {
        if (obj.getIdVenda() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }
    
    public boolean incluir(Venda obj){
        String sql = "Insert into venda(idCliente, dataVenda) values(?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setDate(1, new java.sql.Date(obj.getDataVenda().getTimeInMillis()));
            pst.setInt(2, obj.getIdCliente().getIdCliente());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Venda cadastrado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Venda não cadastrada");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Venda obj){
        String sql = "Update venda set Cliente_idCliente=?, dataVenda=? where idAparelho=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdCliente().getIdCliente());
            pst.setDate(2, new java.sql.Date(obj.getDataVenda().getTimeInMillis()));
            pst.setInt(3, obj.getIdVenda());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Venda alterada com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Venda não alterada");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Venda não alterada. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Venda obj){
        String sql = "delete from venda where idVenda=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdVenda());          
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Venda removida com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Venda não removida");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Venda não removida. Erro de SQL"+e.getMessage());
            return false;
        }
    }
    
    public Venda localizar(Integer id){
       String sql = "select * from venda where idVenda=?";
       Venda obj = new Venda();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdVenda(rs.getInt("idVenda"));
               pst.setDate(1, new java.sql.Date(obj.getDataVenda().getTimeInMillis()));               
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
}
