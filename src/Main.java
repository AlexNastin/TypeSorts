import by.nastin.sort.bubble.BubbleSort;
import by.nastin.sort.helper.Printer;
import by.nastin.sort.insertion.InsertionSort;
import by.nastin.sort.sleep.SleepSort;

public class Main {

    public static void main(String[] args) {
        int mass[] = {9, 7, 5, 8, 3};
        int mass1[] = {9, 7, 5, 8, 3};
        int mass2[] = {1, 7, 4, 8, 3};
        int mass3[] = {1, 7, 4, 8, 3};
        InsertionSort.sort(mass);
        BubbleSort.sort(mass1);
        SleepSort.sort(mass2);
        SleepSort.sleepSortAndPrint(mass3);
        Printer.printMass("InsertionSort", mass);
        Printer.printMass("BubbleSort", mass1);
        Printer.printMass("SleepSort", mass2);
    }
}
