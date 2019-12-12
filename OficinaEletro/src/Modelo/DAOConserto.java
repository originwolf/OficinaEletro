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
