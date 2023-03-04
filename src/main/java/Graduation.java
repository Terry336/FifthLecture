import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String student= scanner.nextLine();
        int goodGradeCount = 0;
        int poorGradeCount = 0;
        double allGradeCount = 0;
        double allGradeSum = 0;
        int gradesCount= 1;
        boolean isFailed = false;

        while (goodGradeCount < 12){
            if (poorGradeCount == 2){
                isFailed=true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4){
                poorGradeCount++;
                continue;
            }
            gradesCount++;
            goodGradeCount++;
            allGradeSum+= grade;
        }

        double avgGrade= allGradeSum/12;
        if (isFailed){
            System.out.printf("%s has been excluded at %d grade",student, gradesCount);
        }
        else {
            System.out.printf("%s graduated. Average grade: %.2f", student, avgGrade);
        }
    }
}
