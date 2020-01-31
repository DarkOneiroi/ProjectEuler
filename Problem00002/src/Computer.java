public class Computer {
    public Computer(int cacheNmbr, int first, int second, int maxNmbr, int result) {
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
