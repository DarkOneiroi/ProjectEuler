import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> allResults = new ArrayList<>();
        for (short i = 1; i < 1000; i++){
            for (short j = 1; j < 1000; j++){
                    int temp = i*j;
                    int regular = temp;
                    int reverse = 0;
                    int remainder = 0;
                while(temp > 0){
                        remainder = temp % 10;
                        reverse = (reverse * 10) + remainder;
                        temp = temp / 10;
                }
                    if(regular == reverse){
                        allResults.add(regular);
                    }
                }
            }
        int result = 0;
        for (int k:allResults
        ) {
            if (k > result){
                result = k;
            }
        }
        System.out.println(result);
        }
    }

