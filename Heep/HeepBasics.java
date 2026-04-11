package Heep;

public class HeepBasics {

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
            int temp = heep[largert];
            heep[largert] = heep[index];
            heep[index] = temp;
            hepify(largert);
        }
    }

    public static void buildHeep(int[] arr) {
        for (int i = heepSize / 2 - 1; i >= 0; i--) {
            hepify(i);
        }
    }

    // print heep
    public static void printHeep() {
        for (int i = 0; i < heepSize; i++) {
            System.out.print(heep[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Implementation of max heep
        int[] arr = { 10, 5, 20, 6, 11 };
        HeepBasics heep = new HeepBasics(arr);
        heep.buildHeep(arr);
        heep.printHeep();
    }
}
