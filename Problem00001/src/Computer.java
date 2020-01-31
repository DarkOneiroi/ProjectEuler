public class Computer {
    private int result = 0;

    public Computer(int multipleThree, int multipleFive, int maxNumber) {
        for (int i = 0; i < maxNumber; i++) {
            if (((i % multipleThree) == 0) || ((i % multipleFive) == 0)) {
                result += i;
            }
        }
    }

    public int getResult() {
        return result;
    }
}
