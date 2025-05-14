package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GNS {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            sb.append("#").append(t+1).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static String solution() throws IOException {
        int[] arr=new int[10];
        st=new StringTokenizer(br.readLine());
        String garbage=st.nextToken();
        int n=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            String s=st.nextToken();
            if(s.equals("ZRO")){arr[0]++; continue;}
            if(s.equals("ONE")){arr[1]++; continue;}
            if(s.equals("TWO")){arr[2]++; continue;}
            if(s.equals("THR")){arr[3]++; continue;}
            if(s.equals("FOR")){arr[4]++; continue;}
            if(s.equals("FIV")){arr[5]++; continue;}
            if(s.equals("SIX")){arr[6]++; continue;}
            if(s.equals("SVN")){arr[7]++; continue;}
            if(s.equals("EGT")){arr[8]++; continue;}
            if(s.equals("NIN")){arr[9]++; continue;}
        }
        StringBuilder localSb=new StringBuilder();
        for(int i=0;i<arr[0];i++){
            localSb.append("ZRO ");
        }
        for(int i=0;i<arr[1];i++){
            localSb.append("ONE ");
        }
        for(int i=0;i<arr[2];i++){
            localSb.append("TWO ");
        }
        for(int i=0;i<arr[3];i++){
            localSb.append("THR ");
        }
        for(int i=0;i<arr[4];i++){
            localSb.append("FOR ");
        }
        for(int i=0;i<arr[5];i++){
            localSb.append("FIV ");
        }
        for(int i=0;i<arr[6];i++){
            localSb.append("SIX ");
        }
        for(int i=0;i<arr[7];i++){
            localSb.append("SVN ");
        }
        for(int i=0;i<arr[8];i++){
            localSb.append("EGT ");
        }
        for(int i=0;i<arr[9];i++){
            localSb.append("NIN ");
        }
        return localSb.toString();
    }
}
//카운트 하고 반복해서 출력하자!