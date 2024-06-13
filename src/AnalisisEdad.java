import java.util.ArrayList;
import java.util.Scanner;

public class AnalisisEdad {

Scanner sc = new Scanner (System.in);
	
	private ArrayList<Integer> edad;
	
	String frase;	
	public AnalisisEdad (ArrayList<Integer> edad) {
		this.edad=edad;
	}
	
	public String AnalisisEdad (ArrayList<Integer> edad) {
	int sumar=0;
	int contar=0;
		for(int i=0; i<edad.size(); i++) {
			if(edad.get(i)%2==0) {
			     sumar=sumar+i;
			}else if (edad.get(i)%2==1) {
				contar++;
			}
		}
	}
	
	frase== "Suma de pares :"+sumar+"recuento de impares :"+ contar;
	return frase;
		
}
