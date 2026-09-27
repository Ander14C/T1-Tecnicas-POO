package hospital;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rpta = "S";

        while (rpta.equalsIgnoreCase("s")) {
            Pacientes p1 = new Pacientes();

            try {
                System.out.println("Ingrese tipo de documento (DNI / C.E):");
                String tipo = sc.nextLine();
                p1.setTipo_documento(tipo);

                System.out.println("Ingrese numero de documento:");
                String numero = sc.nextLine();
                p1.setNro_documento(numero);

                System.out.println("Ingrese su nombre:");
                String nomb = sc.nextLine();
                p1.setNombre(nomb);

                System.out.println("Ingrese apellido paterno:");
                String pat = sc.nextLine();
                p1.setApe_paterno(pat);

                System.out.println("Ingrese apellido materno:");
                String mat = sc.nextLine();
                p1.setApe_materno(mat);

                System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD):");
                String nacimiento = sc.nextLine();
                p1.setFecha_nacimiento(LocalDate.parse(nacimiento));

                System.out.println("Ingrese su tipo de sangre:");
                String tp_sangre = sc.nextLine();
                p1.setTipo_sangre(tp_sangre);

                System.out.println("Usted tiene alguna alergia? (Si no tiene, escriba 'Ninguna'):");
                String alergia = sc.nextLine();
                p1.setAlergias(alergia);

                System.out.println("Ingrese su teléfono:");
                String telefono = sc.nextLine();
                p1.setTelefono(telefono);

                System.out.println("Ingrese su correo:");
                String correo = sc.nextLine();
                p1.setCorreo(correo);

                System.out.println("\n--- DATOS REGISTRADOS ---");
                p1.VerDatos();

            } catch (DateTimeParseException e) {
                System.out.println("Error de formato: La fecha debe tener el formato AAAA-MM-DD (Ejemplo: 2000-05-15).");
            } catch (Exception e) {
                System.out.println("Error de validación: " + e.getMessage());
            }

            System.out.println("\nDesea ingresar otra persona? s/n");
            rpta = sc.nextLine();
        }

        sc.close();
    }
}