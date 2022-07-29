package model;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String numeroMobil;
    private String direccion;
    private String contraseña;
    private String preguntaSeguridad;
    private String respuesta;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroMobil() {
        return numeroMobil;
    }

    public void setNumeroMobil(String mobileNumber) {
        this.numeroMobil = mobileNumber;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String address) {
        this.direccion = address;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String password) {
        this.contraseña = password;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String answer) {
        this.respuesta = answer;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String status) {
        this.estado = status;
    }
    
    
    
    
}
