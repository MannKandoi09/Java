public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 54, 33, 9, 10, 22};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Number in array is: " + min);
    }
}
