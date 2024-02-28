package EstructurasDatos.Lineales;

import EstructurasDatos.Modelos.I_ListaConUltimoEC;

public class LEGConUltimoEC<E extends Number> extends LEGConUltimo<E> implements I_ListaConUltimoEC<E>
{
    public LEGConUltimoEC()
    {
        super();
    }

    public void moverCabeza()
    {
        E aux = this.head.getSiguiente().getElemento();
        this.remove(0);
        this.append(aux);
    }

    public void borrarMinimo()
    {
        NodoLEG<E> actual = this.head.getSiguiente();
        NodoLEG<E> anterior = this.head;
        NodoLEG<E> minimo = actual;
        NodoLEG<E> anteriorMinimo = anterior;
        while (actual != null)
        {
            if ((int)actual.getElemento() < (int)minimo.getElemento())
            {
                minimo = actual;
                anteriorMinimo = anterior;
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (minimo != null && minimo.getSiguiente() != null) {
            anteriorMinimo.setSiguiente(minimo.getSiguiente());
        }
        else
        {
            anteriorMinimo.setSiguiente(null);
        }
    }

    public void insertarCentinelas()
    {
        if((int)ultimo.getElemento()%2 == 0)
        {
            NodoLEG<E> actual = this.head.getSiguiente();

            while(actual != null)
            {
                if((int)actual.getElemento()%2 == 0)
                {
                    NodoLEG<E> aux = actual.getSiguiente();
                    actual.setSiguiente(new NodoLEG<E>((E) new Integer(-12)));
                    actual.getSiguiente().setSiguiente(aux);
                    actual = actual.getSiguiente().getSiguiente();
                }
                else
                {
                    actual = actual.getSiguiente();
                }
            }
        }
    }
}
