/* 
 * Calculadora Simples Crie um programa Java que funcione 
 * como uma calculadora simples. Peça ao usuário para inserir 
 * dois números e uma   operação (+, -, *, /). Realize a operação 
 * escolhida e exiba o resultado.
*/
package lista1.atividade2;
import java.util.Scanner;


public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora\n\n");

        System.out.println("Primeiro Numero: ");
        float num1 = scanner.nextFloat();

        System.out.println("Operador: ");
        char op = scanner.next().charAt(0);

        System.out.println("Segundo Numero: ");
        float num2 = scanner.nextFloat();

        float resposta = 0;
        switch (op) {
            case '+':
                resposta = Calculadora.soma(num1 , num2);
                break;
            case '-':
                resposta = Calculadora.sub(num1, num2);
                break;
            case '*':
                resposta = Calculadora.multi(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    resposta = Calculadora.div(num1, num2);
                } else {
                    System.out.println("Impossivel dividir\n");    
                    System.exit(1);    
                }
                break;
            default:
                System.out.println("Operador invalido!\n");
                System.exit(1);
        }
        System.out.println(resposta);
        scanner.close();
    }

    public class Calculadora {
        public static float soma(float num1, float num2){
            return num1 + num2;
        }
    
        public static float sub(float num1, float num2){
            return num1 - num2;
        }
    
        public static float multi(float num1, float num2){
            return num1 * num2;
        }
    
        public static float div(float num1, float num2){
            return num1 / num2;
        }
    }
}
