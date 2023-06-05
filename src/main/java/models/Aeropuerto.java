package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public class Aeropuerto {
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("activo")
    private boolean activo;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("imagen")
    private String imagen;

    @JsonProperty("capacidad")
    private int capacidad;

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("acerca")
    private String acerca;
    @JsonProperty("fecha_inicio")
    private String fecha_inicio;
    @JsonProperty("latitud")
    private double latitud;
    @JsonProperty("longitud")
    private double longitud;
    @JsonProperty("aviones")
    private List<Avion> aviones;
    @JsonProperty("etiquetas")
    private List<String> etiquetas;

        public Aeropuerto() {
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public boolean isActivo() {
            return activo;
        }

        public void setActivo(boolean activo) {
            this.activo = activo;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public Integer getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(Integer capacidad) {
            this.capacidad = capacidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getAcerca() {
            return acerca;
        }

        public void setAcerca(String acerca) {
            this.acerca = acerca;
        }

        public String getFecha_inicio() {
            return fecha_inicio;
        }

        public void setFecha_inicio(String fecha_inicio) {
            this.fecha_inicio = fecha_inicio;
        }

        public double getLatitud() {
            return latitud;
        }

        public void setLatitud(double latitud) {
            this.latitud = latitud;
        }

        public double getLongitud() {
            return longitud;
        }

        public void setLongitud(double longitud) {
            this.longitud = longitud;
        }

        public List<Avion> getAviones() {
            return aviones;
        }

        public void setAviones(List<Avion> aviones) {
            this.aviones = aviones;
        }

        public List<String> getEtiquetas() {
            return etiquetas;
        }

        public void setEtiquetas(List<String> etiquetas) {
            this.etiquetas = etiquetas;
        }

        @Override
        public String toString() {
            return "Aeropuerto{" +
                    "_id='" + _id + '\'' +
                    ", activo=" + activo +
                    ", balance='" + balance + '\'' +
                    ", imagen='" + imagen + '\'' +
                    ", capacidad=" + capacidad +
                    ", nombre='" + nombre + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", direccion='" + direccion + '\'' +
                    ", acerca='" + acerca + '\'' +
                    ", fecha_inicio='" + fecha_inicio + '\'' +
                    ", latitud=" + latitud +
                    ", longitud=" + longitud +
                    ", aviones=" + aviones +
                    ", etiquetas=" + etiquetas +
                    '}';
        }
    }
