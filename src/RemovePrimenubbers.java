import java.util.ArrayList;

public class RemovePrimenubbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
       arr.add(11);
       arr.add(22);
       arr.add(1);
       arr.add(3);
       arr.add(6);
       arr.add(8);
       arr.add(9);
       arr.add(5);
       // System.out.println(arr);
//       for(int i=arr.size()-1;i>=0;i--){
//           if(arr.get(i)%2!=0 && arr.get(i)!=1){
//               if(arr.get(i)==3 || arr.get(i)%3!=0){
//                   arr.remove(i);
//               }
//           }
//       }
//        System.out.println(arr);

        int li=arr.size()-1;
        for(int i=0;i<arr.size()-1;i++){
            int count=0;
            for(int j=1;j<=arr.get(i);j++){
                if(arr.get(i)%j==0){
                    count++;
                }
            }
            if(count==2){
                int temp=arr.get(i);
                arr.set(i,arr.get(li));
                arr.set(li,temp);
                arr.remove(li);
                i--;
                li--;

            }
        }
        System.out.println(arr);

    }
}
