package models;

import java.util.ArrayList;
import java.util.List;

public class Almacenador<T> {
    private List<T> elementos;

    public Almacenador (){
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento){
        elementos.add(elemento);
    }

    public void eliminar(int posicion){
        if(posicion >= 0 && posicion < elementos.size()){
            elementos.remove(posicion);
        }else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }

    public T recuperar(int posicion){
        if(posicion >= 0 && posicion < elementos.size()){
            return elementos.get(posicion);
        }else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }

    public List<T> getElementos() {
        return elementos;
    }
}