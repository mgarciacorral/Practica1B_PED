import EstructurasDatos.Lineales.*;
import java.util.Scanner;

public class Menu
{
    LEGConUltimoEC<Integer> lista;
    public Menu()
    {
        this.lista = new LEGConUltimoEC<Integer>();
        ejecutar();
    }

    public void ejecutar()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0)
        {
            System.out.println("\t\tMENU\n");
            System.out.println("1. Crear nueva lista de elementos enteros(se borrara la anterior)");
            System.out.println("2. Añadir elementos a la lista");
            System.out.println("3. Borrar el minimo");
            System.out.println("4. Mover cabeza de la lista a la cola");
            System.out.println("5. Insertar nodos centinela\n");
            System.out.println("0. Salir");
            System.out.print("\nIntroduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                    crearLista();
                    break;
                case 2:
                    anadirElementos();
                    break;
                case 3:
                    borrarMinimo();
                    break;
                case 4:
                    moverCabeza();
                    break;
                case 5:
                    insertarCentinelas();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private void pulseIntro()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulse intro para continuar");
        sc.nextLine();
    }

    private void crearLista()
    {
        System.out.println("\t\tCREAR LISTA\n");
        lista = new LEGConUltimoEC<Integer>();
        System.out.println("**Lista creada**\n");
        pulseIntro();
    }

    private void anadirElementos()
    {
        System.out.println("\t\tAÑADIR ELEMENTOS\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce elementos a añadir y -1 para terminar: ");
        int elemento = sc.nextInt();
        while (elemento != -1)
        {
            lista.append(elemento);
            elemento = sc.nextInt();
        }

        System.out.println("Actualmente la lista es: ");
        lista.toStringIterativo();
        System.out.println();
        pulseIntro();
    }

    private void borrarMinimo()
    {
        System.out.println("\t\tBORRAR MINIMO\n");
        lista.borrarMinimo();
        System.out.println("El minimo ha sido borrado");
        System.out.print("Actualmente la lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }

    private void moverCabeza()
    {
        System.out.println("\t\tMOVER CABEZA A LA COLA\n");
        System.out.println("La cabeza ha sido movida a la cola");
        System.out.print("Originalmente la lista era: ");
        lista.toStringRecursivo();
        lista.moverCabeza();
        System.out.print("Actualmente la lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }

    private void insertarCentinelas()
    {
        System.out.println("\t\tINSERTAR CENTINELAS\n");
        System.out.println("Centinelas insertados");
        System.out.print("Originalmente la lista era: ");
        lista.toStringRecursivo();
        lista.insertarCentinelas();
        System.out.print("Actualmente la lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }
}
