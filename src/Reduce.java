public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;
        while (i > 0) {
            i = reduceHelper(i);
            count++;
        }
        System.out.println(count);
    }

    private static int reduceHelper(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return x - 1;
        }
    }
}
