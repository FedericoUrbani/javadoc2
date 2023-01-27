/**
 * Tester class that contains method main
 * @author Federico
 */
public class Tester {

    public static void main (String []args){
        ArithmeticOperator a=new ArithmeticOperator();

        /**
         * div result is 5
         */
        System.out.println(a.div(10,2));
        /**
         * mul result is 20
         */
        System.out.println(a.mul(2,10));
        /**
         * sum result is 6
         */
        System.out.println(a.sum(3,3));
        /**
         * sum result is 2
         */
        System.out.println(a.sub(10,8));
    }

}
