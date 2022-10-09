import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "This";
        arr[1] = "copy";
        arr[2] = "is";
        arr[3] = "Not";
        arr[4] = "COPy";

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i].equalsIgnoreCase(arr[i1])) {
                    arr[i] = null;
                    arr[i1] = null;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}