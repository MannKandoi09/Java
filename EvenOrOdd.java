public class EvenOrOdd {
    public static void main(String[] args) {
        int[] arr = {5, 2 , 9 , 1, 6};
        int even = 0, odd = 0;

        for (int num : arr){
            if (num % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
