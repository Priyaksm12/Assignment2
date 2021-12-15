
    import java.io.*;

    public class sumofnat {

        // Returns sum of first n natural
        // numbers
        static int findSum(int n)
        {
            int sum = 0;
            for (int x = 1; x <= n; x++)
                sum = sum + x;
            return sum;
        }

        // Driver code
        public static void main(String args[])
        {
            int n = 5;
            System.out.println(findSum(n));
        }
    }

