package com.bootcoding.junit.array;

import static sun.swing.MenuItemLayoutHelper.max;

public class ArraySum {


    public int getsum(int number[]){
        int sum=0;
        for(int n : number){
            sum +=n;
        }
        return sum;
    }

    public  int getmax(int[] number){
        int max=number[0];
        for(int n:number){
           if(max<n){
               max=n;
           }
        }
        return max;
    }

//    final public static void main(String[] args) {
//        int [] num= {1,5,4,3,2};
//        max(num);
//
//        //System.out.println(max(num));
//        System.out.println(evennumber(num));
//    }

  //  public int evenElement(int [] number)

    public static int[] evennumber(int [] num) {
        int nums[] = new int[num.length];
        int j=0;
        for(int i=0;i< num.length;i++){
            if(num[i]%2==0){
                nums[j]=nums[i];
                j++;
            }
        }
        return nums;
    }


}
