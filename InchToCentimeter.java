package FirstStepsInCodingLab;

import java.util.Scanner;

public class InchToCentimeter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inches amount = ");
        double inches = scanner.nextDouble();



        double centimeters = inches * 2.54;
        System.out.print("Centimeters = " + centimeters);



    }

}
