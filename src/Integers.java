import java.util.Random;

public class Integers {
    public static void main(String[] args) {
        Random random = new Random();
        int random_number = random.nextInt(100001) + 11;
        String number_str = Integer.toString(random_number);
        int sum_of_digits = 0;
        System.out.println("Сгенерированное число: " + random_number);
        System.out.print("Числа, из которых состоит число: ");
        int temp = random_number;
        while (temp > 0) {
            int digit = temp % 10;
            System.out.print(digit + " " );
            sum_of_digits += digit;
            temp /= 10;
        }
        System.out.println("\nСумма разрядов числа: " + sum_of_digits);
        System.out.println("Количество разрядов: " + number_str.length());
    }
}





