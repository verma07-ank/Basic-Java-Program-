import java.util.Scanner;

public class InverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv  = 0;
        int originalposition = 1;
        while(n != 0){
            int originaldigit = n % 10;
            int inverteddigit = originalposition;
            int invertedposition = originaldigit;

            inv = inv + inverteddigit * (int)Math.pow(10, invertedposition - 1);

            n = n / 10;
            originalposition++;
        }
        System.out.println(inv);
    }
}