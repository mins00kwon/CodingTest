package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 진기의최고급붕어빵 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            sb.append("#"+(t+1)+" "+solution()+"\n");
        }
        System.out.println(sb.toString());
    }

    private static String solution() throws IOException {
        st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int[] visitors=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            visitors[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(visitors);
        int consumed=0;
        int generated=0;
        for(int i=0;i<N;i++){
            generated=(visitors[i]/M)*K;
            if(generated-consumed<=0){
                return "Impossible";
            }else{
                consumed++;
            }
        }
        return  "Possible";
    }
}
// N: 방문하는 사람의 수
// M: K개의 붕어빵을 만드는데 걸리는 시간
// K: M초 후 만들어지는 붕어빵의 갯수
