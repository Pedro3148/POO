package revisao.ferramenta;

public class CalculadoraEx {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.a = 1;
        calc.b = 1;
        
        System.out.println(calc.operar());
    }
}
