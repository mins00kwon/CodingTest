package indexOf;

public class StudyIndexOf {
    public static void main(String[] args) {
        returnSecondIndexOf();
    }

    /* 설명: 일치하는 문자열을 찾으면 시작하는 인덱스를 반환함*/
    public static void returnIndexOf() {
        String str="012 Java";
        System.out.println(str.indexOf("Java"));
        // 결과값: 4
    }

    /* 설명: 일치하는 문자열이 없으면 -1 반환*/
    public static void returnNoIndexOf() {
        String str="123 Java";
        System.out.println(str.indexOf("Python"));
        // 결과값: -1
    }

    /* 설명: 일치하는 문자열이 여러개면 처음으로 찾은 위치의 인덱스를 반환함*/
    public static void returnMultipleIndexOf() {
        String str="012 Java Java";
        System.out.println(str.indexOf("Java"));
        // 결과값: 4
    }

    /* 설명: 특정 위치부터 찾으려면 두번째 전달인자 활용*/
    public static void returnSecondIndexOf() {
        String str="012 Java Java";
        System.out.println(str.indexOf("Java", str.indexOf("Java")+1));
        // 결과값: 9
    }


}
