public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 1000) {
            i++;

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {

                j++;

            }
        }

        System.out.println(j);

    }
}
