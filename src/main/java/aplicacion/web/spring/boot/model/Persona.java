package aplicacion.web.spring.boot.model;


public class Persona {

    /** PROPIEDADES */
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String profesion;
    private Boolean estado;

    public Persona(){}
    public Persona(Integer id_, String nombre_, String apellido_, Integer edad_, String profesion_,Boolean estado_) {
        id = id_;
        nombre = nombre_;
        apellido = apellido_;
        edad = edad_;
        profesion = profesion_;
        estado = estado_;
    }
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public Boolean isEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
