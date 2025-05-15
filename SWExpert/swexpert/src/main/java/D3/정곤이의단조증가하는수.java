package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정곤이의단조증가하는수 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            sb.append("#").append(t+1).append(" ").append(solution()).append("\n");
        }
        System.out.println(sb);
    }

    private static int solution() throws IOException {
        // 1. 입력
        // 정수의 개수. 1~1000 사이
        int N= Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        // 2. 곱셈을 모두 만들어서 배열로 만들
        if(N==1){
            return arr[0];
        }
        int size=N*(N-1)/2;
        int[] multiArr=new int[size+1];
        int index=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                multiArr[index]=arr[i]*arr[j];
                index++;
            }
        }

        // 2. 오름차순으로 정렬
        Arrays.sort(multiArr);

        // 3. 역순으로 탐색하며 단조 증가하는지 확인
        int result=-1;
        index=multiArr.length-1;
        while(true){
            if(checkIncrease(multiArr[index])){
                result=multiArr[index];
                break;
            }
            index--;
        }

        return result;
    }

    private static boolean checkIncrease(int num) {
        // 10으로 나머지, 10으로 나누고 반복
        while(num>0){
            int firstDigit=num%10;
            num/=10;
            int secondDigit=num%10;
            if(secondDigit>firstDigit){
                return false;
            }
        }
        return true;
    }
}
/*
* 1. 곱셈을 모두 만들어서 배열로 만들어 놓고
* 2. 오름차순으로 정렬
* 3. 역순으로 탐색하면서 단조 증가하는지 확인
* 4. 범위를 벗어나게 되면 -1 출력*/