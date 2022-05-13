package ru.gb.core2.lesson2;

public class App {
    public static void main(String[] args) {
        String [][] arr= new String[][]{
                {"1","1","1","5"},
                {"1","1","5","1"},
                {"1","5","1","1"},
                {"5","1","1","o"}
        };
        try {
            SumArrays.sum(arr);
            System.out.println("ok");
        } catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("TRY AGAIN");
        } catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("TRY AGAIN");
        }

    }
}

