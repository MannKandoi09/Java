public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2 , 1, 2};
        int sum = 0;

        for (int num : arr){
            sum += num;
        }
        System.out.println("Sum : " + sum);
    }
}
