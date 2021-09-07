package Fahrenheit.cnverter;

//input from user
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        startconverter();
    }

public static void  startconverter() {

    //Facts
    Scanner in = new Scanner(System.in);
    int number;
    int result = 0;

    for (int i = 0; i < 2; i++) {

        while (true) {

            int operation;

            System.out.println("Which way do you whant to convert: \n" +
                    "1. Celsius to Fahrenheit\n" +
                    "2. Fahrenheit to Celsius\n");

            operation = in.nextInt();

            if (operation < 1 || operation > 2) {
                System.out.println("Pick one allready, will you!:");
            }

            System.out.println("What is the temperature you want converted?");
            number = in.nextInt();

            switch (operation) {
                case 1:
                    result = number * 9 / 5 + 32;
                    //type celsius to fahrenheit
                    break;
                case 2:
                    result = ((number - 32) * 5) / 9;
                    //type fahrenheit to celsius
                    break;
                default:
                    result = 0;


            }
            System.out.println("The tempature is: " + result);
            System.out.println(" ");
        }
    }
}}
