package bo.gob.oruro.rrhh.model;

public class cargo {
    public Integer cod;
    public Integer num_item;
    public Integer gestion_creacion;
    public String nombre;
    public String item;
    public Integer privilegio;
    public Integer salario;
    public Integer activo;
    public Integer libre;
    public Integer rel;
    public Integer getCod() {
        return cod;
    }
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Integer getNum_item() {
        return num_item;
    }
    public void setNum_item(Integer num_item) {
        this.num_item = num_item;
    }
    public Integer getGestion_creacion() {
        return gestion_creacion;
    }
    public void setGestion_creacion(Integer gestion_creacion) {
        this.gestion_creacion = gestion_creacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Integer getPrivilegio() {
        return privilegio;
    }
    public void setPrivilegio(Integer privilegio) {
        this.privilegio = privilegio;
    }
    public Integer getSalario() {
        return salario;
    }
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public Integer getActivo() {
        return activo;
    }
    public void setActivo(Integer activo) {
        this.activo = activo;
    }
    public Integer getLibre() {
        return libre;
    }
    public void setLibre(Integer libre) {
        this.libre = libre;
    }
    public Integer getRel() {
        return rel;
    }
    public void setRel(Integer rel) {
        this.rel = rel;
    }
}
