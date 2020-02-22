public class Computer {
    private int cacheNmbr;
    private int first;
    private int second;
    private int maxNmbr;
    private int result;

    public Computer(int cacheNmbr, int first, int second, int maxNmbr) {
        this.cacheNmbr = cacheNmbr;
        this.first = first;
        this.second = second;
        this.maxNmbr = maxNmbr;
        result=second;
        compute();
    }

    private void compute(){
        while((cacheNmbr + first) < maxNmbr){
            cacheNmbr = first + second;
            first = second;
            second = cacheNmbr;
            if((cacheNmbr % 2) == 0)
                result += cacheNmbr;
        }
        System.out.printf("Vysledek je: %d%nKonecny stav:%nfirst %d, second %d, cache %d.", result, first, second, cacheNmbr);
    }
}
