package dsakfkasd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyStringBuilder {
    public static void main(String[] args) throws IOException {
        /* 목표: 코딩 알고리즘 테스트에 필요한 기본 입력 함수를 이해한다*/
        /* 목표: 원리는 무시한다*/
        StringBuilder sb=new StringBuilder();
        sb.append("Hello").append(" ");
        sb.append("World");
        System.out.println(sb);
    }
}
