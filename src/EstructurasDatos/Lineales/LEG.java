package EstructurasDatos.Lineales;

public class LEG<E>
{
    protected NodoLEG<E> head;
    protected int size;

    public LEG()
    {
        this.head = new NodoLEG<E>(null);
        this.size = 0;
    }

    public void add(E elemento)
    {
        NodoLEG<E> nuevo = new NodoLEG<E>(elemento);
        nuevo.setSiguiente(head.getSiguiente());
        head.setSiguiente(nuevo);
        size++;
    }

    public void append(E elemento)
    {
        NodoLEG<E> nuevo = new NodoLEG<E>(elemento);
        NodoLEG<E> actual = head;
        while (actual.getSiguiente() != null)
        {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
        size++;
    }

    public int getSize()
    {
        return size;
    }

    public E get(int index)
    {
        if (index <= 0 || index >= size)
        {
            return null;
        }
        NodoLEG<E> actual = head.getSiguiente();
        for (int i = 1; i < index; i++)
        {
            if (actual.getSiguiente() == null)
            {
                return null;
            }
            actual = actual.getSiguiente();
        }
        return actual.getElemento();
    }

    public void remove(int index)
    {
        if (index < 0 || index > size)
        {
            return;
        }
        NodoLEG<E> actual = head;
        for (int i = 0; i < index; i++)
        {
            if (actual.getSiguiente() == null)
            {
                return;
            }
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        size--;
    }

    public void toStringIterativo()
    {
        NodoLEG<E> actual = head.getSiguiente();
        while (actual != null)
        {
            System.out.print(actual.getElemento() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void toStringRecursivo()
    {
        head.toStringRecursivo();
        System.out.println();
    }

    public void toStringInversoIterativo()
    {
        String resultado = "";
        NodoLEG<E> actual = head.getSiguiente();
        while (actual != null)
        {
            resultado = actual.getElemento() + " " + resultado;
            actual = actual.getSiguiente();
        }
        System.out.println(resultado);
    }

    public void toStringInversoRecursivo()
    {
        System.out.println(head.toStringInversoRecursivo(""));
    }

    public boolean contains(E elemento)
    {
        NodoLEG<E> actual = head.getSiguiente();
        while (actual != null)
        {
            if (actual.getElemento().equals(elemento))
            {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}
