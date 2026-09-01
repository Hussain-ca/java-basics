public class FindLargestEven {

    public static int findLargestEven(int[] arr) {
        // your logic here — combine the largest-tracking pattern from
        // FindLargest.java with the %2==0 check from EvenOdd.java
        boolean isEven = false;
        int largestEven = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                if(!isEven||arr[i]>largestEven){
                    largestEven=arr[i];
                    isEven=true;
                }
            }
            if(arr[i]%2==0&&arr[i]>largestEven){
                largestEven=arr[i];
            }
        }
        return largestEven;
    }

    public static void main(String[] args) {
        // call findLargestEven on at least 2 test arrays
        int[] numbers={14,7,92,31,5,68};
        int[] numbers_2={7,3,9,51};
        int largestEvenArray = findLargestEven(numbers);
        int largestEvenArray_2 = findLargestEven(numbers_2);
        if(largestEvenArray==-1){
            System.out.println("There is no even number in the array 1.");
        }
        else {
            System.out.println("Largest Even Number in the Array 1 is "+largestEvenArray);
        }
        if(largestEvenArray_2==-1){
            System.out.println("There is no even number in the array 2.");
        }
        else {
            System.out.println("Largest Even Number in the Array 2 is "+largestEvenArray_2);
        }
    }
}