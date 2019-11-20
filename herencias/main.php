<?php

class Mamifero{
    private $nombre;
    private $patas;
    
    public function __construct($nombre, $patas){
          $this->nombre = $nombre;
          $this->patas = $patas;
        }
    
    public function imprimirPatas() {
        echo $this->nombre . " tiene ". $this->patas ." patas";
    }
}

class Perro extends Mamifero{
    function __construct($nombre) {  
     parent::__construct($nombre, 4); 
   }  
}

$perrito = new Perro("firulais");
$perrito->imprimirPatas();
?>



