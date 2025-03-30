package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int nPersonas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de familiares: ");
        int nFamiliares = scanner.nextInt();

        scanner.nextLine();

        Persona[] personas = new Persona[nPersonas];
        Familiar[] familiares = new Familiar[nFamiliares];

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Persona " + (i + 1));

            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Ingrese el año de nacimiento: ");
            int anio = scanner.nextInt();
            System.out.print("Ingrese el mes de nacimiento: ");
            int mes = scanner.nextInt();
            System.out.print("Ingrese el dia de nacimiento: ");
            int dia = scanner.nextInt();
            scanner.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);
            personas[i] = new Persona(cedula, nombre, apellido, direccion, fechaNacimiento);
        }

        for (int i = 0; i < nFamiliares; i++) {
            System.out.println("Familiar " + (i + 1));

            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();

            System.out.println("Ingrese la fecha de nacimiento (Año, Mes, Día): ");
            int anio = scanner.nextInt();
            int mes = scanner.nextInt();
            int dia = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoDeSangre = scanner.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, fechaNacimiento, parentesco, tipoDeSangre);
        }

        System.out.println("\nInformación de las personas ingresadas:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        System.out.println("\nInformación de los familiares ingresados:");
        for (Familiar f : familiares) {
            System.out.println(f);
        }

        scanner.close();
    }
}