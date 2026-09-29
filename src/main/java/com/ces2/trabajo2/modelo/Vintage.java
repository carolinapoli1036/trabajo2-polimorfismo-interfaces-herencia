package com.ces2.trabajo2.modelo;

import com.ces2.trabajo2.modelo.interfaces.HabitacionService;

import java.util.List;

public class Vintage implements HabitacionService {

    private String nombre;
    private List<Decoracion> decoraciones;

    public Vintage(String nombre, List<Decoracion> decoraciones) {
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
        return nombre + " (Vintage): se aplica una decoracion con piezas de epoca y detalles retro, con "
                + decoraciones.size() + " elementos de decoracion registrados.";
    }

    @Override
    public String iluminar(List<Decoracion> decoraciones) {
        return nombre + " (Vintage): se usan lamparas de estilo antiguo con luz calida sobre los "
                + decoraciones.size() + " elementos registrados.";
    }

    @Override
    public String organizar(List<Decoracion> decoraciones) {
        return nombre + " (Vintage): se organiza el espacio conservando muebles antiguos entre los "
                + decoraciones.size() + " elementos registrados.";
    }
}