public class Computer {
    private int numbers;
    private int result = 0;

    public Computer(int numbers) {
        this.numbers = numbers;
        compute();
    }

    private void compute(){
        int squared = 0, sumed = 0, squaredFinal = 0;
        for (short i = 1; i < (numbers + 1); i++) {
            squared = i * i;
            squaredFinal += squared;
            sumed += i;
        }
        sumed *= sumed;
        result = sumed - squaredFinal;
    }

    public int getResult() {
        return result;
    }
}
