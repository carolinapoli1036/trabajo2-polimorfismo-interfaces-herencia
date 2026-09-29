package com.ces2.trabajo2.repositories;

import com.ces2.trabajo2.modelo.Decoracion;
import com.ces2.trabajo2.modelo.Futurista;
import com.ces2.trabajo2.modelo.Minimalista;
import com.ces2.trabajo2.modelo.Vintage;
import com.ces2.trabajo2.modelo.interfaces.HabitacionService;

import java.util.ArrayList;
import java.util.List;

public class HabitacionRepository {

    public static List<HabitacionService> obtenerHabitaciones() {

        List<HabitacionService> habitaciones = new ArrayList<>();

        // 2 objetos con 0 elementos en la lista
        habitaciones.add(new Minimalista("Habitacion 1", new ArrayList<>()));
        habitaciones.add(new Vintage("Habitacion 2", new ArrayList<>()));

        // 2 objetos con 1 elemento en la lista
        List<Decoracion> lista3 = new ArrayList<>();
        lista3.add(new Decoracion("Minimalista", "Blanco", "Luz natural", "Solo cama y closet", 150.0, 3));
        habitaciones.add(new Futurista("Habitacion 3", lista3));

        List<Decoracion> lista4 = new ArrayList<>();
        lista4.add(new Decoracion("Vintage", "Marron", "Lampara antigua", "Cama al centro", 220.5, 5));
        habitaciones.add(new Minimalista("Habitacion 4", lista4));

        // 2 objetos con 2 elementos en la lista
        List<Decoracion> lista5 = new ArrayList<>();
        lista5.add(new Decoracion("Vintage", "Vino tinto", "Candelabro", "Tocador junto a la puerta", 300.0, 4));
        lista5.add(new Decoracion("Vintage", "Dorado", "Lampara de cristal", "Cama al centro", 280.0, 2));
        habitaciones.add(new Vintage("Habitacion 5", lista5));

        List<Decoracion> lista6 = new ArrayList<>();
        lista6.add(new Decoracion("Futurista", "Negro mate", "Luz LED inteligente", "Mobiliario modular", 500.0, 5));
        lista6.add(new Decoracion("Futurista", "Blanco", "Luz LED blanca", "Espacio abierto", 430.0, 1));
        habitaciones.add(new Futurista("Habitacion 6", lista6));

        // 2 objetos con 3 elementos en la lista
        List<Decoracion> lista7 = new ArrayList<>();
        lista7.add(new Decoracion("Minimalista", "Gris claro", "Luz difusa", "Escritorio flotante", 180.0, 3));
        lista7.add(new Decoracion("Minimalista", "Blanco", "Luz natural", "Espacio libre en el centro", 160.0, 2));
        lista7.add(new Decoracion("Minimalista", "Negro", "Luz empotrada", "Cama junto a la ventana", 210.0, 4));
        habitaciones.add(new Minimalista("Habitacion 7", lista7));

        List<Decoracion> lista8 = new ArrayList<>();
        lista8.add(new Decoracion("Vintage", "Beige", "Luz calida tenue", "Sillon en la esquina", 260.0, 1));
        lista8.add(new Decoracion("Vintage", "Marron", "Lampara de mesa", "Armario antiguo", 240.0, 3));
        lista8.add(new Decoracion("Vintage", "Vino tinto", "Candelabro", "Cama al centro", 310.0, 5));
        habitaciones.add(new Vintage("Habitacion 8", lista8));

        // 2 objetos con 4 elementos en la lista
        List<Decoracion> lista9 = new ArrayList<>();
        lista9.add(new Decoracion("Futurista", "Blanco", "Luz LED blanca", "Mobiliario modular", 480.0, 2));
        lista9.add(new Decoracion("Futurista", "Negro mate", "Luz LED RGB", "Espacio abierto", 520.0, 5));
        lista9.add(new Decoracion("Futurista", "Gris", "Luz inteligente", "Escritorio flotante", 460.0, 3));
        lista9.add(new Decoracion("Futurista", "Blanco", "Luz indirecta", "Cama suspendida", 490.0, 4));
        habitaciones.add(new Futurista("Habitacion 9", lista9));

        List<Decoracion> lista10 = new ArrayList<>();
        lista10.add(new Decoracion("Minimalista", "Blanco", "Luz natural", "Solo cama y closet", 150.0, 1));
        lista10.add(new Decoracion("Minimalista", "Gris", "Luz difusa", "Escritorio flotante", 170.0, 2));
        lista10.add(new Decoracion("Minimalista", "Negro", "Luz empotrada", "Espacio libre", 190.0, 3));
        lista10.add(new Decoracion("Minimalista", "Blanco", "Luz natural", "Armario empotrado", 200.0, 4));
        habitaciones.add(new Minimalista("Habitacion 10", lista10));

        // 2 objetos con 5 elementos en la lista
        List<Decoracion> lista11 = new ArrayList<>();
        lista11.add(new Decoracion("Vintage", "Dorado", "Lampara de cristal", "Cama al centro", 320.0, 5));
        lista11.add(new Decoracion("Vintage", "Marron", "Lampara antigua", "Tocador", 250.0, 2));
        lista11.add(new Decoracion("Vintage", "Beige", "Luz calida", "Sillon", 270.0, 3));
        lista11.add(new Decoracion("Vintage", "Vino tinto", "Candelabro", "Armario antiguo", 290.0, 1));
        lista11.add(new Decoracion("Vintage", "Marron", "Lampara de mesa", "Cama al centro", 260.0, 4));
        habitaciones.add(new Vintage("Habitacion 11", lista11));

        List<Decoracion> lista12 = new ArrayList<>();
        lista12.add(new Decoracion("Futurista", "Blanco", "Luz LED inteligente", "Mobiliario modular", 500.0, 5));
        lista12.add(new Decoracion("Futurista", "Negro mate", "Luz LED RGB", "Espacio abierto", 470.0, 4));
        lista12.add(new Decoracion("Futurista", "Gris", "Luz indirecta", "Escritorio flotante", 440.0, 2));
        lista12.add(new Decoracion("Futurista", "Blanco", "Luz inteligente", "Cama suspendida", 510.0, 3));
        lista12.add(new Decoracion("Futurista", "Negro mate", "Luz LED blanca", "Pared interactiva", 530.0, 1));
        habitaciones.add(new Futurista("Habitacion 12", lista12));

        return habitaciones;
    }
}