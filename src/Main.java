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
        lista.moverCabeza();
        lista.moverCabeza();
        lista.moverCabeza();
        lista.borrarMinimo();
        lista.toStringIterativo();
        lista.insertarCentinelas();
        lista.toStringIterativo();
        lista.borrarMinimo();
        lista.toStringIterativo();
    }
}