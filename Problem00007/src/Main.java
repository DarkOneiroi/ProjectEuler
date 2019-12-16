public class Main {

    public static void main(String[] args) {
	long primeNmbr = 0, currentNmbr = 1;
	int nmbrOfPrimes = 10001, primeCount = 0;


	while(primeCount <= nmbrOfPrimes){
		short divisions = 0;
	        for (long j = 1; j < currentNmbr; j++){
	            if((currentNmbr % j) == 0){
	                divisions++;
                }
            }
	        if(divisions == 1){
	            primeNmbr = currentNmbr;
				primeCount++;
	            currentNmbr++;
            }
	        else {
				currentNmbr++;
			}
	        System.out.println("Prave kontroluji " + primeCount + ". prvocislo z " + nmbrOfPrimes + " coz je " + primeNmbr);
    }
	System.out.println("Vysledek " + primeNmbr);
    }
}
