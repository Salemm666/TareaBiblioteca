package tarea3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaEstudiantes lista = new ListaEstudiantes();

        int opcion;

        do {
            System.out.println("\n              M E N U           ");
            System.out.println("  1: Agregar estudiante           ");
            System.out.println("  2: Mostrar estudiantes          ");
            System.out.println("  3: Eliminar estudiante          ");
            System.out.println("  4: Salir del programa           ");

            System.out.print("\nSeleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("\nNombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Codigo: ");
                    int codigo = scanner.nextInt();

                    System.out.print("Promedio: ");
                    double promedio = scanner.nextDouble();

                    Estudiante estudiante = new Estudiante(nombre, codigo, promedio);
                    lista.agregar(estudiante);

                    System.out.println("Estudiante agregado correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- ESTUDIANTES ---");
                    lista.mostrarTodos();
                    break;

                case 3:
                    System.out.print("Ingrese el codigo del estudiante que desea eliminar: ");
                    int codigoEliminar = scanner.nextInt();

                    lista.eliminarPorCodigo(codigoEliminar);

                    System.out.println("Estudiante eliminado.");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}