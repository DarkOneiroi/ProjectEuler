public class Main {

    public static void main(String[] args) {
        short multipleThree = 3;
        short multipleFive = 5;
        short maxNumber = 1000;
        int result = 0;//Answer 233168

        Computer compute = new Computer(multipleThree, multipleFive, maxNumber);
        result = compute.getResult();

        System.out.println(result);
    }
}