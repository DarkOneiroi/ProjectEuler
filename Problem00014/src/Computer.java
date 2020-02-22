public class Computer {
    private long firstNumber;
    private int chain;
    private long resultNumber;

    public Computer(long firstNumber, int chain) {
        this.firstNumber = firstNumber;
        this.chain = chain;
        compute();
    }

    private void compute(){
        for (long i = firstNumber; i > 0; i--) {
            long cacheNumber = i;
            int cacheChain = 0;
            while (cacheNumber > 1) {
                if ((cacheNumber % 2) == 0) {
                    cacheNumber = cacheNumber / 2;
                } else {
                    cacheNumber = 3 * cacheNumber + 1;
                }
                cacheChain++;
            }
            if (cacheChain > this.chain) {
                this.chain = cacheChain + 1;// + 1 programatorska nula
                this.resultNumber = i;
            }
        }
    }

    public int getChain() {
        return chain;
    }

    public long getResultNumber() {
        return resultNumber;
    }
}
