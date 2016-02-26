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
            int cont = 0;
            while(coleccion.length > cont && cont < index){
                coleccion1[cont] = coleccion[cont];
                cont++;
            }
            coleccion1[cont] = elemento;
            while(coleccion.length > cont){
                coleccion1[cont+1] = coleccion[cont];
                cont++;
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
        if(index < coleccion.length && index >= 0){
            elemento = coleccion[index];
        }
        return elemento;
    }
    
    /**
     * Reemplaza el elemento en la posición index con el valor de element. Si el índice no es válido, no hace nada.
     */
    public void set(int index, int element){
        if(index < coleccion.length && index >= 0){
            coleccion[index] = element;
        }
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento){
        int elemento1 = -1;
        for(int cont = 0; coleccion.length > cont && elemento1 == -1; cont++){
            if(coleccion[cont] == elemento){
                elemento1 = cont;
            }
        }
        return elemento1;
    }
    
    /**
     * Devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty(){
        boolean empty = true;
        if(coleccion.length > 0){
            empty = false;
        }
        return empty;
    }
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index){
        int num = -1;
        int[] coleccion1;
        if(index < coleccion.length && index >= 0){
            coleccion1 = new int[(coleccion.length - 1)];
            int cont = 0;
            while(coleccion.length > cont && cont < index){
                coleccion1[cont] = coleccion[cont];
                cont++;
            }
            while(coleccion.length > cont+1){
                coleccion1[cont] = coleccion[cont+1];
                cont++;
            }
            num = coleccion[index];
            coleccion = coleccion1;
        }
        return num;
    }
    
    /**
     * Devuelve el número de elementos de la colección.
     */
    public int size(){
        return coleccion.length;
    }
}
