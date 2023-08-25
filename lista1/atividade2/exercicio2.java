/*
 * Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit. Peça ao usuário para escolher a direção da conversão e, em seguida, faça a conversão e exiba o resultado.
 */

package lista1.atividade2;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor\n");
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");
        System.out.println("Op: ");
        int op = scanner.nextInt();
        System.out.println("Valor :");
        float valor = scanner.nextFloat();

        
        float valor_convertido = 0;
        if(op == 1){
            valor_convertido = Conversor.toFahrenheit(valor);
        }else if(op == 2){
            valor_convertido = Conversor.toCelsius(valor);
        }else{
            System.out.println("Operacao invalida\n");
            System.exit(1);
        }
        System.out.println("Valor convertido: "+valor_convertido);
        scanner.close();
    }

    public class Conversor{
        public static float toFahrenheit(float valor){
            return (9 * valor / 5) + 32;
        }

        public static float toCelsius(float valor){
            return 5 * (valor - 32) / 9;
        }
    }
}
