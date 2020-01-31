import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long inputNmbr = 600851475143L;
        long multiplication = 1;
        ArrayList<Long> results;//Answer 6857


        Computer computer = new Computer(inputNmbr, multiplication);
        results = computer.getResults();
        System.out.println("Nasel jsem tato prvocisla:");
        for (long k : results) {
            System.out.print(k + ", ");
        }
    }
}
