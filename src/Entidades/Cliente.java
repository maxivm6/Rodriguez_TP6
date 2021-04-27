package Entidades;


public class Cliente {
    
    protected String nombre,apellido,ciudad,direccion;
    protected long dni;
    
    public Cliente(long dni,String apellido,String nombre,String ciudad,String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.ciudad=ciudad;
        this.direccion=direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
}
