public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {14, 7, 92, 31, 5, 68};
        int target = 31;
        int index = findIndex(numbers, target);
        if (index != -1) {
            System.out.print("Target Found at index " + index);
        } else {
            System.out.print("Target not found");
        }
    }


    static int findIndex(int[] numbers, int target){
        for (int i =0;i< numbers.length;i++){
            if (numbers[i]==target){
                return i;
            }
        }
        return -1;
    }
}
