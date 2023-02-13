
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int measure = arr1.length + arr2.length;
        int[] arr3 = new int[measure];
        for(int j=0; j<measure; j++) {
            if(j<arr1.length) {
                arr3[j]=arr1[j];
            } else {
                arr3[j]=arr2[j-arr1.length];
            }
        }
        return arr3;
    }
}
