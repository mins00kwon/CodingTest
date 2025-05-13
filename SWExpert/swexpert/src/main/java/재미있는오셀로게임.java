import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 재미있는오셀로게임 {

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T= Integer.parseInt(br.readLine());
        for(int i=1;i<=T;i++){
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static String solution() throws IOException {
        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[][] board=new int[n+1][n+1];

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
        }


        return null;
    }
}
