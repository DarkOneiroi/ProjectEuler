import java.util.ArrayList;

public class AllResults {
    ArrayList<Integer> allResults = new ArrayList<>();

    public void add(int temp) {
        allResults.add(temp);
    }

    public void printAllResults() {
        for (int i:allResults
        ) {
            System.out.println(i);
        }
    }

}
