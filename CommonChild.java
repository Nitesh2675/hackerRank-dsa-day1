public class CommonChild {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    class Result {

        /*
         * Complete the 'commonChild' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static int commonChild(String s1, String s2) {
            // Write your code here
            int n = s1.length();
            int m = s2.length();

            // Create a DP table (n+1 x m+1) initialized to 0
            int[][] dp = new int[n + 1][m + 1];

            // Fill the DP table
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            // The result is in the bottom-right cell
            return dp[n][m];
        }
    }
    // private static int lcs(String s1,String s2,int i,int j){
    //     if(i==s1.length() || j==s2.length()){
    //         return 0;
    //     }

    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return 1+lcs(s1,s2,i+1,j+1);
    //     }else{
    //         return Math.max(
    //         lcs(s1,s2,i+1,j),
    //         lcs(s1,s2,i,j+1));
    //     }
    // }

//}

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            int result = Result.commonChild(s1, s2);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
