import java.util.*;
import java.util.HashMap;
public class Maps{
    public static void largestSubArrSumWith0(){
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                len=Math.max(len,i-hm.get(sum));
            }else{
                hm.put(sum,i);
            }
        }
        System.out.println("largest subarray sum with 0="+len);
    }
    public static void main(String args[]){
        largestSubArrSumWith0();
    }
}
