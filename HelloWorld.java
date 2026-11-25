public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from PDCAssignment2, built by Jenkins!");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of 1..10 = " + sum);
    }
}
