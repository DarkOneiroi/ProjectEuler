public class Computer {
    private long primeNmbr = 0, currentNmbr = 1;
    private int nmbrOfPrimes = 0, primeCount = 0;

    public Computer(int nmbrOfPrimes) {
        this.nmbrOfPrimes = nmbrOfPrimes;
        while (primeCount < this.nmbrOfPrimes) {
            short divisions = 0;
            for (long j = 1; j < currentNmbr; j++) {
                if ((currentNmbr % j) == 0) {
                    divisions++;
                }
            }
            if (divisions == 1) {
                primeNmbr = currentNmbr;
                primeCount++;
                currentNmbr++;
            } else {
                currentNmbr++;
            }
            //System.out.println("Prave kontroluji " + primeCount + ". prvocislo z " + this.nmbrOfPrimes + " coz je " + primeNmbr);
        }
    }

    public long getPrimeNmbr() {
        return primeNmbr;
    }
}
