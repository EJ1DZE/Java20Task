import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //TASK1
        
//        System.out.println("Введите число");
//        int num = in.nextInt();
//        if(num % 2 == 0)
//        {
//            System.out.println("Вы ввели четное число");
//        }
//        else if(num % 2 == 1)
//        {
//            System.out.println(("Вы ввели нечетное число"));
//        }

        //TASK2

//        System.out.println("Введите первое число");
//        int num1 = in.nextInt();
//        System.out.println("Введите второе число");
//        int num2 = in.nextInt();
//        System.out.println("Введите третье число");
//        int num3 = in.nextInt();
//        int numMin = 0;
//        if(num1 < num2 && num1 < num3)
//        {
//            numMin = num1;
//        }
//        else if(num2 < num1 && num2 < num3)
//        {
//            numMin = num2;
//        }
//        else if(num3 < num1 && num3 < num2)
//        {
//            numMin = num3;
//        }
//        System.out.println(numMin);

        //TASK3

//        int five = 5;
//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println((i * five));
//        }

        //TASK4

//        System.out.println("Введите число");
//        int number = in.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= number; i++)
//        {
//            sum += i;
//        }
//        System.out.println(sum);

        //TASK5

//        System.out.println(("Введите количество чисел Фибоначи"));
//        int number = in.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        System.out.println(num1);
//        System.out.println(num2);
//        for (int i = 0; i < number - 2; i++)
//        {
//            int num3 = num1 + num2;
//            num1 = num2;
//            num2 = num3;
//            System.out.println(num3);
//        }

        //TASK6

//        int num = in.nextInt();
//        int k = 0;
//        for (int i = 1; i <= num; i ++)
//        {
//            if(num % i == 0)
//            {
//                k++;
//                if(k > 2)
//                {
//                    System.out.printf("Число %d не простое \n", num);
//                    break;
//                }
//            }
//
//        }
//        if(k == 2)
//        {
//            System.out.printf("Число %d простое \n", num);
//        }

        //TASK7

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        for (int i = num; i > 0; i--)
//        {
//            System.out.println(i);
//        }

        //TASK8

//        System.out.println("Введите число A");
//        int A = in.nextInt();
//        System.out.println("Введите число B");
//        int B = in.nextInt();
//        int sum = 0;
//        if(A % 2 == 0)
//        {
//            for(int i = A; i <= B; i += 2)
//            {
//                sum += i;
//            }
//        }
//        else if(A % 2 == 1)
//        {
//            for(int i = A + 1; i <= B; i += 2)
//            {
//                sum += i;
//            }
//        }
//        System.out.printf("Сумма четных чисел в диапазоне от %d до %d равно %d \n", A, B, sum);

        //TASK9

//        System.out.println("Введите строку");
//        String stroka = in.next();
//        stroka = reverse(stroka);
//        System.out.println(stroka);

        //TASK10

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        String number = Integer.toString(num);
//        System.out.printf("Количество в этом числе равно %d \n", number.length());

        //TASK11

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= num; i++)
//        {
//            factorial *= i;
//        }
//        System.out.printf("Факториал числа %d равен %d \n", num, factorial);

        //TASK12

//        System.out.println("Введите число");
//        int num = in.nextInt();
//        int number = num;
//        int sum = 0;
//        while(num > 0)
//        {
//            int digit = num % 10;
//            sum += digit;
//            num = num / 10;
//        }
//        System.out.printf("Сумма цифр числа %d равна %d \n", number, sum);

        //TASK13

//        System.out.println("Введите строку");
//        String stroka = in.next();
//        String newStroka = reverse(stroka);
//        if(stroka.equals(newStroka))
//        {
//            System.out.printf("Строка %s является палиндромом \n", stroka);
//        }
//        else
//        {
//            System.out.printf("Строка %s не является палиндромом \n", stroka);
//        }

        //TASK14

//        System.out.println("Введите размер массива");
//        int size = in.nextInt();
//        int[] mas = fillingMas(size);
//        int max = Arrays.stream(mas).max().getAsInt();
//        System.out.printf("Максимальное число в массиве равно %d \n", max);

        //TASK15

//        System.out.println("Введите размер массива");
//        int size = in.nextInt();
//        int[] mas = fillingMas(size);
//        int sum = Arrays.stream(mas).sum();
//        System.out.printf("Сумма элементов массива равна %d \n", sum);

        //TASK16

//        System.out.println("Введите размер массива");
//        int size = in.nextInt();
//        int[] mas = fillingMas(size);
//        int plus = 0;
//        int minus = 0;
//        for (int i = 0; i < size; i++)
//        {
//            if(mas[i] >= 0)
//            {
//                plus ++;
//            }
//            else if(mas[i] < 0)
//            {
//                minus ++;
//            }
//        }
//        System.out.printf("Количество отрицательных чисел равно %d \n Количество положительных чисел равно %d \n", minus, plus);

        //TASK17

//        System.out.println("Введите число A");
//        int A = in.nextInt();
//        System.out.println("Введите число B");
//        int B = in.nextInt();
//        for (int i = A; i <= B; i++)
//        {
//            int k = 0;
//            for (int j = 1; j <= i; j++)
//            {
//                if(i % j == 0)
//                {
//                    k++;
//                    if(k > 2)
//                    {
//                        break;
//                    }
//                }
//
//            }
//            if(k == 2)
//            {
//                System.out.println(i);
//            }
//        }

        //TASK18

//        System.out.println("Введите строку");
//        String stroka = in.next().toLowerCase();
//        String vowels = "aeiouyаеёиоуыэюя";
//        int vowel = 0;
//        int consonants = 0;
//        for (int i = 0; i < stroka.length(); i++)
//        {
//            char letter = stroka.charAt(i);
//            if(vowels.contains(Character.toString(letter)))
//            {
//                vowel++;
//            }
//            else
//            {
//                consonants++;
//            }
//        }
//        System.out.printf("В данной строке %d гласных и %d согласных \n", vowel, consonants);

        //TASK19

//        System.out.println("Введите строку");
//        String stroka = in.nextLine();
//        String[] words = stroka.split(" ");
//        for (int i = words.length - 1; i >= 0; i--)
//        {
//            System.out.printf(words[i] + " ");
//        }

        //TASK20

//        System.out.println("Введите число");
//        int number = in.nextInt();
//        int originalNum = number;
//        String num = Integer.toString(number);
//        int sumDigital = 0;
//        int degree = num.length();
//        int numberArmstrong = 0;
//        for (int i = 0; i < num.length(); i++) {
//            int digital = number % 10;
//            numberArmstrong += Math.pow(digital, degree);
//            number = number / 10;
//
//        }
//        if(originalNum == numberArmstrong)
//        {
//            System.out.printf("Число %d является числом Армстронга \n", originalNum);
//        }
//        else
//        {
//            System.out.printf("Число %d не является числом Армстронга \n", originalNum);
//        }
    }

    public static String reverse(String stroka)
    {
        StringBuilder sb = new StringBuilder(stroka);
        sb.reverse();
        String newStroka = sb.toString();

        return newStroka;
    }

    public static int[] fillingMas(int size)
    {
        Scanner in = new Scanner(System.in);
        int[] mas = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Введите элемент массива");
            mas[i] = in.nextInt();
        }

        return mas;
    }

}