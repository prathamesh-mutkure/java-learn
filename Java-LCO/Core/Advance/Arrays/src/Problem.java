import java.util.ArrayList;
import java.util.Scanner;

public class Problem {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n, k, i;

        n = in.nextInt();
        k = in.nextInt();

        int[] nums = new int[n];

        for(i=0; i<n; i++)
            nums[i] = in.nextInt();

        solution(nums, k, n);
    }

    private static void solution(int[] nums, int k, int n)
    {
        int i, j;

        ArrayList<Integer> nonDivisibleValues = new ArrayList<>();

        for (i=0; i<n; i++)
        {
            for (j=i+1; j<n; j++)
            {
                if (((nums[i] + nums[j]) % k) != 0)
                {
                    if (!nonDivisibleValues.contains(nums[i]) && (nums[i] % k != 0))
                    {
                        nonDivisibleValues.add(nums[i]);
                    }
                    if (!nonDivisibleValues.contains(nums[j]) && (nums[j] % k != 0))
                    {
                        nonDivisibleValues.add(nums[j]);
                    }
                }
            }
        }
        System.out.println(nonDivisibleValues.size());
    }
}
