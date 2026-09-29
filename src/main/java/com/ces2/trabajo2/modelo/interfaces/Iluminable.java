package com.ces2.trabajo2.modelo.interfaces;

import com.ces2.trabajo2.modelo.Decoracion;

import java.util.List;

public interface Iluminable extends Decorable {

    String iluminar(List<Decoracion> decoraciones);
}