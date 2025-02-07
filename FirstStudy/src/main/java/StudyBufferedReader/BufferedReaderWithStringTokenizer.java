package StudyBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderWithStringTokenizer {
    public static void main(String[] args) throws IOException {
        stringTokenizerWithWhile();
    }
    public static void simpleStringTokenizer() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string:");
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=st.countTokens();
        for(int i=0;i<n;i++){
            System.out.println(i+"번째 출력: "+st.nextToken());
        }
    }
    public static void stringTokenizerWithWhile() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string:");
        StringTokenizer st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
