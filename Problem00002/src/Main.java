public class Main {

    public static void main(String[] args) {
	int first = 1;
	int second = 2;
	int cacheNmbr = 0;
	int maxNmbr = 4000000;
	int result = second;

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
