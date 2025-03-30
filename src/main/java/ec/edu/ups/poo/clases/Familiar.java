package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaDeNacimiento, String parentesco, String tipoDeSangre) {
        super(cedula, nombre, apellido, direccion, fechaDeNacimiento);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }

    public String getTipoDeSangre() { return tipoDeSangre; }
    public void setTipoDeSangre(String tipoDeSangre) { this.tipoDeSangre = tipoDeSangre; }

    public int calcularEdad() { return super.calcularEdad();}

    @Override
    public String toString() {
        return super.toString() + "\n\tParentesco: " + parentesco + "\n\tTipo de Sangre: " + tipoDeSangre;
    }
}