import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input= scanner.nextLine();
         int maxNumb= Integer.MIN_VALUE;

         while (!input.equals("Stop")){

             int currentNumb= Integer.parseInt(input);
             if (maxNumb < currentNumb){
                 maxNumb= currentNumb;
             }
             input= scanner.nextLine();
         }
        System.out.println(maxNumb);

    }
}
