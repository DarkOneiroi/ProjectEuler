public class Main {

    public static void main(String[] args) {
        long firstNumber = 1000000;
        int chain = 0;
        Computer computer = new Computer(firstNumber, chain);
        chain = computer.getChain();

        System.out.println("***********" + " result is " + "***********");
        System.out.println(chain);
    }
}
