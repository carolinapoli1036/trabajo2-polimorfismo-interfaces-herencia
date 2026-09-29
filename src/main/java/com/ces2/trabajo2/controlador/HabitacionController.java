package com.ces2.trabajo2.controlador;

import com.ces2.trabajo2.modelo.interfaces.HabitacionService;
import com.ces2.trabajo2.repositories.HabitacionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ces2.trabajo2.modelo.Decoracion;
import com.ces2.trabajo2.modelo.Minimalista;
import com.ces2.trabajo2.modelo.Vintage;
import com.ces2.trabajo2.modelo.Futurista;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HabitacionController {

    @GetMapping("/peticion1")
    public String peticion1(Model model) {

        List<HabitacionService> habitaciones = HabitacionRepository.obtenerHabitaciones();

        String nombres = habitaciones.stream()
                .map(HabitacionService::getNombre)
                .collect(Collectors.joining(", "));

        model.addAttribute("nombres", nombres);

        return "peticion1";
    }


    @GetMapping("/peticion2")
    public String peticion2(Model model) {

        List<HabitacionService> habitaciones = HabitacionRepository.obtenerHabitaciones();

        List<String> estadisticas = new java.util.ArrayList<>();

        for (HabitacionService habitacion : habitaciones) {

            List<Decoracion> decoraciones = obtenerDecoraciones(habitacion);

            long conteo = decoraciones.size();
            double suma = decoraciones.stream().mapToDouble(Decoracion::getCosto).sum();
            double promedio = decoraciones.stream().mapToDouble(Decoracion::getCosto).average().orElse(0);
            double minimo = decoraciones.stream().mapToDouble(Decoracion::getCosto).min().orElse(0);
            double maximo = decoraciones.stream().mapToDouble(Decoracion::getCosto).max().orElse(0);

            String texto = habitacion.getNombre() + " -> conteo: " + conteo
                    + ", suma: " + suma
                    + ", promedio: " + promedio
                    + ", min: " + minimo
                    + ", max: " + maximo;

            estadisticas.add(texto);
        }

        model.addAttribute("estadisticas", estadisticas);

        return "peticion2";
    }

    private List<Decoracion> obtenerDecoraciones(HabitacionService habitacion) {
        if (habitacion instanceof Minimalista m) {
            return m.getDecoraciones();
        } else if (habitacion instanceof Vintage v) {
            return v.getDecoraciones();
        } else if (habitacion instanceof Futurista f) {
            return f.getDecoraciones();
        }
        return new java.util.ArrayList<>();
    }
    @GetMapping("/peticion3")
    public String peticion3(Model model) {

        List<HabitacionService> habitaciones = HabitacionRepository.obtenerHabitaciones();

        List<String> resultado = new java.util.ArrayList<>();

        for (HabitacionService habitacion : habitaciones) {

            List<Decoracion> decoraciones = obtenerDecoraciones(habitacion);

            List<String> estilos = decoraciones.stream()
                    .map(Decoracion::getEstilo)
                    .collect(Collectors.toList());

            String texto = habitacion.getNombre() + " -> estilos: " + estilos;

            resultado.add(texto);
        }

        model.addAttribute("resultado", resultado);

        return "peticion3";
    }
    @GetMapping("/peticion4")
    public String peticion4(Model model) {

        List<HabitacionService> habitaciones = HabitacionRepository.obtenerHabitaciones();

        List<String> resultado = new java.util.ArrayList<>();

        for (HabitacionService habitacion : habitaciones) {

            List<Decoracion> decoraciones = obtenerDecoraciones(habitacion);

            boolean hayCostoso = decoraciones.stream()
                    .anyMatch(d -> d.getCosto() > 400);

            boolean hayEstiloVintage = decoraciones.stream()
                    .anyMatch(d -> d.getEstilo().equals("Vintage"));

            boolean ningunoBarato = decoraciones.stream()
                    .noneMatch(d -> d.getCosto() < 100);

            String texto = habitacion.getNombre()
                    + " -> tiene algun elemento con costo > 400: " + hayCostoso
                    + " | tiene algun elemento de estilo Vintage: " + hayEstiloVintage
                    + " | ningun elemento tiene costo < 100: " + ningunoBarato;

            resultado.add(texto);
        }

        model.addAttribute("resultado", resultado);

        return "peticion4";
    }
    @GetMapping("/peticion5")
    public String peticion5(Model model) {

        List<HabitacionService> habitaciones = HabitacionRepository.obtenerHabitaciones();

        List<String> resultado = new java.util.ArrayList<>();

        for (HabitacionService habitacion : habitaciones) {

            List<Decoracion> decoraciones = obtenerDecoraciones(habitacion);

            java.util.Optional<Decoracion> masPrioritaria = decoraciones.stream()
                    .max(java.util.Comparator.comparing(Decoracion::getPrioridad));

            String texto;
            if (masPrioritaria.isPresent()) {
                Decoracion d = masPrioritaria.get();
                texto = habitacion.getNombre() + " -> elemento con mayor prioridad: estilo "
                        + d.getEstilo() + ", color " + d.getColorPrincipal()
                        + ", prioridad " + d.getPrioridad();
            } else {
                texto = habitacion.getNombre() + " -> no tiene elementos en la lista";
            }

            resultado.add(texto);
        }

        model.addAttribute("resultado", resultado);

        return "peticion5";
    }
}