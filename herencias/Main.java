import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
      Perro perrito = new Perro("Pantaleon");
      perrito.imprimirPatas();
      Burro burrito = new Burro("Napoleon");
      burrito.imprimirPatas();
    }
}

class Perro extends Mamifero {
    public Perro(String nombre){
      super(nombre, 4);
    }
}


class Burro extends Mamifero {
    public Burro(String nombre){
      super(nombre, 4);
    }
}

class Mamifero{    
    private int patas;
    private String nombre;
    
    public void imprimirPatas(){
      System.out.println(nombre+" Tiene " + patas + " patas\n"+ "Mamifero");
    }

    public Mamifero(String nombre, int patas){
      this.nombre = nombre;
      this.patas = patas;
    }
}