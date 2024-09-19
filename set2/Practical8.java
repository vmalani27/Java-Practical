public class Practical8 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 9 };
        int[] arr2 = { 1, 9, 9 };
        int[] arr3 = { 1, 9, 9, 3, 9 };
        


        System.out.println(array_count9(arr1));
        System.out.println(array_count9(arr2));
        System.out.println(array_count9(arr3));
    }
    
    public static int array_count9(int[] n) {
        int count=0;
        int length= n.length;
        for (int i = 0; i < length; i++) {
            if (n[i] == 9) {
                count += 1;
            }
            
        }
        return count;
    }
}
