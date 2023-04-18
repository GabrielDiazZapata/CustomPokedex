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



}
