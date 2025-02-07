package StudyBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiLineInput {
    public static void main(String[] args) {

    }
    public static void multiLineInput() throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        while ((line=br.readLine())!=null){
            System.out.println("1");
            System.out.println(line);
        }
    }
}
// 이건 첫 번째 줄입니다
// 이건 두 번째 줄입니다
// 이건 세 번째 줄의 첫번째 문장입니다// 이건 세 번째 줄의 두번째 문장입니다
// 이건 네 번째 줄입니다

