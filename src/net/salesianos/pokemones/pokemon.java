package net.salesianos.pokemones;
public class pokemon {
    private String Nombre;
    private String Tipo;
    private double Altura;
    private double Peso;
    private String Descripcion;


    public pokemon(String Nombre, String Tipo, double Altura, double Peso, String Descripcion){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Descripcion = Descripcion;
    }

    public pokemon(String Nombre, String Tipo){
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(Nombre != null? Nombre : "???").append("\n");
        sb.append("Tipo: ").append(Tipo != null ? Tipo : "???").append("\n");
        sb.append("Altura: ").append(Altura > 0 ? Altura + "m" : "???").append("\n");
        sb.append("Peso: ").append(Peso > 0 ? Peso + "kg" : "???").append("\n");
        sb.append("Descripción: ").append(Descripcion != null ? Descripcion : "???").append("\n");
        return sb.toString();
        
    }

}
