package sort.middlesort;
public class MergeSort {
    private static final int MAX_SENTINEL = 2147483647;
    public static void mergeSort(int[] list){
        if(list.length>1) {

            int[] firstHalf = new int[list.length / 2 ];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);

        }
    }
    private static void merge(int[] firstHalf, int[] secondHalf, int[] list) {
        int currentIndex1=0;
        int currentIndex2=0;
        int currentIndex3=0;
        while(currentIndex1<firstHalf.length&&currentIndex2<secondHalf.length){
            if(firstHalf[currentIndex1]<secondHalf[currentIndex2]){
                list[currentIndex3++]=firstHalf[currentIndex1++];
            }else {
                list[currentIndex3++]=secondHalf[currentIndex2++];
            }
        }
        while(currentIndex1< firstHalf.length-1){
            list[currentIndex3++]=firstHalf[currentIndex1++];
        }
        while(currentIndex2< secondHalf.length-1){
            list[currentIndex3++]=secondHalf[currentIndex2++];
        }
    }

}
