package net.salesianos.pokedex;

import java.util.ArrayList;
import java.util.Scanner;

import net.salesianos.pokemones.Pokemon;

public class CustomPokedex {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Bienvenido a CustomPokedex!");

        ArrayList<Pokemon> avistados = new ArrayList<Pokemon>();
        ArrayList<Pokemon> capturados = new ArrayList<Pokemon>();

        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("f")) {
            System.out.println("\nMenu de interaccion:");
            System.out.println("a) Añadir un pokemon avistado");
            System.out.println("b) Añadir avistamiento legendario");
            System.out.println("c) Pasar a capturados");
            System.out.println("d) Mostrar lista de avistados");
            System.out.println("e) Mostrar lista de caputrados");
            System.out.println("f) Cerrar la Pokédex");
            System.out.println("Selecciona una opción");
            opcion = teclado.nextLine();
        }
    }
}
