import java.util.ArrayList;

public class Computer {
    private int result = 0;

    public Computer(int maxNumber) {
        ArrayList<Integer> allResults = new ArrayList<>();
        for (short i = 1; i < maxNumber; i++) {
            for (short j = 1; j < maxNumber; j++) {
                int temp = i * j;
                int regular = temp;
                int reverse = 0;
                int remainder = 0;
                while (temp > 0) {
                    remainder = temp % 10;
                    reverse = (reverse * 10) + remainder;
                    temp = temp / 10;
                }
                if (regular == reverse) {
                    allResults.add(regular);
                }
            }
        }
        for (int k : allResults
        ) {
            if (k > result) {
                result = k;
                System.out.println(k);
            }
        }
    }

    public int getResult() {
        return result;
    }
}
