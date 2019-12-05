package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Josi
 */
public class Estoque implements Serializable{

    private Integer idEstoque, quantidadePeca;
    private Double valorPeca;
    private String nomePeca;

    public Integer getQuantidadePeca() {
        return quantidadePeca;
    }

    public void setQuantidadePeca(Integer quantidadePeca) {
        this.quantidadePeca = quantidadePeca;
    }
    
    public Estoque(){
        
    }
    
    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(Double valorPeca) {
        this.valorPeca = valorPeca;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idEstoque);
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
        final Estoque other = (Estoque) obj;
        if (!Objects.equals(this.idEstoque, other.idEstoque)) {
            return false;
        }
        return true;
    }
     
    @Override
    public String toString(){
       return nomePeca;
   }
    
}
