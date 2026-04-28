package Data_Structure;

public class LinearSearchQuestion {
    //Q1: return the minimum number in the array
    static int minimum(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    //Q1: return the maximum number in the array
    static int maximum(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    //Q1: return the maximum number in the range of the array
    static int maximumInRange(int[] arr, int start, int end){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=start; i<end; i++){
            if(arr[start] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {50,80,60,-5,40,-8};
        int ansMin = minimum(arr);
        System.err.println(ansMin);
        int ansMax = maximum(arr);
        System.out.println(ansMax);
        int start = 1;
        int end = 4;
        int ansRange = maximumInRange(arr, start, end);
        System.err.println(ansRange);
    }
}
