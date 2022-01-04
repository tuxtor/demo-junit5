package gt.edu.url;

public class Calculadora {

    private CalculadoraOracleCloud calculadoraOracleCloud;

    public double sumar(double a, double b){ return a+b; }

    public double restar(double a, double b){ return a-b; }

    public double multiplicar(double a, double b){ return a*b; }

    public double dividir(double a, double b){ return a/b; }

    public double sumarEnLaNube(double a, double b){
        //Dependencia
        return calculadoraOracleCloud.sumarEnOracleCloud(a, b);
    }

}
