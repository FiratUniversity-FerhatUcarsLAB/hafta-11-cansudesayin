public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return a * b + c;
    }

    public static double expSum(double x) {
        // TODO
        // expSum: x * e^(-x) + sqrt(1 - e^(-x))
        
        double expTerm = Math.exp(-x);                 // e^(-x)
        return x * expTerm + Math.sqrt(1 - expTerm);   // x·e^-x + √(1 - e^-x)
    }

    public static void main(String[] args) {
        // TODO: test methods
        
        // 1) Basit test
        System.out.println("multadd(1.0, 2.0, 3.0) = " + multadd(1.0, 2.0, 3.0));

        // 2) sin(π/4) + cos(π/4) / 2
        double expr1 = multadd(Math.sin(Math.PI / 4), 1.0, Math.cos(Math.PI / 4) / 2);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + expr1);

        // 3) log(10) + log(20)
        double expr2 = multadd(Math.log(10), 1.0, Math.log(20));
        System.out.println("log(10) + log(20) = " + expr2);

        // 4) expSum(x)
        double expr3 = expSum(2.0);   // örnek test
        System.out.println("expSum(2.0) = " + expr3);
    }
}
