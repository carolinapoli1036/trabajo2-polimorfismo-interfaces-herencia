package com.ces2.trabajo2.modelo;

import com.ces2.trabajo2.modelo.interfaces.HabitacionService;

import java.util.List;

public class Futurista implements HabitacionService {

    private String nombre;
    private List<Decoracion> decoraciones;

    public Futurista(String nombre, List<Decoracion> decoraciones) {
        this.nombre = nombre;
        this.decoraciones = decoraciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public List<Decoracion> getDecoraciones() {
        return decoraciones;
    }

    @Override
    public String decorar(List<Decoracion> decoraciones) {
        return nombre + " (Futurista): se aplica una decoracion con materiales innovadores y lineas futuristas, con "
                + decoraciones.size() + " elementos de decoracion registrados.";
    }

    @Override
    public String iluminar(List<Decoracion> decoraciones) {
        return nombre + " (Futurista): se instalan luces LED inteligentes sobre los "
                + decoraciones.size() + " elementos registrados.";
    }

    @Override
    public String organizar(List<Decoracion> decoraciones) {
        return nombre + " (Futurista): se organiza el espacio con mobiliario modular entre los "
                + decoraciones.size() + " elementos registrados.";
    }
}