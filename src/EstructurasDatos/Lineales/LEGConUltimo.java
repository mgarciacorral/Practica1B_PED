package EstructurasDatos.Lineales;

import EstructurasDatos.Modelos.I_ListaConUltimo;

public class LEGConUltimo<E> extends LEG<E> implements I_ListaConUltimo<E>
{
    private NodoLEG<E> ultimo;

    public LEGConUltimo()
    {
        super();
        this.ultimo = new NodoLEG<E>(null);
    }

    public void append(E elemento)
    {
        NodoLEG<E> nuevo = new NodoLEG<E>(elemento);
        this.ultimo.setSiguiente(nuevo);
        this.ultimo = nuevo;
    }

    public E getUltimo()
    {
        return this.ultimo.getElemento();
    }
}
