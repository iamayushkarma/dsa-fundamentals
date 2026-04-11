package Heep;

public class HeepBasics {

    // Helper functions
    public static void printHeep() {
        for (int i = 0; i < heepSize; i++) {
            System.out.print(heep[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j) {
        int temp = heep[i];
        heep[i] = heep[j];
        heep[j] = temp;
    }

    // - Insertion on element O(logn)
    // - Removal of min element O(logn)
    // - Get min element O(1)

    static int[] heep;
    static int heepSize;
    static int capacity;

    public HeepBasics(int[] arr) {
        heep = arr;
        heepSize = arr.length;
        capacity = arr.length;
    }

    public static void hepify(int index) {
        int largert = index;
        int leftNode = 2 * index + 1;
        int rightNode = 2 * index + 2;

        if (leftNode < heepSize && heep[leftNode] > heep[largert]) {
            largert = leftNode;
        }
        if (rightNode < heepSize && heep[rightNode] > heep[largert]) {
            largert = rightNode;
        }
        if (largert != index) {
            swap(index, largert);
            hepify(largert);
        }
    }

    public static void buildHeep(int[] arr) {
        for (int i = heepSize / 2 - 1; i >= 0; i--) {
            hepify(i);
        }
    }

    public static int getMax() {
        if (heepSize <= 0)
            return -1;
        int max = heep[0];
        heep[0] = heep[heepSize - 1];
        heepSize -= 1;
        hepify(0);
        System.out.println(max);
        return max;
    }

    public static void changeValue(int i, int newValue) {
        if (i < 0 || i >= heepSize || heep[i] >= newValue)
            return;

        heep[i] = newValue;
        // int parentVal = (int) (Math.ceil((i / 2.0) - 1));
        int parentVal = (i - 1) / 2;

        while (i > 0 && heep[i] > heep[parentVal]) {
            swap(i, parentVal);
            i = parentVal;
            parentVal = (i - 1) / 2;
        }
    }

    public static void main(String[] args) {
        // Implementation of max heep
        int[] arr = { 10, 5, 20, 6, 11 };
        HeepBasics heep = new HeepBasics(arr);
        heep.buildHeep(arr);
        heep.printHeep();
        heep.getMax();
        heep.printHeep();
        heep.changeValue(1, 66);
        heep.printHeep();
    }
}
