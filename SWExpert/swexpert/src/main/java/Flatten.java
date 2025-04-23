import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb=new StringBuilder();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=10;i++){
            sb.append("#").append(i).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static int solution() throws IOException {
        int dumpNum= Integer.parseInt(br.readLine());
        int[] arr=new int[100];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<100;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        while(dumpNum>0){
            if(arr[99]-arr[0]<=1){
                return arr[99]-arr[0];
            }
            arr[99]--;
            arr[0]++;
            Arrays.sort(arr);
            dumpNum--;
        }

        return arr[99]-arr[0];
    }
}
