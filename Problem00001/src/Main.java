public class Main {

    public static void main(String[] args) {
	short multipleThree = 3;
	short multipleFive = 5;
	short maxNumber = 1000;
	int result = 0;

	for(int i = 0; i < 1000; i++) {
		if (((i % multipleThree) == 0) || ((i % multipleFive) == 0)) {
			result += i;
		}
	}
	System.out.println(result);
    }
}
