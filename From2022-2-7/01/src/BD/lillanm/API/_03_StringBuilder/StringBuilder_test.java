package BD.lillanm.API._03_StringBuilder;

public class StringBuilder_test {
    public static void main(String[] args) {

        int[] arr1 = {};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr3 = null;
        System.out.println(toString(arr1));
        System.out.println(toString(arr2));
        System.out.println(toString(arr3));
    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return null;
        }
        else {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
