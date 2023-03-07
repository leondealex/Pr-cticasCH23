package com.generation.aadl.mains;

import com.generation.aadl.clases.Taco;

public class TestTaco {
    public static void main(String[] args) {
        Taco taco1 = new Taco("maíz", "pollo", 2, "pequeño", 20.0f);
        Taco taco2 = new Taco("harina", "carne asada", 1, "grande", 25.0f);

        taco1.preparar();
        taco1.ponerSalsa();
        taco1.vender();
        taco1.subirPrecio(5.0f);

        taco2.preparar();
        taco2.ponerSalsa();
        taco2.vender();
        taco2.subirPrecio(10.0f);

        System.out.println(taco1.toString());
        System.out.println(taco2.toString());
    }
}
