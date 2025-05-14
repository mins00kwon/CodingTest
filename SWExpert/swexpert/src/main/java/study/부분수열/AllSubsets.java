package study.부분수열;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        generateSubsequnce(arr, 0, new ArrayList<>(), result);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    private static void generateSubsequnce(int[] arr, int index, ArrayList<Integer> current, List<List<Integer>> result) {
        if(index==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        // 현재 원소를 포함하는 수열
        current.add(arr[index]);
        generateSubsequnce(arr, index+1, current, result);

        current.remove(current.size()-1);
        generateSubsequnce(arr, index+1, current, result);
    }
}
