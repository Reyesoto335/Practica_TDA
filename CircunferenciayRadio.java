
import java.util.Scanner;


public class CircunferenciayRadio {
public static int radio;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de Radio: ");
        radio = sc.nextInt();
        resultados();
        //circulo.resultados();
        
    }
        public static void resultados(){
            Circunferencia circo = new Circunferencia();
            //circo.operar();
            System.out.println("Ärea es igual a = ");
            circo.Area();
            //System.out.println(circo.getResultadoArea());
            System.out.println("Diametro es igual a = ");
            circo.Diametro();
            //System.out.println(circo.getResultadoDiametro());
            System.out.println("Circunferencia es igual a = ");
            circo.Circunferencia();
            //System.out.println(circo.getResultadoCircunferencia());
            System.out.println("Volumen es igual a = ");
            circo.Volumen();
            //System.out.println(circo.getResultadoVolumen());
}
    
}
