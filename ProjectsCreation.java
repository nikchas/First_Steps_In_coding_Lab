package FirstStepsInCodingLab;

import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int amountOfProjects = scanner.nextInt();
        int amountOfHoursForOneProject = 3;
        System.out.println("The architect " + name + " will need " + amountOfHoursForOneProject*amountOfProjects + " hours to complete " + amountOfProjects + " project/s.");

    }

}
