public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 17;
        int b= 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
 
        // Operator increment dan decrement
        int x = 10;
        x++;
        System.out.println("x setelah x++ : " + x);
        x--;
        System.out.println("x setelah x-- : " + x);
 
        // Operator penugasan (assignment)
        int y = 10;
        y += 5;
        System.out.println("y += 5  -> " + y);
        y *= 2;
        System.out.println("y *= 2  -> " + y);
        y %= 7;
        System.out.println("y %= 7  -> " + y);

        // Operator Post-increment dan Pre-increment
        int p = 5;

        int q = p++;
        int r = ++p;

        System.out.println("Nilai p = " + p);
        System.out.println("Nilai q = " + q);
        System.out.println("Nilai r = " + r);

    }
}
