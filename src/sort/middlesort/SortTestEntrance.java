package sort.middlesort;

public class SortTestEntrance {
    public static void main(String[] list){
        int[] test={1,2,3,-1,-5,9};
        for(int i=0;i< test.length;i++) {
            System.out.print(test[i]+" ");
        }
        System.out.println("\n");
        MergeSort.mergeSort(test);
        for(int i=0;i< test.length;i++) {
            System.out.print(test[i]+" ");
        }
        System.out.println("\n");
        Integer[] test1={1,2,3,-1,-5,9};
        for(int i=0;i< test1.length;i++) {
            System.out.print(test1[i]+" ");
        }
        System.out.println("\n");
        MergeSort.mergeSort(test1);
        for(int i=0;i< test1.length;i++) {
            System.out.print(test1[i]+" ");
        }
        System.out.println("\n");
        Integer[] test2={1,2,3,-1,-5,9};
        for(int i=0;i< test2.length;i++) {
            System.out.print(test2[i]+" ");
        }
        System.out.println("\n");
        MergeSort.mergeSort(test2,(o1, o2) -> o1.hashCode()<=o2.hashCode()?-1:1);
        for(int i=0;i< test2.length;i++) {
            System.out.print(test2[i]+" ");
        }
    }
}
