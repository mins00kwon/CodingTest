package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1476_2 {
    public static int E=1, S=1,M=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int inputE=Integer.parseInt(st.nextToken());
        int inputS=Integer.parseInt(st.nextToken());
        int inputM=Integer.parseInt(st.nextToken());
        int result=1;
        while (true){
            // 값 비교
            if(inputE==E&&inputS==S&&inputM==M){
                System.out.println(result);
                return;
            }
            // 1년 증가
            result++;
            if (M==19) M=1;
            else M++;
            if(S==28) S=1;
            else S++;
            if(E==15)E=1;
            else E++;
        }
    }
}
