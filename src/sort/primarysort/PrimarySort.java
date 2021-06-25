package sort.primarysort;

public class PrimarySort{
    //bubbleSort
    //thought：
    // 1.compare 2.exchange
    static <E extends Comparable<E>>void bubbleSort(E[] list){
        E currentElement;
        int currentIndex;
        boolean flag=true;
        for(int i=1;i<list.length&&flag;i++){
            flag=false;
            for(int j=0;j<list.length-i;j++){
                if(list[j].compareTo(list[j+1])>0){
                    currentElement=list[j];
                    list[j]=list[j+1];
                    list[j+1]=currentElement;
                    flag=true;
                }
            }
        }
    }
    //selectSort
    //thought:
    //1.select 2.insect
    static <E extends Comparable<E>>void selectSort(E[] list){
        E currentElement;
        int currentIndex;
        for(int i=0;i< list.length;i++){
            currentElement=list[i];
            currentIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(currentElement.compareTo(list[j])>0){
                    currentElement=list[j];
                    currentIndex=j;
                }
            }
            if(currentIndex!=i){
                list[currentIndex]=list[i];
                list[i]=currentElement;
            }
        }
    }
    //insectSort
    //thought
    //1.compare 2.insect
    static <E extends Comparable<E>>void insectSort(E[] list){
        E currentElement;
        int currentIndex;
        for (int i=1;i<list.length;i++){
            currentElement=list[i];
            currentIndex=i;
            for(int j=i-1;j>=0&&list[j].compareTo(currentElement)>0;j--){
                list[j+1]=list[j];
                currentIndex=i;
            }
            list[currentIndex]=currentElement;
        }
    }
}
