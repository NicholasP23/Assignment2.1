import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int averageGrade; //input average of class
        String grade = null;

        do{

        System.out.print("Enter average grade: ");

            Scanner scanner = new Scanner(System.in);
            averageGrade = scanner.nextInt();

            if (averageGrade >= 93) grade = "A";
            else if(averageGrade < 93 && averageGrade >= 90) grade = "A-";
            else if(averageGrade < 90 && averageGrade >= 87) grade = "B+";
            else if(averageGrade < 87 && averageGrade >= 83) grade = "B";
            else if(averageGrade < 83 && averageGrade >= 80) grade = "B-";
            else if(averageGrade < 80 && averageGrade >= 77) grade = "C+";
            else if(averageGrade < 77 && averageGrade >= 73) grade = "C";
            else if(averageGrade < 73 && averageGrade >= 70) grade = "C-";
            else if(averageGrade < 70 && averageGrade >= 67) grade = "D+";
            else if(averageGrade < 67 && averageGrade >= 63) grade = "D";
            else if(averageGrade < 63 && averageGrade >= 60) grade = "D-";
            else if(averageGrade < 60 && averageGrade >= 0) grade = "F";
            else System.out.println("Invalid input, please type a valid grade");

        }while(averageGrade <= 0);


        System.out.println("Average grade inputted: " + averageGrade);
        System.out.println("Graded scale: " + grade);
    }

}