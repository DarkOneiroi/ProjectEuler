import java.util.ArrayList;

public class Computer {
    private long inputNmbr;
    private long multiplication;
    private ArrayList<Long> results = new ArrayList<>();//inicializace ArrayListu - nemusim s nim kopirovat cele array, kdyz chci pridat dalsi prvek

    public Computer(long inputNmbr, long multiplication) {
        this.inputNmbr = inputNmbr;
        this.multiplication = multiplication;
        compute();
    }

    private void compute(){
        for (long i = 0L; i < inputNmbr; i++) {
            short j = 1;
            short divisionNmbrs = 0;
            while ((j < 10)) {
                if ((i % j) == 0)
                    divisionNmbrs++;
                j++;
            }
            if ((divisionNmbrs == 1) && ((inputNmbr % i) == 0)) {
                results.add(i);//pridani vysledku do ArrayListu
                multiplication *= i;
                if (multiplication == inputNmbr) {
                    System.out.printf("Nejvetsi prime factor je %d.%n", i);

                    break;
                }
            }
        }
    }

    public ArrayList<Long> getResults() {
        return results;
    }
}
