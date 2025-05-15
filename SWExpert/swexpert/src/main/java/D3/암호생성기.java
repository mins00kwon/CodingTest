package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 암호생성기 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        for(int i=0;i<10;i++){
            solution();
        }
        System.out.println(sb.toString());
    }

    private static void solution() throws IOException {
        // 테스트 케이스 번호 입력
        int testCase= Integer.parseInt(br.readLine());
        sb.append("#").append(testCase).append(" ");

        // 데이터 입력
        st=new StringTokenizer(br.readLine());
        String result="";
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<8;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int i=1;
        while(true){
            int cur=queue.poll();
            int next=cur-i;
            if(next>0){
                queue.add(next);
                i++;
                if(i==6){
                    i=1;
                }
            }
            else{
                queue.add(0);
                break;
            }
        }

        for(int j=0;j<8;j++){
            sb.append(queue.poll()).append(" ");
        }
        sb.append("\n");
    }
}
