import java.util.*;
class ShiftRight {

    static int[] shiftRight(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            while(arr[right] == 0)
                right--;

            if(arr[left] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
            left++;
        }
        return arr;
    }
    public static void main(String[] args) {
        //System.out.println(HelloWorld.decompress("w4a3d1e1x6"));
        int[] arr =new int[]{1,0,9,0,7,0,5,8};
        int[] res = ShiftRight.shiftRight(arr);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}