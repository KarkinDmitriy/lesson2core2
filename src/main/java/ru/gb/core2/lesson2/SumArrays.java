package ru.gb.core2.lesson2;

public class SumArrays {
    public static int size= 4;
    public static int sum (String[][] arr){
        int sum=0;
        for (int i= 0;i<arr.length;i++){
            if (arr.length!=size) throw new MyArraySizeException("Array size is incorrect");
            for (int j = 0; j <arr[i].length;j++){
                if (arr[i].length!=size) throw new MyArraySizeException("Array size is incorrect");

                try { sum+=Integer.parseInt(arr[j][i]);
                } catch(NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Wrong cell:[%d][%d]", j+1,i+1));
                }


            }

        } System.out.println("Sum=" + sum);
        return sum;
    }
}
