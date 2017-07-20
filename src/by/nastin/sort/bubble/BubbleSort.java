package by.nastin.sort.bubble;

/**
 * Bubble Sort repeatedly swapping adjacent element that out of order
 * Пузырьковая Сортировка: многократно меняет соседний элемент, который не соответствует порядку
 * O(n^2)
 */
public class BubbleSort {

    public static int[] sort(int mass[]) {
        for (int j = 0; j < mass.length - 1; j++) {
            for (int k = j + 1; k < mass.length; k++) {
                if (mass[j] < mass[k]) {
                    int temp = mass[k];
                    mass[k] = mass[j];
                    mass[j] = temp;
                }
            }
        }
        return mass;
    }
}
