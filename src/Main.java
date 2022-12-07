import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        //Task 1
        System.out.println("Задание 1");
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " +sum +" рублей");



    }



    public static int[] arrayRandom (int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

}