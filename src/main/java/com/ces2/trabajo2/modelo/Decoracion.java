

package com.ces2.trabajo2.modelo;

public class Decoracion {

    private String estilo;
    private String colorPrincipal;
    private String tipoIluminacion;
    private String distribucion;
    private double costo;
    private Integer prioridad;

    public Decoracion(String estilo, String colorPrincipal, String tipoIluminacion,
                      String distribucion, double costo, Integer prioridad) {
        this.estilo = estilo;
        this.colorPrincipal = colorPrincipal;
        this.tipoIluminacion = tipoIluminacion;
        this.distribucion = distribucion;
        this.costo = costo;
        this.prioridad = prioridad;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public String getTipoIluminacion() {
        return tipoIluminacion;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public double getCosto() {
        return costo;
    }

    public Integer getPrioridad() {
        return prioridad;
    }
}