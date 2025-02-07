package indexOf;

public class AdvancedIndexOf {
    public static void main(String[] args) {
        findAllIndexes("0Java5Java9Java","Java");
    }
    /* 설명: 찾으려는 단어의 위치를 모두 찾기
    *   더이상 못 찾으면 -1을 리턴한다는 점을 활용*/
    static public void findAllIndexes(String str, String search) {
        StringBuilder sb=new StringBuilder();
        int index=-1;
        while(true){
            index=str.indexOf(search,index+1);
            if(index==-1)break;
            sb.append(index+" ");
        }
        System.out.println(sb.toString());
    }

}
