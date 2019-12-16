public class Main {

    public static void main(String[] args) {
	int result = 0, squared = 0, sumed = 0, squaredFinal = 0;

	for (short i = 1; i < 101; i++){
	    squared = i * i;
	    squaredFinal += squared;
	    sumed += i;
    }
	sumed *= sumed;
	result = sumed - squaredFinal;
	System.out.println(result);
    }
}
