package bo.gob.oruro.rrhh.model;

public class area {
    public Integer cod;
    public Integer getCod() {
        return cod;
    }
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getActivo() {
        return activo;
    }
    public void setActivo(Integer activo) {
        this.activo = activo;
    }
    public String getApertura_programatica() {
        return apertura_programatica;
    }
    public void setApertura_programatica(String apertura_programatica) {
        this.apertura_programatica = apertura_programatica;
    }
    public String sigla;
    public String nombre;
    public Integer activo;
    public String apertura_programatica;
}
