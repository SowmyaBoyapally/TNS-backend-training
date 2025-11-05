public class controlstatements {
    public static void main(String[] args) {
        
        //Enhanced for loop: use in arrays and collections
        int[] arr = {1,2,3,4,5};
        for(int a :arr){
            System.out.println(a);
        }

        // switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week.");
                break;
            case "Friday":
                System.out.println("End of the work week.");
                break;
            default:
                System.out.println("Midweek or weekend.");
        }
        
        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);
    }
}
