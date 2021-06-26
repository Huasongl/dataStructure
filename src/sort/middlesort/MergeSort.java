package sort.middlesort;

import java.util.Comparator;

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
    public static <E extends Comparable<E>>void mergeSort(E[] list){

        if(list.length>1) {

            E[] firstHalf = (E[]) new Comparable[list.length / 2 ];

            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            E[] secondHalf = (E[]) new Comparable[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);

        }
    }

    private static <E extends Comparable<E>>void merge(E[] firstHalf, E[] secondHalf, E[] list) {
        int currentIndex1=0;
        int currentIndex2=0;
        int currentIndex3=0;
        while(currentIndex1<firstHalf.length&&currentIndex2<secondHalf.length){
            if(firstHalf[currentIndex1].compareTo(secondHalf[currentIndex2])<0){
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

    public static <E>void mergeSort(E[] list,Comparator<? super E>comparator){

        if(list.length>1) {

            E[] firstHalf = (E[]) new Object[list.length / 2 ];

            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf,comparator);

            int secondHalfLength = list.length - list.length / 2;
            E[] secondHalf = (E[]) new Object[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

            mergeSort(secondHalf,comparator);
            merge(firstHalf, secondHalf, list,comparator);

        }
    }
    private static <E>void merge(E[] firstHalf, E[] secondHalf, E[] list, Comparator<? super E> comparator) {
        int currentIndex1=0;
        int currentIndex2=0;
        int currentIndex3=0;
        while(currentIndex1<firstHalf.length&&currentIndex2<secondHalf.length){
            if(comparator.compare(firstHalf[currentIndex1], secondHalf[currentIndex2]) < 0){
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
