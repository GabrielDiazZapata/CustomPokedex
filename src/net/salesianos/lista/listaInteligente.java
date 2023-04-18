package net.salesianos.lista;
import java.util.Arrays;

import net.salesianos.pokemones.pokemon;
public class listaInteligente {
private pokemon[] lista;
private int cantidad;

public listaInteligente() {
    lista = new pokemon[1];
    cantidad = 0;
}

public void agregarPokemon(pokemon p) {
    if(cantidad == lista.length) {
        lista = Arrays.copyOf(lista, lista.length * 2);
    }
    lista[cantidad] = p;
    cantidad++;
    System.out.println("Pokemon agregado correctamente gracias por nada bobo.");
}

public void eliminarPokemon(String Nombre) {
    for (int i = 0; i < cantidad; i++) {
        if(lista[i].getNombre().equals(Nombre)) {
            for(int j = i; j < cantidad - 1; j++) {
                lista[j] = lista[j + 1];
            }
            cantidad--;
            lista[cantidad] = null;
            System.out.println("Pokemon eliminado correctamente ahora creame otro soplagaitas, y mas te vale que sea bueno.");
            return;
        }
    }
    System.out.println("No se encontró el Pokemon en la lista, aprende a escribir.");

}



}
