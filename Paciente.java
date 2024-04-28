class Paciente {   //Se esta creando la clase  
   String nombre, apellido;   //Estoy declarando las variables a utilizar
   int nss;

   Paciente() {}  //Se esta creando el metodo constructor
   
   public void mostrarNSS() {  
      System.out.println("\nMi numero de seguro social es: " + this.nss);
   }
   public void mostrarNombre() {
      System.out.println("Mi nomre es: "+this.nombre+" "+this.apellido);
   }
}