package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단순2진암호코드 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    static int[] arr;
    public static void main(String[] args) throws IOException {
        int numTestCase= Integer.parseInt(br.readLine());
        for(int i=1;i<=numTestCase;i++){
            sb.append("#").append(i).append(" ").append(scanCode()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int scanCode() throws IOException {
        getArr();

        return 0;
    }

    private static void getArr() throws IOException {
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        arr=new int[m];
        while(true){
            String line=br.readLine();
            if(line.contains("1")){

            }
        }
    }
}
