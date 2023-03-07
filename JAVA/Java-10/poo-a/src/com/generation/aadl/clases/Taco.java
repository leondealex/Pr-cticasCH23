package com.generation.aadl.clases;

public class Taco {
    private String tipoDeTortilla;
    private String guisado;
    private int numeroDeTortilla;
    private String tamanioDeTortilla;
    private float precio;
    
/*Aquí estamos definiendo la clase Taco y sus variables de
instancia.tipoDeTortilla, guisado, numeroDeTortilla,
tamanioDeTortilla y precio son las propiedades
de un objeto Taco.*/
    

    public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
        this.tipoDeTortilla = tipoDeTortilla;
        this.guisado = guisado;
        this.numeroDeTortilla = numeroDeTortilla;
        this.tamanioDeTortilla = tamanioDeTortilla;
        this.precio = precio;
    }
/*Este es el constructor de la clase. El constructor se llama
 * cuando se crea un nuevo objeto de la clase Taco. Este
 * constructor acepta cinco parámetros: tipoDeTortilla,
 * guisado, numeroDeTortilla, tamanioDeTortilla y precio.
 * El constructor inicializa los valores de las variables de
 * instancia con los valores que se pasan como parámetros.*/
    
    
    
    // METODOS
    public String getTipoDeTortilla() {
        return tipoDeTortilla;
    }

    public void setTipoDeTortilla(String tipoDeTortilla) {
        this.tipoDeTortilla = tipoDeTortilla;
    }

    public String getGuisado() {
        return guisado;
    }

    public void setGuisado(String guisado) {
        this.guisado = guisado;
    }

    public int getNumeroDeTortilla() {
        return numeroDeTortilla;
    }

    public void setNumeroDeTortilla(int numeroDeTortilla) {
        this.numeroDeTortilla = numeroDeTortilla;
    }

    public String getTamanioDeTortilla() {
        return tamanioDeTortilla;
    }

    public void setTamanioDeTortilla(String tamanioDeTortilla) {
        this.tamanioDeTortilla = tamanioDeTortilla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void preparar() {
        System.out.println("Preparando el taco de " + guisado + " en tortilla de " + tipoDeTortilla + " con " + numeroDeTortilla + " tortillas de tamaño " + tamanioDeTortilla + "...");
    }

    public void vender() {
        System.out.println("Vendiendo el taco de " + guisado + " en tortilla de " + tipoDeTortilla + " con " + numeroDeTortilla + " tortillas de tamaño " + tamanioDeTortilla + " por " + precio + " pesos.");
    }

    public void ponerSalsa() {
        System.out.println("Poniendo salsa en el taco de " + guisado + " en tortilla de " + tipoDeTortilla + " con " + numeroDeTortilla + " tortillas de tamaño " + tamanioDeTortilla + "...");
    }

    public void subirPrecio(float aumento) {
        precio += aumento;
        System.out.println("Se ha subido el precio del taco de " + guisado + " en tortilla de " + tipoDeTortilla + " con " + numeroDeTortilla + " tortillas de tamaño " + tamanioDeTortilla + " a " + precio + " pesos.");
    }
    
    
    /*Estos son los metodos*/

    @Override
    public String toString() {
        return "Taco de " + guisado + " en tortilla de " + tipoDeTortilla + " con " +
               numeroDeTortilla + " tortilla(s) de tamaño " + tamanioDeTortilla + " y precio $" + precio;
    }
    
    /*Esta sección es una implementación del método
     * toString(), que es un método especial en Java
     * que se utiliza para representar un objeto como
     * una cadena. En esta implementación, estamos
     * devolviendo una cadena que describe el objeto Taco.
     

    La anotación @Override indica que estamos
    sobrescribiendo el método toString() de la clase padre
    (en este caso, la clase Object de Java). Esto significa
    que estamos proporcionando nuestra propia implementación
    del método toString() en la clase Taco.

    Dentro del método toString(), estamos creando una cadena
    que describe el objeto Taco. La cadena contiene los
    valores de todas las variables de instancia, incluyendo
    el guisado, el tipoDeTortilla, el numeroDeTortilla,
    el tamanioDeTortilla y el precio.

    Al llamar al método toString() en un objeto Taco,
    se devuelve una cadena que contiene esta información,
    lo que puede ser útil para la depuración y la visualización
    de objetos en la consola.*/
}

