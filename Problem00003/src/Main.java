import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	long inputNmbr = 600851475143L;
	long multiplication = 1;
	ArrayList<Long> results = new ArrayList<>();//inicializace ArrayListu - nemusim s nim kopirovat cele array, kdyz chci pridat dalsi prvek

	for (long i = 0L; i < inputNmbr; i++) {
        short j = 1;
        short divisionNmbrs = 0;
        while ((j < 10)) {
            if((i % j) == 0)
                divisionNmbrs++;
            j++;
        }
        if((divisionNmbrs == 1) && ((inputNmbr % i) == 0)) {
            results.add(i);//pridani vysledku do ArrayListu
            multiplication *= i;
            if(multiplication == inputNmbr){
                System.out.printf("Nejvetsi prime factor je %d.%n", i);
                System.out.println("Nasel jsem tato prvocisla:");
                for (long k:results) {
                    System.out.print(k + ", ");
                }
                break;
            }
        }
    }
    }
}