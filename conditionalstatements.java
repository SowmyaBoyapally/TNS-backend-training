public class conditionalstatements {
    public static void main(String[] args) {

        //Simple if statement
        int temp = 25;
        if (temp > 20) {
            System.out.println("It's a warm day.");
        }

        //if-else statement
        int age = 17;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } 
        else {
            System.out.println("You are a minor.");
        }

        //if-else if-else statement
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } 
        else if (score >= 80) {
            System.out.println("Grade: B");
        } 
        else if (score >= 70) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: F");
        }

        //Nested if statement
        int num = 25;
        //outer if
        if (num > 0) {
            //inner if 
            if (num % 2 == 0) { 
                System.out.println("The number is positive and even");
            } 
            else {
                System.out.println("The number is positive but odd");
            }
        } 
        else {
            System.out.println("The number is not positive");
        }

    }
}
