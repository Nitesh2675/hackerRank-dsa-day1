public class AlternateString {
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
         * Complete the 'alternate' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int alternate(String s) {
            int maxLen = 0;

            for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
                for (char ch2 = (char)(ch1 + 1); ch2 <= 'z'; ch2++) {
                    StringBuilder filtered = new StringBuilder();

                    for (char c : s.toCharArray()) {
                        if (c == ch1 || c == ch2) {
                            filtered.append(c);
                        }
                    }

                    if (isAlternating(filtered.toString())) {
                        maxLen = Math.max(maxLen, filtered.length());
                    }
                }
            }

            return maxLen >= 2 ? maxLen : 0;
        }

        private static boolean isAlternating(String str) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    return false;
                }
            }
            return true;
        }

    }


    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int l = Integer.parseInt(bufferedReader.readLine().trim());

            String s = bufferedReader.readLine();

            int result = Result.alternate(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
