import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= Integer.parseInt(scanner.nextLine());

        int sum= 0;

        while (sum<number){
            int currentNumb= Integer.parseInt(scanner.nextLine());

            sum+= currentNumb;

        }
        System.out.println(sum);
    }
}
