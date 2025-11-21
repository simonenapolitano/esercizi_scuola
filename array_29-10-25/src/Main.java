import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[10];
        for(int i=0;i<10; i++){
            System.out.println("Inserisci il " + (i+1) + " numero: ");
            numeri[i] = input.nextInt();
        }
        int max = 0;
        for(int n: numeri){
            if(max < n){
                max = n;
            }
        }
        System.out.println("Il numero piu' grande nell'array e': " + max);
    }
}
