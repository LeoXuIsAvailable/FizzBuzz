public class Multiples {
    public static void main(String[] args) {
        System.out.println(countMultiples(1000));
    }

    private static int countMultiples(int x) {
        int count = 0;
        for (int i = 1; i < x; i++) {
            boolean divbleBy3 = i % 3 == 0;
            boolean divbleBy5 = i % 5 == 0;
            if (divbleBy3 || divbleBy5) {
                count++;
            }
        }
        return count;
    }
}
