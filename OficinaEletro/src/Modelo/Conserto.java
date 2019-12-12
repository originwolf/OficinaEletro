package Modelo;

import java.util.Objects;

/**
 *
 * @author CelsoAugusto
 */
public class Conserto {
    
    private Integer idConserto;
    private Double precoConserto;
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
