import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//      two numbers, takes two numbers as input

        System.out.print("Input first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
        if (num2 == 0) {
            System.out.println(num1 + " ÷ " + num2 + " = Undefined");
            System.out.println(num1 + " mod " + num2 + " = Undefined");
        }
        else {
            System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        }

        System.out.println("--------------------------------------------------");

//      2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

        System.out.print("Input a number: ");
        int num3 = input.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(num3 + " × " + i + " = " + (num3 * i));

        System.out.println("--------------------------------------------------");

//      3. Write a Java program to print the area and perimeter of a circle.

        double radius = 7.5;
        System.out.printf("Perimeter is = %f%n", (2 * 3.14 * radius));
        System.out.printf("Area is = %f%n", (3.14 * (radius * radius)));

        System.out.println("--------------------------------------------------");

//      4. Java program to find out the average of a set of integers.

        System.out.println("Enter the count of numbers: ");
        float count = input.nextInt();
        float avg = 0;

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Enter an integer: ");
                avg += input.nextFloat();
            }
            System.out.printf("The average is: %.1f%n", avg / count);
        }
        else System.out.println("You did not input any number");

        System.out.println("--------------------------------------------------");

//      5. Write a Java program that accepts three integers as input, adds the first two integers
//      together, and then determines whether the sum is equal to the third integer.

        System.out.print("Input the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = input.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = input.nextInt();

        System.out.println("The result is: " + ((firstNum + secondNum) == thirdNum));

        System.out.println("--------------------------------------------------");

//      6. Write a Java program to reverse a word.

        System.out.print("Input a word: ");
        String userWord = input.next();

        System.out.print("Reverse word: ");
        for (int i = userWord.length() - 1; i >= 0; i--)
            System.out.print(userWord.charAt(i));

        System.out.println("\n--------------------------------------------------");

//      7. Java program to check whether the given number is even or odd.

        System.out.print("Enter a number: ");
        int userNum = input.nextInt();

        if (userNum % 2 == 0)
            System.out.println("The number is Even");

        else System.out.println("The number is Odd");

        System.out.println("--------------------------------------------------");

//      8. Java program to convert the temperature in Centigrade to Fahrenheit.

        System.out.print("Enter temperature in Centigrade: ");
        float temperature = input.nextFloat();

        System.out.printf("Temperature in Fahrenheit is %.1f%n", ((temperature * 9) / 5) + 32);

        System.out.println("--------------------------------------------------");

//      9. Write a Java program that takes a string and a number from the user, then prints the
//      character in the given index.

        System.out.print("Input a string: ");
        String userString = input.nextLine();
        userString = input.nextLine();

        System.out.print("Input a number: ");
        System.out.println(userString.charAt(input.nextInt()));

        System.out.println("--------------------------------------------------");

//      10. Write a Java program to print the area and perimeter of a rectangle.

        double width = 5.5, height = 8.5;

        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, width * height);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, 2 * (width + height));

        System.out.println("--------------------------------------------------");

//      11. Write a Java program to compare two numbers.

        System.out.print("Input first integer: ");
        int firstInt = input.nextInt();

        System.out.print("Input the second integer: ");
        int secondInt = input.nextInt();

        if (firstInt == secondInt)
            System.out.println(firstInt + " = " + secondInt);

        if (firstInt != secondInt)
            System.out.println(firstInt + " != " + secondInt);

        if (firstInt > secondInt)
            System.out.println(firstInt + " > " + secondInt);

        if (firstInt >= secondInt)
            System.out.println(firstInt + " >= " + secondInt);

        if (firstInt < secondInt)
            System.out.println(firstInt + " < " + secondInt);

        if (firstInt <= secondInt)
            System.out.println(firstInt + " <= " + secondInt);

        System.out.println("--------------------------------------------------");

//      12. Write a Java program to convert seconds to hours. minutes and seconds.

        System.out.print("Input seconds: ");
        double seconds = input.nextInt();

        double hours = seconds / 3600;
        double minutes = (seconds % 3600);
        double newSeconds = minutes % 60;

        minutes /= 60;

        System.out.println((int) Math.floor(hours) + ":" + (int) Math.floor(minutes) + ":" + (int) Math.floor(newSeconds));
        System.out.println("--------------------------------------------------");

//      13. Write a Java program that accepts four integers from the user and prints equal if all
//      four are equal, and not equal otherwise.

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Input third number: ");
        int thirdNumber = input.nextInt();

        System.out.print("Input forth number: ");
        int fourthNumber = input.nextInt();

        if (firstNumber == secondNumber || secondNumber == thirdNumber || thirdNumber == fourthNumber)
            System.out.println("Numbers are equal!");

        else System.out.println("Numbers are not equal!");

        System.out.println("--------------------------------------------------");

//      14. Write a Java program that reads an integer and check whether it is negative, zero
//      or positive.

        System.out.print("Input a number: ");
        int checkNum = input.nextInt();

        if (checkNum == 0)
            System.out.println("Number is 0");

        else if (checkNum > 0)
            System.out.println("Number is positive");

        else System.out.println("Number is negative");

        System.out.println("--------------------------------------------------");

//      15. Write a program to enter the numbers till the user wants and at the end it
//      should display the count of positive, negative and zeros entered (End loop use -1,
//      Don't count -1).

        int positiveCount = 0, negativeCount = 0, zeroCount = 0, userInt = 0;

        do {
            System.out.print("Input a number, or -1 to quit: ");
            userInt = input.nextInt();

            if (userInt == -1) break;

            else if (userInt > 0)
                positiveCount++;
            else if (userInt < 0)
                negativeCount++;
            else
                zeroCount ++;
        } while (userInt != -1);

        System.out.println(
                positiveCount + " positives\n" +
                zeroCount + " zeros\n" +
                negativeCount + " negatives");

        System.out.println("--------------------------------------------------");

//      16. Write a program that prompts the user to input an integer and then outputs the
//      number with the digits reversed.

        System.out.print("Input a number: ");
        String strNumber = input.next();

        for (int i = strNumber.length() - 1; i >= 0; i--)
            System.out.print(strNumber.charAt(i));

        System.out.println("\n--------------------------------------------------");

//      17. Write a program to enter the numbers till the user want and at the end the
//      program should display the largest and smallest number entered.

        int max = 0, min = 9999, number = 0;

        do {
            System.out.print("Enter a number, or 0 to quit: ");
            number = input.nextInt();

            if (max <= number)
                max = number;
            if (min >= number)
                min = number;
        } while (number != 0);

        System.out.println(
                "\nThe largest number is: " + max +
                "\nThe smallest number is: " + min
        );

        System.out.println("--------------------------------------------------");

//      18. Determine and print the number of time the character 'a' appears in the input
//      entered by the user.

        int counter = 0;
        System.out.print("Enter a string: ");
        String userStr = input.nextLine();
        userStr = input.nextLine();

        char let = 'a';

        for (int i = 0; i < userStr.length() - 1; i++) {
            if (userStr.substring(i,i+1).equals("a"))
                counter++;
        }

        System.out.println("Number of 'a's: " + counter);
    }
}
