package FirstStepsInCodingLab;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = scanner.nextInt();
        int numberOfOtherAnimals = scanner.nextInt();
        double dogFood = 2.50;
        double otherAnimalsFood = 4.00;
        System.out.println(numberOfDogs*dogFood + numberOfOtherAnimals*otherAnimalsFood);

    }

}
