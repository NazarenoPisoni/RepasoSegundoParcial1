package exceptions;

public class CapacidadInsuficienteException extends Exception{
    private int capacidadAeropuerto;

    public CapacidadInsuficienteException(String message, int capacidadAeropuerto){
        super(message);
        this.capacidadAeropuerto = capacidadAeropuerto;
    }

    public int getCapacidadAeropuerto() {
        return capacidadAeropuerto;
    }
}
