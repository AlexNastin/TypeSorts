package by.nastin.sort.selection;

/**
 * Selection Sort
 * Сортировка выбором
 * O(n^2)
 */
public class SelectionSort {

    public static void sort(int mass[]) {
        for (int min = 0; min < mass.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < mass.length; j++) {
                if (mass[j] < mass[least]) {
                    least = j;
                }
            }
            int tmp = mass[min];
            mass[min] = mass[least];
            mass[least] = tmp;
        }
    }
}
