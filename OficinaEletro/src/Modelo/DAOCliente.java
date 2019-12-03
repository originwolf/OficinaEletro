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
 * @author pedri
 */
public class DAOCliente {
    
    public List<Cliente> getLista() {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setIdCliente(rs.getInt("idCliente"));
                obj.setNomeCliente(rs.getString("nomeCliente"));
                obj.setTelefoneCliente(rs.getString("telefoneCliente"));
                obj.setCpfCliente(rs.getString("cpfCliente"));
                obj.setEmailCliente(rs.getString("emailCliente"));
                obj.setRuaCliente(rs.getString("ruaCliente"));
                obj.setBairroCliente(rs.getString("bairroCliente"));
                obj.setCidadeCliente(rs.getString("cidadeCliente"));
                obj.setNumeroCasaCliente(rs.getString("numeroCasaCliente"));
                obj.setUfCliente(rs.getString("ufCliente"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Cliente obj) {
        if (obj.getIdCliente() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }

    public boolean incluir(Cliente obj){
        String sql = "Insert into cliente(nomeCliente,telefoneCliente,cpfCliente,emailCliente,ruaCliente,bairroCliente,cidadeCliente,ufCliente,numeroCasaCliente) values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getTelefoneCliente());
            pst.setString(3, obj.getCpfCliente());
            pst.setString(4, obj.getEmailCliente());
            pst.setString(5, obj.getRuaCliente());
            pst.setString(6, obj.getBairroCliente());
            pst.setString(7, obj.getCidadeCliente());
            pst.setString(8, obj.getUfCliente());
            pst.setString(9, obj.getNumeroCasaCliente());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Cliente Adicionado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não adicionado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Cliente obj){
        String sql = "Update cliente set nomeCliente = ?, telefoneCliente=?, cpfCliente=?, emailCliente=?, ruaCliente=?, bairroCliente=?, cidadeCliente=?, ufCliente=?, numeroCasaCliente=? where idCliente=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomeCliente());
            pst.setString(2,obj.getTelefoneCliente());
            pst.setString(3,obj.getCpfCliente());
            pst.setString(4,obj.getEmailCliente());
            pst.setString(5,obj.getRuaCliente());
            pst.setString(6,obj.getBairroCliente());
            pst.setString(7,obj.getCidadeCliente());
            pst.setString(8,obj.getUfCliente());
            pst.setString(9, obj.getNumeroCasaCliente());
            pst.setInt(10, obj.getIdCliente());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não alterado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Cliente não alterado. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Cliente obj){
        String sql = "delete from cliente where idCliente=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdCliente());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não excluído");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Cliente não excluído. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public Cliente localizar(Integer id){
       String sql = "select * from cliente where idCliente=?";
       Cliente obj = new Cliente();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdCliente(rs.getInt("idCliente"));
               obj.setNomeCliente(rs.getString("nomeCliente"));
               obj.setTelefoneCliente(rs.getString("telefoneCliente"));
               obj.setCpfCliente(rs.getString("cpfCliente"));
               obj.setRuaCliente(rs.getString("ruaCliente"));
               obj.setNumeroCasaCliente(rs.getString("numeroCasaCliente"));
               obj.setBairroCliente(rs.getString("bairroCliente"));
               obj.setCidadeCliente(rs.getString("cidadeCliente"));
               obj.setUfCliente(rs.getString("ufCliente"));
               obj.setEmailCliente(rs.getString("emailCliente"));
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
}
