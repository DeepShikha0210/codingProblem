import java.util.*;
class Rotate {

    void rotateArray(int[] arr, int start, int end){

        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
    int[] rotateByK(int[] arr, int k){

        int n = arr.length;
        if(k == 0)
            return arr;
        if(k >= n)
            k = k%n;
        rotateArray(arr, 0, n-1);
        rotateArray(arr, 0, k-1);
        rotateArray(arr, k, n-1);
        return arr;
    }
    public static void main(String[] args) {
        //System.out.println(HelloWorld.decompress("w4a3d1e1x6"));
        Rotate r = new Rotate();
        int[] arr =new int[]{1,2,3,4,5,6,7,8};
        int[] res = r.rotateByK(arr, 2);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}