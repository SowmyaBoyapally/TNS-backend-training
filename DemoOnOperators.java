//Demo for different types of operators
public class DemoOnOperators {
    public static void main(String[] args) {

        //Arithematic operators
        int x = 20, y = 10;
        boolean a = true, b = false;
        System.out.println("The multiplication value "+(x*y));
        System.out.println("The addition value "+(x+y));
        System.out.println("The division value "+(x/y));

        //Assignment operators
        int z = x;
        System.out.println("the value of z "+z);
        z += y;
        System.out.println("the value of z "+z);

        //Relational operators
        System.out.println(x==y);

        //Logical operators
        System.out.println("The result of and operation "+(x & y));

        //Unary operators
        int d = 10;
        //post increment
        //System.out.println("The post increment value is "+d++); output is 10
        d++;
        System.out.println(d); // output is 11
        //pre increment
        ++d;
        System.out.println(d);
        d--;
        System.out.println(d);
        --d;
        System.out.println(d);

        //Ternary operator
        int max = (x>y)?x:y;
    }
    
}
