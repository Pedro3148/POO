package lista1.atividade1;
import java.util.Scanner;
public class verificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int value = s.nextInt();
        s.close();
        System.out.println(verificaNumeroprimo(value));
    }

    private static int verificaNumeroprimo(int n){
        int isPrime = 1;
        int i;

        if(n == 1){
            return isPrime = 0;
        }

        if(n % 2 == 0 && n != 2){
            return isPrime = 0;
        }

        for(i = n - 1;i > 1; i--){
            if(n % i == 0){
                isPrime = 0;
                break;
            }
        }

        return isPrime;
    }
}
