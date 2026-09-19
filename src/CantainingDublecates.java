import java.util.HashSet;
import java.util.TreeSet;

public class CantainingDublecates {
    public static boolean containingduplecates(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        //TreeSet<Integer> set=new TreeSet<>();
        for(int nums:arr){
            if(set.contains(nums)){
                return true;
            }
            set.add(nums);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,3,6,3,4,6,6};
        boolean result=containingduplecates(arr);
        System.out.println(result);
    }
}
