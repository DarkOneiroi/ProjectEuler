import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 1000;//we are finding biggest palyndrome from result of multiplication of two 3 digit numbers
        Computer computer = new Computer(maxNumber);
        int result = computer.getResult();//Answer 906609

        System.out.println("Nejvetsi palyndrom nasobku trojcifernych cisel je:");
        System.out.println(result);
    }
}

