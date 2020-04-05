import java.util.Arrays;

public class QuickSort {

    private int[] array;

    void sort(int[] array) {
        this.array = array;
        int i = 0;
        int j = -1;
        int pivot = array.length - 1;
        startSort(i, j, pivot);
    }

    private void startSort(int i, int j, int pivot) {
        if (j == pivot) {
            return;
        }
        while (i != pivot) {
            if (array[i] > array[pivot]) {
                i++;
            } else {
                j++;
                changeElements(j, i);
                i++;
            }
            if (i == pivot) {
                changeElements(j + 1, pivot);
            }
        }
        startSort(0, -1, j);
        startSort(j+2, j+1, pivot);
    }

    private void changeElements(int x, int y) {
        int temp;
        temp = array[y];
        array[y] = array[x];
        array[x] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 1, 4, 9, 7, 6, 10, 0, 7};
        new QuickSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
