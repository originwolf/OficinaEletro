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
    private Aparelho idAparelho;
    private Cliente idCliente;
    private Venda idVenda;
    
    public ResumoVenda() {
        
    }

    public Integer getIdResumo() {
        return idResumo;
    }

    public void setIdResumo(Integer idResumo) {
        this.idResumo = idResumo;
    }

    public Aparelho getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Aparelho nomeAparelho) {
        this.idAparelho = nomeAparelho;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente nomeCliente) {
        this.idCliente = nomeCliente;
    }

    public Venda getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Venda dataVenda) {
        this.idVenda = idVenda;
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
