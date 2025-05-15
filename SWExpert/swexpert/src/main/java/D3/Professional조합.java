package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Professional조합 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    static int n,r;

    public static void main(String[] args) throws IOException {
        int T= Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            sb.append("#").append(t+1).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb);
//        test();
    }

    private static int solution() throws IOException {
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        r=Integer.parseInt(st.nextToken());

        // 1. r값 최적화
        if(r>(n/2)){
            r=n-r;
        }

        // 2. 팩토리얼 계산
//        단순히 팩토리얼 때리면 절대 안됨. 이걸 해결하는게 이 문제의 핵심일 듯.
        // 어떤 방법이 있을까...
        return 0;
    }

    private static void test(){
        System.out.println("나눗셈 잘 되는지 확인");
        System.out.println(4%1234567891);
        System.out.println("확인 완료");
    }

}
