
import java.util.Scanner;


public class CircunferenciayRadio {
static int radio;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de Radio: ");
        radio = sc.nextInt();
        
        Circunferencia circulo = new Circunferencia();
        circulo.resultados();
        
    }
    
}
