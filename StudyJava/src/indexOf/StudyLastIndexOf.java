package indexOf;

public class StudyLastIndexOf {
    public static void main(String[] args) {
//        findLastIndex("01234Java","Java");
//        noFindLastIndex("01234Java","Python");
        startFindLastIndex("01234Java123222Java","Java");
    }

    /* 설명: lastIndexOf 동작 확인*/
    static void findLastIndex(String str, String search) {
        System.out.println(str.lastIndexOf(search));
    }

    /* 설명: lastIndexOf 도 못찾으면 -1*/
    static void noFindLastIndex(String str, String search) {
        System.out.println(str.lastIndexOf(search));
    }

    /* 설명: lastInddexOf 검색 시작 위치 지정
    *   시작 위치부터 오른쪽이 아니라 왼쪽으로 탐색함*/
    static void startFindLastIndex(String str, String search) {
        System.out.println(str.lastIndexOf(search,str.length()-1));
    }
}
