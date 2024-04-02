import java.util.Scanner; //se agrega la importación del Scanner para su uso.

public class Juego {
	
	public static void main(String[] args) { // Agregue un metodo static void para la ejecucion y funcion de la class.
	
	Scanner s = new Scanner(System.in); // En los parentesis por cuestiones de sintaxis debe llevar un System.in y para el funcionamiento del mismo.
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    // Elimine el s2 = new Scanner ya que no era necesario tener otro valor que hace funcion de un scanner de java.
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine(); 
    
    if (j1.equals(j2)) { // Se remplaza el "==" por una funcion equals, ya que estamos tratando de comparar 2 string iguales no valores de enteros.
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }
       break;
        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
       break;// Se agregan break; a los case que le hacia falta, por su correcta sintaxis y porque cada case debe llevar un cierre.
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
        break;
        default:
        	System.out.println("Gana el jugador " + g);
      }
    }// else
    s.close();// Se cierra el scanner despues de concluir la validacion y los switch cases.
  }// main
}// class juego
