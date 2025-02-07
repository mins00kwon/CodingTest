package dsakfkasd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudyStringTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[6];
        for (int i=0;i<6;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
    }
}// 10/ 20/ 10/ 30/ 20 /50

