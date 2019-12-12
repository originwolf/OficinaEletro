/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author pedro.martins
 */
public class Conserto {
    
    private Integer idConserto;
    private Double precoConserto;
    private Calendar DataConserto;
    private Tecnico idTecnico;
    private Aparelho idAparelho;
    
    public Conserto() {
        
    }

    public Integer getIdConserto() {
        return idConserto;
    }

    public void setIdConserto(Integer idConserto) {
        this.idConserto = idConserto;
    }

    public Double getPrecoConserto() {
        return precoConserto;
    }

    public void setPrecoConserto(Double precoConserto) {
        this.precoConserto = precoConserto;
    }

    public Calendar getDataConserto() {
        return DataConserto;
    }

    public void setDataConserto(Calendar DataConserto) {
        this.DataConserto = DataConserto;
    }

    public Tecnico getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Tecnico idTecnico) {
        this.idTecnico = idTecnico;
    }

    public Aparelho getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Aparelho idAparelho) {
        this.idAparelho = idAparelho;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.idConserto);
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
        final Conserto other = (Conserto) obj;
        if (!Objects.equals(this.idConserto, other.idConserto)) {
            return false;
        }
        return true;
    }
    
}
