public class FindMax {
    public static void main(String[] args) {
        int[] arr = {12, 54, 39 , 12, 7};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number in array: " + max);
    }
}
