/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author pedro.martins
 */
public class ResumoVenda {
    
    private Integer idResumo;
    private Aparelho nomeAparelho;
    private Cliente nomeCliente;
    private Venda dataVenda;
    
    public ResumoVenda() {
        
    }

    public Integer getIdResumo() {
        return idResumo;
    }

    public void setIdResumo(Integer idResumo) {
        this.idResumo = idResumo;
    }

    public Aparelho getNomeAparelho() {
        return nomeAparelho;
    }

    public void setNomeAparelho(Aparelho nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Venda getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Venda dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.idResumo);
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
        final ResumoVenda other = (ResumoVenda) obj;
        if (!Objects.equals(this.idResumo, other.idResumo)) {
            return false;
        }
        return true;
    }
    
}
