public class Conditionstatements {
    public static void main(String[] args) {

       // if statement
        int age = 18;
        if (age>=18){
            System.out.println("You are eligible to vote");
        }

       // if else statement
        int a = 4;
        if (a % 2 ==0){      // Logic (a % 2 !=1
            System.out.println(a + " is even");
        }
        else{
            System.out.println(a + " is odd");
        }
    
      // else if ladder

       int marks =101;
       if (marks>=90 && marks<=100){
        System.out.println("Grade A");
       }
        else if (marks>=75 && marks<=89){
            System.out.println("Grade B");
        }
        else if (marks>=50 && marks <=74){
            System.out.println("Grade C");
        }
    
        else if(marks >=0 && marks <=49){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter Proper marks");
        }

       //Nested if else statement

       int number=20;

       if(number==0){
        System.out.println("Zero");
       }
       else{
        if(number>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Nagative");
        }

      }

       // Switch case

       int day =1;
       switch (day){
         case 1:
             System.out.println("Monday");
             break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid day");
       }

    }
}
