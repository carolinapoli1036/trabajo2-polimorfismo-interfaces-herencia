package com.ces2.trabajo2.modelo.interfaces;

import com.ces2.trabajo2.modelo.Decoracion;

import java.util.List;

public interface Organizable extends Iluminable {

    String organizar(List<Decoracion> decoraciones);
}