package example_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] cards=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            cards[i]=Integer.parseInt(st.nextToken());
        }
        for(int i:cards){
            System.out.print(i+" ");
        }
    }
}
