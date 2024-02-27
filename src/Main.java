import EstructurasDatos.Lineales.LEG;
import EstructurasDatos.Lineales.LEGConUltimo;
import EstructurasDatos.Lineales.LEGConUltimoEC;

public class Main {
    public static void main(String[] args)
    {
        LEGConUltimoEC<Integer> lista = new LEGConUltimoEC<Integer>();

        for(int i = 0; i < 10; i++)
        {
            lista.append(i);
        }

        lista.toStringIterativo();
        lista.remove(0);
        lista.toStringInversoIterativo();
        lista.moverCabeza();
        lista.toStringRecursivo();
        lista.toStringInversoRecursivo();
        System.out.println("Elemento en la posicion 5: " + lista.get(5));
    }
}