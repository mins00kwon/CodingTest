import java.util.Arrays;

public class StudySplit {
    public static void main(String[] args) {
        String text="Hello Java World!";
        String[] words=text.split("");    //이 부분이 달라짐
        System.out.println(Arrays.toString(words));
    }
}