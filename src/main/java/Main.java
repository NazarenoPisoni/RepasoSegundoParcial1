import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.CapacidadInsuficienteException;
import models.Aeropuerto;
import models.Almacenador;
import models.Avion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Aeropuerto[] aeropuertos = objectMapper.readValue(new File("G6UyHYt7.json"), Aeropuerto[].class);
            for(Aeropuerto aeropuerto : aeropuertos){
                System.out.println("Nombre del aeropuerto: " + aeropuerto.getNombre());
                System.out.println("Dirección del aeropuerto: " + aeropuerto.getDireccion());
                System.out.println("Teléfono del aeropuerto: " + aeropuerto.getPhone());
                System.out.println("Capacidad del aeropuerto: " + aeropuerto.getCapacidad());
            }

            try{
                List<Aeropuerto> aeropuertosMayores = pasarMayoresCapacidad(aeropuertos, 30);
                for(Aeropuerto aeropuerto : aeropuertosMayores){
                    System.out.println(aeropuerto.toString());
                }

            }catch (CapacidadInsuficienteException e){
                System.out.println("Excepción: " + e.getMessage());
                System.out.println("Capacidad del aeropuerto: " + e.getCapacidadAeropuerto());
            }

            Almacenador<String> pilotos = new Almacenador<>();
            for(Aeropuerto aeropuerto : aeropuertos){
                List<Avion> aviones = aeropuerto.getAviones();
                for(Avion avion : aviones){
                    pilotos.agregar(avion.getPiloto());
                }
            }
            System.out.println(pilotos.recuperar(4));

            Almacenador<String> etiquetas = new Almacenador<>();
            for(Aeropuerto aeropuerto : aeropuertos){
                List<String> tags = aeropuerto.getEtiquetas();
                for(String tag : tags){
                    etiquetas.agregar(tag);
                }
            }
            System.out.println(etiquetas.recuperar(2));

            HashSet<String> etiquetasUnicas = new HashSet<>();
            for(int i=0; i<etiquetas.getElementos().size(); i++){
                etiquetasUnicas.add(etiquetas.recuperar(i));
            }
            System.out.println(etiquetasUnicas);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Aeropuerto> pasarMayoresCapacidad(Aeropuerto[] aeropuertos, int capacidad)
            throws CapacidadInsuficienteException{
        List<Aeropuerto> mayores = new ArrayList<>();
        for(int i=0; i<aeropuertos.length; i++){
            if(aeropuertos[i].getCapacidad() > capacidad){
                mayores.add(aeropuertos[i]);
            }else {
                throw new CapacidadInsuficienteException("Capacidad insuficiente", aeropuertos[i].getCapacidad());
            }
        }
        return mayores;
    }
}
