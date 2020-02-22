/*
public class WrongComputer {
*/
/*
 * Toto reseni nefunguje uplne spravne, obcas vezme jine cislo, napr na radku s tremi ciframi 17 47 82 bere 82 i kdyz by melo vzit 47
 *
 * *//*

    private int[][] pyramid;
    private int indexOfCurrentNumber = 0;
    int route = 0;

    public WrongComputer(int[][] pyramid){
        this.pyramid = pyramid;
        compute();
    }

    private void compute() {
        for (int i = 0; i < pyramid.length; i++) {
            int j = 0;
            int currentNumber = 0;
            int k = indexOfCurrentNumber;
            while ((k < pyramid[i].length) && (k <= (indexOfCurrentNumber + 1))) {
                if(pyramid[i][k] > currentNumber) {
                    currentNumber = pyramid[i][k];
                    indexOfCurrentNumber = k;
                }
                k++;
            }
            route += currentNumber;
            System.out.println("array nmbr: " + (i + 1) + " current nmbr: " + currentNumber + " index of number is: " + indexOfCurrentNumber + " also not totaly real route nmbr is: " + route);
        }
    }


}
*/
