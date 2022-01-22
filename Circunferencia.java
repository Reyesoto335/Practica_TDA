public class Circunferencia extends CircunferenciayRadio{
    Circunferencia circo = new Circunferencia();
    
    public Circunferencia(int radio){
    }
    public Circunferencia(){
    }
    
    double resultadoArea;
    double resultadoDiametro;
    double resultadoCircunferencia;
    double resultadoVolumen;
    
    public void Area (){
        resultadoArea = 4 * Math.PI * (Math.pow(radio,2));
        System.out.println(resultadoArea);
    }
    
    public void Diametro(){
        resultadoDiametro = 2 * radio;
        System.out.println(resultadoDiametro);
    }
    
    public void Circunferencia (){
        resultadoCircunferencia = Math.PI * resultadoDiametro;
        System.out.println(resultadoCircunferencia);
    }
    
    public void Volumen(){
        resultadoVolumen = 1.3333 * Math.PI * (Math.pow(radio,3));
        System.out.println(resultadoVolumen);
    }
    
    public void operar(){
        Area();
        Diametro();
        Circunferencia();
        Volumen();
    }

    public double getResultadoArea() {
        return resultadoArea;
    }

    public double getResultadoDiametro() {
        return resultadoDiametro;
    }

    public double getResultadoCircunferencia() {
        return resultadoCircunferencia;
    }

    public double getResultadoVolumen() {
        return resultadoVolumen;
    }
}
