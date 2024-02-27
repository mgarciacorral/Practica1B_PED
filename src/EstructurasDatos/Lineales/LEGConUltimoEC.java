package EstructurasDatos.Lineales;

import EstructurasDatos.Modelos.I_ListaConUltimoEC;

public class LEGConUltimoEC<E extends Comparable<E>> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E>
{
    public LEGConUltimoEC()
    {
        super();
    }

    public void moverCabeza()
    {
        E aux = this.get(0);
        this.remove(0);
        this.append(aux);
    }
}
