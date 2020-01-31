public class Main {

    public static void main(String[] args) {
        int nmbrOfPrimes = 10001; //default 10001
        long primeNmbr = 0;

        Computer computer = new Computer(nmbrOfPrimes);
        primeNmbr = computer.getPrimeNmbr();

        System.out.println("Vysledek " + primeNmbr);//Answer 104743
    }
}
