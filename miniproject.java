import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0;
        System.out.println("type -1 to exit");

        do {
            try {
                System.out.println("hey user enter a guess number from 1-10:");
                val = sc.nextInt();
                int a = (int)(Math.random() * 10);
                if (val >= 0 && val <= 10 || val == -1) {
                    if (val == a) {
                        System.out.println("yo bruh youre correct your guess matches the random value");
                        System.out.println("super buddy you got it correct the number is correct");
                        break;
                    } else if (val > a) {
                        System.out.println("nope your guess is larger");
                    } else if (val >= 0) {
                        System.out.println("your guess is smaller");
                    } else {
                        break;
                    }
                    System.out.println("The random number is " + a);
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("buddy the number must be always integer and between 1-10");
                sc.next();
            }
            System.out.println("-------------------------------------------");
        } while (true);
    }
}
