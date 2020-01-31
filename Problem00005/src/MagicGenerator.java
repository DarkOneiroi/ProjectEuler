public class MagicGenerator {
    public long number;

    public MagicGenerator(int number) {
        this.number = number;
        for (int i = 1; i < number; i++) {
            if (((this.number % i) == 0)) {
                continue;
            } else {
                this.number++;
                i = 1;
            }
        }
    }

    public long getNumber() {
        return number;
    }
}
