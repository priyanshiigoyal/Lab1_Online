package Question2;

import java.util.*;

public class Defination {
    public ArrayList<Integer> repeatedElements(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mapp = new HashMap<>();
        for (int i :arr){
            if(mapp.containsKey(i)){
                mapp.put(i,mapp.get(i)+1);
            }
            else{
                mapp.put(i,1);
            }
        }
        for(Map.Entry nt : mapp.entrySet()){
            int val = (int)(nt.getValue());
            if(val>1){
                list.add((int)nt.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Defination defination = new Defination();
        ArrayList<Integer> list = defination.repeatedElements(arr);
        System.out.println(list);
    }
}
