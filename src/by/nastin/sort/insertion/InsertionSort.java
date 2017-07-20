package by.nastin.sort.insertion;


/**
 * Insertion Sort repeatedly swapping adjacent element
 * Вставка Сортировка: многократная замена соседнего элемента
 * O(n^2)
 */
public class InsertionSort {

    public static int[] sort(int mass[]) {
        int temp;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i; (j > 0) && (mass[j] < mass[j - 1]); j--) {
                temp =  mass[j - 1];
                mass[j - 1] = mass[j];
                mass[j] = temp;
            }
        }
        return mass;
    }
}
