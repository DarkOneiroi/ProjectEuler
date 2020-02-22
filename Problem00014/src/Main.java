public class Main {

    public static void main(String[] args) {
        long firstNumber = 1000000;
        int chain = 0;
        Computer computer = new Computer(firstNumber, chain);
        chain = computer.getChain();
        long resultNumber = computer.getResultNumber();

        System.out.println("***********" + " result is " + "***********");
        System.out.println("Longest sequence had " + chain + " steps.");// Answer: 525
        System.out.println("Origin number responsible for this sequence is: " + resultNumber);// Answer: 837799
    }
}
