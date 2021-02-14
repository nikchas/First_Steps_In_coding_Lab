package FirstStepsInCodingLab;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args){

        //namirane na lice na kvadrat

        Scanner sc = new Scanner(System.in);

        System.out.println("a= ");
        int a = sc.nextInt();
        int lice = a*a;
        System.out.println("liceto e " + lice);

    }

}
