package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;

        if (a == b) {
            for (int i = 1; i < n; i++) {
                if (i % a == 0) {
                    count++;
                }
            }
            return count;
        }

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }
    }
