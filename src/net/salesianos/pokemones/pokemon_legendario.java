package net.salesianos.pokemones;

public class pokemon_legendario extends pokemon {
    private String localizacion;

    public pokemon_legendario(String nombre, String tipo, double altura, double peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public pokemon_legendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        String info = super.toString();
        return info + "\nUbicación: " + (localizacion != null ? localizacion : "??");
    }
}

