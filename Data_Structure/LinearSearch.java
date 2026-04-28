package Data_Structure;
public class LinearSearch {
    // Q1: return the index of target element when found using the linear search
    public static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i; // this return the index when element found 
            }
        }
        return -1;  // this return the -1 when the element is not exits
    }

    //Q2: return the element when found using the linear search
    public static int linearSearchElement(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return arr[i]; // this return the element when element found 
            }
        }
        return -1;  // this return the -1 when the element is not exits
    }

    //Q2: return the true  when found the element and false when not found using the linear search
    public static boolean  linearSearchTrueAndFalse(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true; // this return the true when element found 
            }
        }
        return false;  // this return the false when the element is not exits
    }
    public static void main(String[] args) {
        int[] arr = {10,80,50,60,70,40,30,90,20};
        int target = 40;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        int ansElement = linearSearchElement(arr, target);
        System.err.println(ansElement);
        boolean ansTrue = linearSearchTrueAndFalse(arr, target);
        System.err.println(ansTrue);
    }
}
