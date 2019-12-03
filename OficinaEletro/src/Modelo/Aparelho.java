/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author pedri
 */
public class Aparelho implements Serializable{
    
    private Integer idAparelho;
    private String nomeAparelho, marcaAparelho;
    private Calendar dataGarantia, dataRecebimentoAparelho;
    private Cliente idCliente;
    
    public Aparelho(){
        
    }
    
    public Calendar getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(Calendar dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    public Calendar getDataRecebimentoAparelho() {
        return dataRecebimentoAparelho;
    }

    public void setDataRecebimentoAparelho(Calendar dataRecebimentoAparelho) {
        this.dataRecebimentoAparelho = dataRecebimentoAparelho;
    }

    public Integer getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Integer idAparelho) {
        this.idAparelho = idAparelho;
    }

    public String getNomeAparelho() {
        return nomeAparelho;
    }

    public void setNomeAparelho(String nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }

    public String getMarcaAparelho() {
        return marcaAparelho;
    }

    public void setMarcaAparelho(String marcaAparelho) {
        this.marcaAparelho = marcaAparelho;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idAparelho);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aparelho other = (Aparelho) obj;
        if (!Objects.equals(this.idAparelho, other.idAparelho)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
       return nomeAparelho;
   }
    
    public String getDataRecebimentoFormatado(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataRecebimentoAparelho.getTime());
    }
    
    public String getDataGarantiaFormatado(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(dataGarantia.getTime());
    }
    
}
