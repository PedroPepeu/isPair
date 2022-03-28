import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int remainer = number % 2;
        boolean isPair = remainer == 0;
        if (isPair) {
            System.out.printf("number %d is pair\n", number);
        }else{
            System.out.printf("number %d isn't pair\n", number);
        }
        sc.close();
    }
}
