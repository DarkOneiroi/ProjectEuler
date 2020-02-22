
public class SecondComputer {

/*
 * with logging
 * */

    private int[][] pyramid;
    private int indexOfCurrentNumber = 0;
    int route = 0;

    public SecondComputer(int[][] pyramid){
        this.pyramid = pyramid;
    }

    public int compute() {
        for (int i = 0; i < pyramid.length; i++) {
            int j = indexOfCurrentNumber;
            int currentNumber = 0; //just for logging
            if (pyramid[i].length > 1) {
                if (pyramid[i][j] > pyramid[i][j + 1]){
                    route += pyramid[i][j];
                    currentNumber = pyramid[i][j];
                }
                if (pyramid[i][j] < pyramid[i][j + 1]){
                    route += pyramid[i][j + 1];
                    currentNumber = pyramid[i][j + 1];
                    indexOfCurrentNumber++;
                }
            }
            else {
                route += pyramid[0][0];
                currentNumber = pyramid[0][0];
            }
            //route += currentNumber;
            System.out.println("array nmbr: " + (i + 1) + " current nmbr: " + currentNumber + " index of number is: " + indexOfCurrentNumber + " also not totaly real route nmbr is: " + route);
        }
        return route;
    }


}

