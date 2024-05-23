/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {
        mainHelper();
    }

    public static void mainHelper() {
        for (int i = 1; i < 15; i++) {
            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}


class FizzBuzz2 {
    // Adding a comment to see what happens
    public static void notMain(String[] args) {
        int i = 1;
        while (i < 100) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                System.out.println("FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println("Fizz");
            } else if (divisibleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
