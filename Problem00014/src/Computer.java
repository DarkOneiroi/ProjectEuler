public class Computer {
    int chain;

    public Computer(long firstNumber, int chain) {
        this.chain = chain;
        for (long i = firstNumber; i > 0; i--) {
            long cacheNumber = i;
            int cacheChain = 0;
            //System.out.println("We are at i number: " + i);
            while (cacheNumber > 1) {
                /*if (cacheNumber < 1) {
                    System.out.println("NEGATIVE ERRORRRRR");
                }*/
                if ((cacheNumber % 2) == 0) {
                    cacheNumber = cacheNumber / 2;
                } else {
                    cacheNumber = 3 * cacheNumber + 1;
                } /*else {
                    System.out.println("UNKOWN ERRORRRRR");
                }*/
                cacheChain++;
                //System.out.println("cacheNumber " + cacheNumber);
            }
            if (cacheChain > this.chain) {
                this.chain = cacheChain;
                //System.out.println(chain);
            }
        }
    }

    public int getChain() {
        return chain;
    }
}
