public class MagicGenerator {
    private long magicNumber;
    public long number = 1;

    public MagicGenerator(int magicNumber) {
        this.magicNumber = magicNumber;
        magick();
    }

    private void magick(){
        for (int i = 1; i < magicNumber; i++) {
            if (((number % i) == 0)) {
                continue;
            } else {
                number++;
                i = 1;
            }
        }
    }

    public long getNumber() {
        return number;
    }
}
