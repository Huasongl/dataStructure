package sort.primarysort;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTestEntrance {
  public static void main(String[] args){
        Integer[] list={1,-1,4,-5};
        Integer[] list1=list.clone();
        System.out.println("bubbleSortTest");
        PrimarySort.bubbleSort(list1);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println("\n");


      Integer[] list2=list.clone();
      PrimarySort.insectSort(list2);
      System.out.println("insectSortTest");
      for(int i=0;i<list.length;i++){
          System.out.print(list[i]+" ");
      }
      System.out.println("\n");


      Integer[] list3=list.clone();
      PrimarySort.selectSort(list3);
      System.out.println("selectSortTest");
      for(int i=0;i<list.length;i++){
          System.out.print(list[i]+" ");
      }
      System.out.println("\n");
    }
}
