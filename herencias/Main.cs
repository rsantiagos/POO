using System;

namespace MyCompiler {
    class Program {
        public static void Main(string[] args) {
            //Console.WriteLine("Hello world!");
            Perro perrito = new Perro("Firulais");
            perrito.imprimirPatas();
        }
    }
    
    class Perro : Mamifero {
        public Perro(String nombre): base(nombre, 4){}
    }
    
    class Mamifero{    
        private int patas;
        private String nombre;
        
        public Mamifero(String nombre, int patas){
          this.nombre = nombre;
          this.patas = patas;
        }
        
        public void imprimirPatas(){
          Console.WriteLine(nombre+" Tiene " + patas + " patas\n"+ "Mamifero");
        }
    }
    
    
}