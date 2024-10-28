public class task18 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = reverse(list1);
        System.out.print("List1: ");
        for (int value1 : list1) {
            System.out.print(value1 + " ");
        }
        System.out.print("\nList2: ");
        for (int value2 : list2) {
            System.out.print(value2 + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }
}
