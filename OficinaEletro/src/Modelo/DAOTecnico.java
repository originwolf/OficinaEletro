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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pedri
 */
public class DAOTecnico {
    
    public List<Tecnico> getLista() {
        String sql = "select * from tecnico";
        List<Tecnico> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Tecnico obj = new Tecnico();
                obj.setIdTecnico(rs.getInt("idTecnico"));
                obj.setNomeTecnico(rs.getString("nomeTecnico"));
                obj.setCpfTecnico(rs.getString("cpfTecnico"));
                obj.setRgTecnico(rs.getString("rgTecnico"));
                obj.setEspecialidadeTecnico(rs.getString("especialidadeTecnico"));
                obj.setSalario(rs.getDouble("salarioTecnico"));
                obj.setCarteiraTrabalho(rs.getString("carteiraTrabalho"));
                obj.setRuaTecnico((rs.getString("ruaTecnico")));
                obj.setNumeroCasaTecnico((rs.getString("numeroCasaTecnico")));
                obj.setBairroTecnico((rs.getString("bairroTecnico")));
                obj.setCidadeTecnico((rs.getString("cidadeTecnico")));
                obj.setUfTecnico((rs.getString("ufTecnico")));
                obj.setEmailTecnico((rs.getString("emailTecnico")));
                obj.setTelefoneTecnico((rs.getString("telefoneTecnico")));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL " + ex.getMessage());
        }
        return lista;
    }
    
    public boolean salvar(Tecnico obj) {
        if (obj.getIdTecnico() == null) {
            return incluir(obj);
        }else{
            return alterar(obj);
        }
    }
    
    public boolean incluir(Tecnico obj){
        String sql = "Insert into tecnico(nomeTecnico,cpfTecnico,rgTecnico,especialidadeTecnico,carteiraTrabalho,salarioTecnico,ruaTecnico,numeroCasaTecnico,bairroTecnico,cidadeTecnico,ufTecnico,emailTecnico,telefoneTecnico) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomeTecnico());
            pst.setString(2,obj.getCpfTecnico());
            pst.setString(3,obj.getRgTecnico());
            pst.setString(4,obj.getEspecialidadeTecnico());
            pst.setString(5,obj.getCarteiraTrabalho());
            pst.setDouble(6, obj.getSalario());
            pst.setString(7,obj.getRuaTecnico());
            pst.setString(8,obj.getNumeroCasaTecnico());
            pst.setString(9,obj.getBairroTecnico());
            pst.setString(10,obj.getCidadeTecnico());
            pst.setString(11,obj.getUfTecnico());
            pst.setString(12,obj.getEmailTecnico());
            pst.setString(13,obj.getTelefoneTecnico());
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Técnico cadastrado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Técnico não cadastrado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Tecnico obj){
        String sql = "Update tecnico set nomeTecnico=?,cpfTecnico=?,rgTecnico=?,especialidadeTecnico=?,carteiraTrabalho=?,salarioTecnico=?,ruaTecnico=?,numeroCasaTecnico=?,bairroTecnico=?,cidadeTecnico=?,ufTecnico=?,emailTecnico=?,telefoneTecnico=? where idTecnico=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setString(1,obj.getNomeTecnico());
            pst.setString(2,obj.getCpfTecnico());
            pst.setString(3,obj.getRgTecnico());
            pst.setString(4,obj.getEspecialidadeTecnico());
            pst.setString(5,obj.getCarteiraTrabalho());
            pst.setDouble(6, obj.getSalario());
            pst.setString(7,obj.getRuaTecnico());
            pst.setString(8,obj.getNumeroCasaTecnico());
            pst.setString(9,obj.getBairroTecnico());
            pst.setString(10,obj.getCidadeTecnico());
            pst.setString(11,obj.getUfTecnico());
            pst.setString(12,obj.getEmailTecnico());
            pst.setString(13,obj.getTelefoneTecnico());
            pst.setInt(14, obj.getIdTecnico());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Técnico alterado com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Técnico não alterado");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Técnico não alterado. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public boolean remover(Tecnico obj){
        String sql = "delete from tecnico where idTecnico=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            pst.setInt(1, obj.getIdTecnico());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Técnico removido com sucesso");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Técnico não removido");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Técnico não removido. Erro de SQL "+e.getMessage());
            return false;
        }
    }
    
    public Tecnico localizar(Integer id){
       String sql = "select * from tecnico where idTecnico=?";
       Tecnico obj = new Tecnico();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdTecnico(rs.getInt("idTecnico"));
               obj.setNomeTecnico(rs.getString("nomeTecnico"));
               obj.setCpfTecnico(rs.getString("cpfTecnico"));
               obj.setRgTecnico(rs.getString("rgTecnico"));
               obj.setEspecialidadeTecnico(rs.getString("especialidadeTecnico"));
               obj.setSalario(rs.getDouble("salarioTecnico"));
               obj.setCarteiraTrabalho(rs.getString("carteiraTrabalho"));
               obj.setRuaTecnico(rs.getString("ruaTecnico"));
               obj.setNumeroCasaTecnico(rs.getString("numeroCasaTecnico"));
               obj.setBairroTecnico(rs.getString("bairroTecnico"));
               obj.setCidadeTecnico(rs.getString("cidadeTecnico"));
               obj.setUfTecnico(rs.getString("ufTecnico"));
               obj.setEmailTecnico(rs.getString("emailTecnico"));
               obj.setTelefoneTecnico(rs.getString("telefoneTecnico"));
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
}
