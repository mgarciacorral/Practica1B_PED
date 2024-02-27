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
            if (actual.getElemento().compareTo(minimo.getElemento()) < 0)
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
                if(actual.getElemento()%2 == 0)
                {
                    try
                    {
                        NodoLEG<Integer> centinela = new NodoLEG<Integer>(-12);
                        centinela.setSiguiente((NodoLEG<Integer>)actual.getSiguiente());
                        actual.setSiguiente((NodoLEG<E>)centinela);
                    }catch(Exception e)
                    {
                        System.out.println("Este metodo solo funciona en listas de enteros");
                    }
                }
                actual = actual.getSiguiente();
            }
        }
    }
}
