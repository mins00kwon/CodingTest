public class 디펜스게임 {
    public static void main(String[] args) {
        int n=7, k=3;
        int[] enemy={4, 2, 4, 5, 3, 3, 1};
    }
    public int solution(int n, int k, int[] enemy) {

        int remainingLife=n;
        int survivalRounds=k;
        while(true){
            remainingLife-=enemy[survivalRounds];
            if(remainingLife<0){
                break;
            }
            else{
                survivalRounds++;
            }
        }
        int max=k;
        int maxLen=enemy.length;
        int[] defence=subArr(enemy, k);
        while(true){

            if(max==maxLen){
                break;
            }
        }
        return max;
    }

    private int calcDefence(int[] enemy, int[] defence) {
        int pop=getMin(defence);
        return 0;
    }

    private int getMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    private int[] subArr(int[] arr, int k) {
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=arr[i];
        }
        return result;
    }
}
