import java.util.Scanner;  //Importo mi escaner

class MainPaciente {    //Creo la clase
   public static void main(String[] args) {     
      Scanner op = new Scanner(System.in);   //Estoy utilizando mi metodo escaner

      System.out.println("\nIngrese los daros requeridos:\n");
      System.out.print("Deme su nombre: ");
      String name = op.nextLine();
      System.out.print("Deme su apellido: ");
      String lastname = op.nextLine();
      System.out.print("Deme su nss: ");
      int NSS = op.nextInt();

      Paciente Bruno = new Paciente(); //Estoy creando mi objeto 
      Bruno.nombre = name;    //Sustituyo las variables
      Bruno.apellido = lastname;
      Bruno.nss = NSS;
      
      Bruno.mostrarNSS();
      Bruno.mostrarNombre();  //Mando a llamar a mis acciones

   }
}