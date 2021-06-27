package maththought.dynamicprogramming;

public class Lesson10_1 {
    /**
     * @Descirption: 使用状态转移方程，计算两个字符串之间的编辑距离
     * @param a-第一个字符串
     * @param b-第二个字符串
     * @return int-两者之间的编辑距离
     */
    public static int getStrDistance(String a,String b){
        if(a==null||b==null)return -1;

        int[][] d=new int[a.length()+1][b.length()+1];

        for(int i=0;i<d.length;i++){
            d[i][0]=i;
        }
        for(int i=0;i<d[0].length;i++){
            d[0][i]=i;
        }

        for(int i =0;i<d.length-1;i++){
            for(int j=0;j<d[0].length-1;j++){
                int r;
                if(a.charAt(i)==b.charAt(j)){
                    r=0;
                }else{
                    r=1;
                }
                int first_append=d[i+1][j]+1;
                int second_append=d[i][j+1]+1;
                int replace=d[i][j]+r;
                int temp=Math.min(first_append,second_append);
                temp=Math.min(temp,replace);
                d[i+1][j+1]=temp;
            }
        }
        return d[d.length-1][d[0].length-1];
    }

    public static void main(String[] args){
        System.out.println(getStrDistance("mouse","mouuuse"));
    }
}
