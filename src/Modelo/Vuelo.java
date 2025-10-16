package Modelo;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHora;
    private int cantidadPasajeros;

    public Vuelo(){
    }

    public Vuelo(String nombre, String origen, String destino, Date fechaHora, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFecha_hora() {
        return fechaHora;
    }

    public int getCantidad_pasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaHora=" + fechaHora +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
