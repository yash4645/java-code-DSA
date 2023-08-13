import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int n=map.get(arr[i]);
                map.put(arr[i],n+1);
            }
        }
        for(var e:map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }
    }
}
