package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avion {
    @JsonProperty("id")
    private int id;
    @JsonProperty("piloto")
    private String piloto;
    @JsonProperty("capacidad_pasajeros")
    private int capacidad_pasajeros;

    public Avion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }
}
