import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String name= scanner.nextLine();
        String pass= scanner.nextLine();

        String inputPass= scanner.nextLine();

        while (!pass.equals(inputPass)) {
            inputPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name);
        }
    }

