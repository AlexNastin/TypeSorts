package by.nastin.sort.helper;

public class Printer {

    public static void printMass(String nameSort, int mass[]) {
        System.out.println("Start. Length mass: " + mass.length + " Name Sort: " + nameSort);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("Finish.");
    }

    public static void printMass(int mass[]) {
        System.out.println("Start. Length mass: " + mass.length);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        System.out.println("Finish.");
    }
}
