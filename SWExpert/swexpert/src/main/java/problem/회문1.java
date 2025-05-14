package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 회문1 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 10; i++) {
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int solution() throws IOException {
        int result=0;
        String[][] arr=new String[8][8];

        // 입력
        // 1. 길이 입력
        int len= Integer.parseInt(br.readLine());

        if(len==1){
            return 64;
        }

        // 2. 데이터 입력
        for(int i=0;i<8;i++){
            String line=br.readLine();
            arr[i]=line.split("");
        }

        // 길이가 짝수인 경우
        if((len%=2)==0){
            // 가로로 체크
            for(int i=0;i<8;i++){
                for(int j=0;j<=8-len;j++){
                    String subStr="";
                    for(int k=0;k<len;k++){
                        subStr+=arr[i][j+k];
                    }
                    if(checkEven(len, subStr)){
                        result++;
                    }
                }
            }

            // 세로로 체크

        }

        // 길이가 홀수인 경우
        else{

        }



        return result;
    }

    private static boolean checkEven(int len, String subStr) {
        return false;
    }
}
