import java.util.Scanner;
import com.roy.algo.Search;
import com.roy.algo.Sort;

public class Test {
    public static void main(String e[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // using custom sorting algo func

        Sort.quick(arr);
        // using custom binary search algo
        int index = Search.binary(arr, target);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at Index:-->" + index);

    }
}
