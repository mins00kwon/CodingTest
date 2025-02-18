package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1182 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int s=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }// 입력 완료
        int sum,count=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=n-1;j>=i;j--){
                sum+=addUp(i,j,arr);
            }
            if(sum==s){
                count++;
            }
        }
        System.out.println(count);
    }
    static int addUp(int a,int b, int[] arr){
        int result=0;
        for(int i=a;i<=b;i++){
            result+=arr[i];
        }
        return result;
    }
}
