package bo.gob.oruro.rrhh.model;

public class sub_area {
    public Integer cod;
    public String sigla;
    public String nombre;
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
    public String getPartida_presupuestaria() {
        return partida_presupuestaria;
    }
    public void setPartida_presupuestaria(String partida_presupuestaria) {
        this.partida_presupuestaria = partida_presupuestaria;
    }
    public String getAdministracion() {
        return administracion;
    }
    public void setAdministracion(String administracion) {
        this.administracion = administracion;
    }
    public Integer getActivo() {
        return activo;
    }
    public void setActivo(Integer activo) {
        this.activo = activo;
    }
    public Integer getRel() {
        return rel;
    }
    public void setRel(Integer rel) {
        this.rel = rel;
    }
    public String partida_presupuestaria;
    public String administracion;
    public Integer activo;
    public Integer rel;
}
