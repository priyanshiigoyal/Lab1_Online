package Question1;

public class Defination {
    public void occurance(int[] arr, int element){
        int response = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                System.out.println(i);
            }       }

    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,5,2,3,7};
        Defination defination = new Defination();
      defination.occurance(arr,2);

    }
}
