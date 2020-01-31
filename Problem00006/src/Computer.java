public class Computer {
    private int result = 0, squared = 0, sumed = 0, squaredFinal = 0;

    public Computer(int numbers) {
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
