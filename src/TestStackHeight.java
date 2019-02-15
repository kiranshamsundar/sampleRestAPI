import java.io.IOException;
import java.util.*;

public class TestStackHeight {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) throws IOException {


   /*     int result = equalStacks(new int[]{1, 1, 1, 2, 3}, new int[]{2, 3, 4}, new int[]{1, 4, 1, 1});

        System.out.println(result);*/

        oddNumbers(2, 5
        );


    }


    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */


        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        HashMap<String, Integer> sumOfS1 = new HashMap<>();
        HashMap<String, Integer> sumOfS2 = new HashMap<>();
        HashMap<String, Integer> sumOfS3 = new HashMap<>();

        sumOfS1.put("sum", 0);

        sumOfS2.put("sum", 0);

        sumOfS3.put("sum", 0);


        for (int item : h1
        ) {
            s1.add(item);

            sumOfS1.put("sum", sumOfS1.get("sum") + item);

        }

        for (int item : h2
        ) {
            s2.add(item);

            sumOfS2.put("sum", sumOfS2.get("sum") + item);

        }

        for (int item : h3
        ) {
            s3.add(item);

            sumOfS3.put("sum", sumOfS3.get("sum") + item);

        }


        while (s1.peek() != null && s2.peek() != null && s3.peek() != null) {

            if (sumOfS1.get("sum") > sumOfS2.get("sum")) {
                if (sumOfS1.get("sum") > sumOfS3.get("sum")) {
                    int item = s1.pop();
                    sumOfS1.put("sum", sumOfS1.get("sum") - item);
                    continue;
                } else {
                    int item = s3.pop();
                    sumOfS3.put("sum", sumOfS3.get("sum") - item);
                    continue;
                }

            } else if (sumOfS2.get("sum") > sumOfS3.get("sum")) {

                int item = s2.pop();
                sumOfS2.put("sum", sumOfS2.get("sum") - item);
            } else {
                return sumOfS1.get("sum");
            }


        }


        return 0;

    }


    static String findNumber(List<Integer> arr, int k) {
        String result = "NO";
        for (int i : arr) {
            if (i == k) {
                result = "YES";
            }


        }

        return result;

    }


    static List<Integer> oddNumbers(int l, int r) {

        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {

            if (!(i % 2 == 0)) {
                System.out.println(i);
                result.add(i);
            }


        }

        return result;

    }


}
