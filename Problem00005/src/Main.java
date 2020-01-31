public class Main {

    public static void main(String[] args) {
        /**
         * Smallest number that can be divided by all numbers from 1 to magickNumber without remainder
         */
        int magickNumber = 21; //default 21, watch out for overflow, result is big
        MagicGenerator magicGenerator = new MagicGenerator(magickNumber);

        long resultNumber = magicGenerator.getNumber();//Answer 232792560
        System.out.println(resultNumber);
    }
}
