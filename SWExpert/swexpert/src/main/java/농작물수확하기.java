import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 농작물수확하기 {
    static StringBuilder sb=new StringBuilder();
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int numTestcases= Integer.parseInt(br.readLine());
        for(int i=1;i<=numTestcases;i++){
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int solution() throws IOException {
        int size= Integer.parseInt(br.readLine());
        int k=(size-1)/2;
        int[][] arr=new int[size][size];
        for(int i=0;i<size;i++){
            String line=br.readLine();
            for(int j=0;j<size;j++){
                arr[i][j]=line.charAt(j)-'0';
            }
        }
        int sum=0;
        for(int i=0;i<k;i++){
            for(int j=k-i;j<=k+i;j++){
                sum+=arr[i][j];
            }
        }
        for(int i=0;i<size;i++){
            sum+=arr[k][i];
        }
        for(int i=k+1;i<size;i++){
            int x=size-i-1;
            for(int j=k-x;j<=k+x;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
