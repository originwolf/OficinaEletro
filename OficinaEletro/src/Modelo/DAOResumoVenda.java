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
 * @author pedro.martins
 */
public class DAOResumoVenda {
    
    DAOCliente daoCliente = new DAOCliente();
    DAOAparelho daoAparelho = new DAOAparelho();
    DAOVenda daoVenda = new DAOVenda();
    
    public List<ResumoVenda> getLista() {
        String sql = "select * from resumo";
        List<ResumoVenda> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Calendar cal = Calendar.getInstance();
                ResumoVenda obj = new ResumoVenda();
                obj.setIdCliente(daoCliente.localizarId(rs.getInt("Cliente_idCliente")));
                obj.setIdAparelho(daoAparelho.localizarId(rs.getInt("Aparelho_idAparelho")));
                obj.setIdVenda(daoVenda.localizarId(rs.getInt("Venda_idVenda")));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL in DAO Locate: " + ex.getMessage());
        }
        return lista;
    }
    
    public ResumoVenda localizar(Integer id){
       String sql = "select * from resumo where idResumo=?";
       ResumoVenda obj = new ResumoVenda();
       try{
           PreparedStatement pst = Conexao.getPreparedStatemnt(sql);
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               obj.setIdResumo(rs.getInt("idResumo"));              
               return obj;
           }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de SQL: "+e.getMessage());
       }
       return null;
   }
    
}
