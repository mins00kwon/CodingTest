package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj13549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int curPosition=Integer.parseInt(st.nextToken());
        int goalPosition=Integer.parseInt(st.nextToken());
        int[] lineMap=new int[100000+1];
        for(int i=0;i<lineMap.length;i++){
            lineMap[i]=-1;
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.add(curPosition);
        lineMap[curPosition]=0;
        while(!queue.isEmpty()){
            curPosition=queue.poll();
            if(curPosition==goalPosition){
                System.out.println(lineMap[curPosition]);
                return;
            }
            int nextPosition1=curPosition-1;
            if(!(nextPosition1<0||nextPosition1>=lineMap.length)){
                if(lineMap[nextPosition1]==-1){
                    lineMap[nextPosition1]=lineMap[curPosition]+1;
                    queue.add(nextPosition1);
                }else{
                    if(lineMap[nextPosition1]-lineMap[curPosition]>=2){
                        lineMap[nextPosition1]=lineMap[curPosition]+1;
                        queue.add(nextPosition1);
                    }
                }
            }
            int nextPosition2=curPosition+1;
            if(!(nextPosition2<0||nextPosition2>=lineMap.length)){
                if(lineMap[nextPosition2]==-1){
                    lineMap[nextPosition2]=lineMap[curPosition]+1;
                    queue.add(nextPosition1);
                }else{
                    System.out.println("nextPosition2 = " + nextPosition2);
                    System.out.println("curPosition = " + curPosition);
                    if(lineMap[nextPosition2]-lineMap[curPosition]>=2){
                        lineMap[nextPosition2]=lineMap[curPosition]+1;
                        queue.add(nextPosition2);
                    }
                }
            }
            int nextPosition3=curPosition*2;
            if(!(nextPosition3>=lineMap.length)){
                if(lineMap[nextPosition3]==-1){
                    lineMap[nextPosition3]=lineMap[curPosition];
                    queue.add(nextPosition3);
                }else{
                    if(lineMap[nextPosition3]-lineMap[curPosition]>=1){
                        lineMap[nextPosition3]=lineMap[curPosition];
                        queue.add(nextPosition3);
                    }
                }
            }
        }
    }
}
