package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many people?");
        int people = scnr.nextInt();

        System.out.println("How many pizza's do you have?");
        int pizza = scnr.nextInt();

        if(pizza <= 0){
            System.out.println("No pizza's for bozo's");
            System.out.format("%d people get 0 pizza's (0 slices)\n", people);
            System.out.println("There are 0 leftover pieces\n");
            System.exit(0);
        }

        System.out.println("How many slices per pizza?");
        int slices = scnr.nextInt();

        slices *= pizza;
        System.out.format("%d people with %d pizzas (%d slices)\n", people, pizza, slices);

        slices /= people;
        System.out.format("Each person gets %d pieces of pizza\n", slices);

        int leftovers = slices % people;
        System.out.format("There are %d leftover pieces", leftovers);
    }
}
