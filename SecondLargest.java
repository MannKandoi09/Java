public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 2, 7};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
