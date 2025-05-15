package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SweString {
    static StringBuilder sb=new StringBuilder();
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        for(int t=0;t<10;t++) {
            sb.append("#"+(t+1)+" "+solution()+"\n");
        }
        System.out.println(sb.toString());
    }

    private static int solution() throws IOException {
        String garbage=br.readLine();
        String target=br.readLine();
        int targetLength=target.length();
        String data=br.readLine();
        int result=0;
        for(int i=0;i<data.length()-targetLength+1;i++) {
            if(target.equals(data.substring(i,i+targetLength))) {
                result++;
            }
        }
        return result;
    }
}
