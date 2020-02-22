public class Main {

    public static void main(String[] args) {
        int nmbrOfPrimes = 10001; //default 10001

        Computer computer = new Computer(nmbrOfPrimes);
        long primeNmbr = computer.getPrimeNmbr();

        System.out.println("Vysledek " + primeNmbr);//Answer 104743
    }
}
