public class Computer {
    private int multipleThree;
    private int multipleFive;
    private int maxNumber;
    private int result = 0;

    public Computer(int multipleThree, int multipleFive, int maxNumber) {
        this.multipleThree = multipleThree;
        this.multipleFive = multipleFive;
        this.maxNumber = maxNumber;
        compute();
    }

    private void compute() {
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
