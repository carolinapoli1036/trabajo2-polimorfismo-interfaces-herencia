package com.ces2.trabajo2.modelo;

import com.ces2.trabajo2.modelo.interfaces.HabitacionService;

import java.util.List;

public class Minimalista implements HabitacionService {

    private String nombre;
    private List<Decoracion> decoraciones;

    public Minimalista(String nombre, List<Decoracion> decoraciones) {
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
        return nombre + " (Minimalista): se aplica una decoracion sobria y funcional, con "
                + decoraciones.size() + " elementos de decoracion registrados.";
    }

    @Override
    public String iluminar(List<Decoracion> decoraciones) {
        return nombre + " (Minimalista): se prioriza luz natural y puntos de luz discretos sobre los "
                + decoraciones.size() + " elementos registrados.";
    }

    @Override
    public String organizar(List<Decoracion> decoraciones) {
        return nombre + " (Minimalista): se organiza el espacio dejando areas libres entre los "
                + decoraciones.size() + " elementos registrados.";
    }
}