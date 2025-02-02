import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiFlipString {
    public static void main(String[] args) {
        int[][] queries=new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        solution("rermgorpsam", queries);
    }
    public static String solution(String my_string, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            my_string=flipString(my_string, queries[i]);
        }
        return my_string;
    }

    public static String flipString(String myString, int[] query){
        String[] original = myString.split("");
        String[] result=myString.split("");
        int n=query[0];
        int m=query[1];
        for(int i=0;i<=(n+m-1)/2-n;i++){
            result[n+i]=original[m-i];
            result[m-i]=original[n+i];
        }
        return arrayToString(result);
    }
    public static String arrayToString(String[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
