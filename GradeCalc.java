import java.util.Scanner;
public class GradeCalc
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total number of subject:");
        int numSubjects = scan.nextInt();
        
        int totalMarks = 0;
        for(int i=1; i<=numSubjects; i++){
            System.out.println("Enter marks for subject" + i + "(out of 100): ");
            int marks = scan.nextInt();
            while(marks < 0 || marks > 100){
                System.out.println("Invalid marks.please enter marks between 0 & 100");
                System.out.println("enter the marks for subject " +  i + "out of 100");
                marks = scan.nextInt();
            }
            totalMarks += marks;
        
        }
        System.out.println("student result:");
        System.out.println("Total marks obtained in all subjects: " + totalMarks);

        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("Average percentage:"+ AveragePercentage);

        if(AveragePercentage >= 90){
            System.out.println("your grade : A+");
        }
        else if(AveragePercentage >= 80){
            System.out.println("your grade : B+");
        }
        else if(AveragePercentage >= 75){
            System.out.println("your grade : C+");
        }
         else if(AveragePercentage >= 70){
            System.out.println("your grade : D+");
        }
        else {
            System.out.println("your grade : E+");
        }
        scan.close();


    }
}
