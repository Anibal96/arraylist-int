import java.util.Arrays;
/**
 * Write a description of class ArraylistInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraylistInt
{
    private int[] coleccion;

    /**
     * Constructor for objects of class ArraylistInt
     */
    public ArraylistInt()
    {
        coleccion = new int[0];
    }

    /**
     * Método que añade un valor entero al final de la coleccion
     */
    public void add(int elemento)
    {
        int[] coleccion1 = new int[(coleccion.length + 1)];
        for(int cont = 0; coleccion.length > cont; cont++){
            coleccion1[cont] = coleccion[cont];
        }
        coleccion1[coleccion.length] = elemento;
        coleccion = coleccion1;
    }
    
    /**
     * Añade un elemento a la colección en la posición especificada por el parámetro
     */
    public void add(int index, int elemento)
    {
        int[] coleccion1;
        if(index <= coleccion.length && index >= 0){
            coleccion1 = new int[(coleccion.length + 1)];
            int cont;
            for (cont = 0; coleccion.length > cont && cont < index; cont++){
                coleccion1[cont] = coleccion[cont];
            }
            coleccion1[cont] = elemento;
            for (int cont1 = cont; coleccion.length > cont1; cont1++){
                coleccion1[cont+1] = coleccion[cont];
            }
            coleccion = coleccion1;
        }
    }
    
    /**
     * Vacía la colección
     */
    public void clear()
    {
        int[] coleccion1 = new int[0];
        coleccion = coleccion1;
    }
    
    /**
     * Devuelve true si la colección contiene ese elemento, false en cualquier otro caso.
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        for(int cont = 0; coleccion.length > cont && !encontrado; cont++){
            if(coleccion[cont] == elemento){
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    /**
     * Devuelve el elemento existente en la posición indicada. Si el valor de index no es válido, entonces devuelve -1
     */
    public int get(int index){
        int elemento = -1;
        if(index <= coleccion.length && index >= 0){
            elemento = coleccion[index];
        }
        return elemento;
    }
    
    /**
     * Reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element){
        if(index <= coleccion.length && index >= 0){
            coleccion[index] = element;
        }
    }
}
