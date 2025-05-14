package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 부분수열의합 {

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    static int count;

    static int T;
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        T= Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static String solution() throws IOException {
        count=0;
        st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }


        dfs(0, arr, new ArrayList<Integer>());

        return count+"";
    }

    private static void dfs(int i, int[] arr, ArrayList<Integer> current) {
        // N개를 넘으면 종료
        if(i==N){
            return;
        }
        int sum=0;
        // 아직 N개 이하라면
        // 이 요소를 포함하는 경우랑
        current.add(i);
        for(int j=0;j<current.size();j++){
            sum+=arr[current.get(j)];
        }
        if(sum==K){
            count++;
        }else {
            dfs(i+1, arr, current);
        }

        // 이 요소를 포함하지 않는 경우
        current.remove(current.size()-1);
        dfs(i+1, arr, current);
    }
}

/*
부분 수열을 탐색해 나가다가 이미 목표한 수치에 도달하면 해당 탐색은 종료시켜도 됨
재귀함수를 활용하면 될 듯?
*/
