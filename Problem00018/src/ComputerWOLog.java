public class ComputerWOLog {
    /*
     * spravne reseni, ale pro jiny problem, je potreba postupovat odspodu nahoru a ne zeshora vybirat vzdy nejvyssi cislo
     * */
    private int[][] pyramid;
    private int route = 0;

    public ComputerWOLog(int[][] pyramid) {
        this.pyramid = pyramid;
    }

    public int computeWOLog() {
        int indexOfCurrentNumber = 0;
        for (int i = 0; i < pyramid.length; i++) {
            if (pyramid[i].length > 1) {
                if (pyramid[i][indexOfCurrentNumber] > pyramid[i][indexOfCurrentNumber + 1])
                    route += pyramid[i][indexOfCurrentNumber];
                else {
                    indexOfCurrentNumber++;
                    route += pyramid[i][indexOfCurrentNumber];
                }
            } else
                route += pyramid[0][0];
        }
        return route;
    }
}
