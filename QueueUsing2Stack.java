public class QueueUsing2Stack {
    import java.io.*;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Stack<Integer> s1=new Stack<>();
            Stack<Integer> s2=new Stack<>();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int type=sc.nextInt();
                if(type==1){
                    s1.push(sc.nextInt());
                }else if(type==2){
                    if(s2.isEmpty()){
                        while(!s1.isEmpty()){
                            s2.push(s1.pop());
                        }
                    }
                    s2.pop();
                }else{
                    if(s2.isEmpty()){
                        while(!s1.isEmpty()){
                            s2.push(s1.pop());
                        }
                    }
                    System.out.println(s2.peek());
                }
            }
        }
    }
}
