import java.util.Arrays;
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

        //Task 2
        System.out.println("Задание 2");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array [i] < min){
                min = array[i];
            }
            if (array [i] > max){
                max = array [i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min +" рублей. \nМаксимальная сумма трат за день составила " +max +" рублей.");

        //Task 3
        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " +sum/array.length +" рублей");




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