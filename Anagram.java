public class Anagram {
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
         * Complete the 'makingAnagrams' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static int makingAnagrams(String s1, String s2) {
            // Write your code here
            int []freq1=new int[26];
            int []freq2=new int[26];

            for(char value:s1.toCharArray()){
                freq1[value-'a']++;
            }
            for(char value:s2.toCharArray()){
                freq2[value-'a']++;
            }

            int deletion=0;
            for(int i=0;i<26;i++){
                int diff=freq1[i]-freq2[i];
                if(diff>0){
                    deletion+=diff;
                }
                else{
                    deletion-=diff;
                }
            }
            return deletion;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            int result = Result.makingAnagrams(s1, s2);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
