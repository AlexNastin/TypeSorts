import by.nastin.sort.bubble.BubbleSort;
import by.nastin.sort.helper.Printer;
import by.nastin.sort.insertion.InsertionSort;

public class Main {

    public static void main(String[] args) {
        int mass[] = {9, 7, 5, 8, 3};
        int mass1[] = {9, 7, 5, 8, 3};
        InsertionSort.sort(mass);
        BubbleSort.sort(mass1);
        Printer.printMass("InsertionSort", mass);
        Printer.printMass("BubbleSort", mass1);
    }
}
