public class Main {

    public static void main(String[] args) {
        int magickNumber = 21;
	for(short i = 1; i < 21; i++){
	    if(((magickNumber%i) == 0)){
	        continue;
        }
	    else {
	        magickNumber++;
	        i = 1;
        }
    }
	System.out.println(magickNumber);
    }
}
