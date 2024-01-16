import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];

        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        int i = 0;
        while (i < array.length) {
            if (array[i] == smallest) {
                index = i;
            }
            i++;
        }

        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int i = startIndex;
        int smallest = table[i];
        int index = startIndex;

        while (i < (table.length)) {
            if (table[i] < smallest) {
                smallest = table[i];

            }
            i++;
        }
        int a = 0;
        while (a < table.length) {
            if (table[a] == smallest) {
                index = a;
            }
            a++;
        }

        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        int i = 0;
        int a = 0;

        while (i < array.length) {
            if (i == index1) {
                a = array[i];
                array[i] = array[index2];
                array[index2] = a;
            }
            i++;
        }
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int s = indexOfSmallestFrom(array, i);
            swap(array, i, s);

        }
    }

}
