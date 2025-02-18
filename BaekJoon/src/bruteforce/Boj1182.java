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
        // 부분 수열의 합을 담을 sum
        // 부분 수열의 합이 s 면 1 증가하는 카운트
        int count=0;
        // 투포인터 개념 적용.
        // 왼쪽 포인터는 0부터 시작
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){// 오른쪽 포인터는 맨 오른쪽 부터 왼쪽으로 한칸씩, i까지 이동
                if(addUp(i,j,arr)==s){
                    count++;
                }
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
