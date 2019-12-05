package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author CelsoAugusto
 */
public class Tecnico implements Serializable {

    private Integer idTecnico;
    private String nomeTecnico,cpfTecnico,rgTecnico,especialidadeTecnico;
    private String ruaTecnico,numeroCasaTecnico,bairroTecnico,cidadeTecnico;
    private String ufTecnico,emailTecnico,carteiraTrabalho,telefoneTecnico;
    private Double salario;

    public String getTelefoneTecnico() {
        return telefoneTecnico;
    }

    public void setTelefoneTecnico(String telefoneTecnico) {
        this.telefoneTecnico = telefoneTecnico;
    }

    public String getRuaTecnico() {
        return ruaTecnico;
    }

    public void setRuaTecnico(String ruaTecnico) {
        this.ruaTecnico = ruaTecnico;
    }

    public String getNumeroCasaTecnico() {
        return numeroCasaTecnico;
    }

    public void setNumeroCasaTecnico(String numeroCasaTecnico) {
        this.numeroCasaTecnico = numeroCasaTecnico;
    }

    public String getBairroTecnico() {
        return bairroTecnico;
    }

    public void setBairroTecnico(String bairroTecnico) {
        this.bairroTecnico = bairroTecnico;
    }

    public String getCidadeTecnico() {
        return cidadeTecnico;
    }

    public void setCidadeTecnico(String cidadeTecnico) {
        this.cidadeTecnico = cidadeTecnico;
    }

    public String getUfTecnico() {
        return ufTecnico;
    }

    public void setUfTecnico(String ufTecnico) {
        this.ufTecnico = ufTecnico;
    }

    public String getEmailTecnico() {
        return emailTecnico;
    }

    public void setEmailTecnico(String emailTecnico) {
        this.emailTecnico = emailTecnico;
    }
    
    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getCpfTecnico() {
        return cpfTecnico;
    }

    public void setCpfTecnico(String cpfTecnico) {
        this.cpfTecnico = cpfTecnico;
    }

    public String getRgTecnico() {
        return rgTecnico;
    }

    public void setRgTecnico(String rgTecnico) {
        this.rgTecnico = rgTecnico;
    }

    public String getEspecialidadeTecnico() {
        return especialidadeTecnico;
    }

    public void setEspecialidadeTecnico(String especialidadeTecnico) {
        this.especialidadeTecnico = especialidadeTecnico;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Tecnico(){
        
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idTecnico);
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
        final Tecnico other = (Tecnico) obj;
        if (!Objects.equals(this.idTecnico, other.idTecnico)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
       return nomeTecnico;
   }
    
}
