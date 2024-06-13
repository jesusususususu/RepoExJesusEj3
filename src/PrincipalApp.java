import java.util.ArrayList;

public class PrincipalApp {

public static void main(String[]args) {
		
		ArrayList<Integer>edad=new ArrayList<Integer>();
		edad.add(1);
		edad.add(11);
		edad.add(10);
		edad.add(21);
		edad.add(15);
		edad.add(14);
		edad.add(5);
		edad.add(8);
		
		AnalisisEdad analisis = new AnalisisEdad(edad);
		System.out(analisis.comprobar(edad));
	}
}
