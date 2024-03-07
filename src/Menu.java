import Librerias.EstructurasDatos.Lineales.*;
import Librerias.ExcepcionesDeUsuario.FalloEnOperacion;

import java.util.Scanner;

public class Menu
{
    LEGConUltimoEC<Integer> lista;
    public Menu() throws FalloEnOperacion {
        this.lista = new LEGConUltimoEC<Integer>();
        ejecutar();
    }

    public void ejecutar() throws FalloEnOperacion {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0)
        {
            System.out.println("\t\tMENU\n");
            System.out.println("1. Crear nueva lista de elementos enteros(se borrara la anterior)");
            System.out.println("2. Añadir elementos a la lista");
            System.out.println("3. Borrar el minimo");
            System.out.println("4. Mover cabeza de la lista a la cola");
            System.out.println("5. Insertar nodos centinela (con referencia al ultimo)");
            System.out.println("6. Insertar nodos centinela (sin referencia al ultimo)");
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
                    insertarCentinelasConUltimo();
                    break;
                case 6:
                    insertarCentinelasSinUltimo();
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
            try
            {
                lista.append(elemento);
                elemento = sc.nextInt();
            }catch(Exception e)
            {
                System.out.println("Solo numeros enteros son validos.");
                return;
            }
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

    private void moverCabeza() throws FalloEnOperacion {
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

    private void insertarCentinelasConUltimo()
    {
        System.out.println("\t\tINSERTAR CENTINELAS\n");
        System.out.println("Centinelas insertados");
        System.out.print("Originalmente la lista era: ");
        lista.toStringRecursivo();
        lista.insertarCentinelasConUltimo();
        System.out.print("Actualmente la lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }

    private void insertarCentinelasSinUltimo()
    {
        System.out.println("\t\tINSERTAR CENTINELAS\n");
        System.out.println("Centinelas insertados");
        System.out.print("Originalmente la lista era: ");
        lista.toStringRecursivo();
        lista.insertarCentinelasSinUltimo();
        System.out.print("Actualmente la lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }
}
