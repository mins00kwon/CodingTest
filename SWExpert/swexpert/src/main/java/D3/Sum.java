package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        for(int i=0;i<10;i++){
            solution();
        }
        System.out.println(sb.toString());
    }

    private static void solution() throws IOException {
        int testCase= Integer.parseInt(br.readLine());

        // 배열 입력받기
        int[][] arr=new int[100][100];
        for(int i=0;i<100;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<100;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int max=0;

        // 각 행의 합 구하기
        for(int i=0;i<100;i++){
            int sum=0;
            for(int j=0;j<100;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }

        // 각 열의 합 구하기
        for(int i=0;i<100;i++){
            int sum=0;
            for(int j=0;j<100;j++){
                sum+=arr[j][i];
            }
            if(sum>max){
                max=sum;
            }
        }

        int sum=0;
        // 우하향 대각의 합 구하기
        for(int i=0;i<100;i++){
            sum+=arr[i][i];
        }
        if(sum>max){
            max=sum;
        }

        sum=0;
        // 좌하향 대각의 합 구하기
        for(int i=0;i<100;i++){
            sum+=arr[100-i-1][i];
        }
        if(sum>max){
            max=sum;
        }

        sb.append("#").append(testCase).append(" ").append(max).append("\n");
    }
}
