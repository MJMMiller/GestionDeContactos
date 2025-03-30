package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private GregorianCalendar fechaDeNacimiento;

    public Persona(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaDeNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {}

    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) { this.fechaDeNacimiento = fechaDeNacimiento; }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public GregorianCalendar getFechaDeNacimiento() { return fechaDeNacimiento; }

    public int calcularEdad() {
        if (fechaDeNacimiento == null) return -1;
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaDeNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        return "\tCedula: " + cedula +
                "\n\tNombre: " + nombre +
                "\n\tApellido: " + apellido +
                "\n\tDireccion: " + direccion +
                "\n\tEdad: " + calcularEdad();
    }
}