package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 최장경로 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    static int nodeMax=0;
    static int totalMax=0;
    static int n=0;
    static int m=0;
    static List<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        int T= Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int solution() throws IOException {
        totalMax=0;
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());     // 정점의 개수
        m=Integer.parseInt(st.nextToken());     // 간선의 개수 (입력의 개수)
        arr=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=new ArrayList<>();
        }
        visited=new boolean[n+1];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i=1;i<=n;i++){
            visited[i]=true;
            nodeMax=0;
            dfs(i,1);
            if(nodeMax>totalMax){
                totalMax=nodeMax;
            }
            visited[i]=false;
        }

        return totalMax;
    }

    private static void dfs(int node, int depth) {
        if(depth>nodeMax){
            nodeMax=depth;
        }
        for(int next : arr[node]){
            if(!visited[next]){
                visited[next]=true;
                dfs(next,depth+1);
                visited[next]=false;
            }
        }
    }
}