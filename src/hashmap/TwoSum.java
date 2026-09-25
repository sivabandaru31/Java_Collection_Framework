package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static  int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int y=target-x;
            if(map.containsKey(y)){
                int idx=map.get(y);
                return new int[]{idx,i};
            }
            map.put(x,i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] result=twosum(nums,9);
        System.out.println(Arrays.toString(result));
    }
}
