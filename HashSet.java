public class HashSet {
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

//Write your code here

            HashSet<String> set=new HashSet<>();
            int c=0;
            for(int i=0;i<t;i++){
                String str1=pair_left[i]+" "+pair_right[i];
                String str2=pair_right[i]+" "+pair_left[i];
                if(!set.contains(str1)){
                    set.add(str2);
                }
                System.out.println(set.size());
            }

        }
    }
}
