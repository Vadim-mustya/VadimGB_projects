import java.lang.System;
public class Main {


    public static void main(String[] args) {
        System.out.println();
        String[][] arr = {

                {"12","12","421","12"}
                ,{"12","125","453","64346"}
                ,{"12","3463","3446","3463"}
                ,{"12","3463","3466","3463"}


        };
        try {
            System.out.println(checkArr(arr));
        }catch (MyArraySizeException e)
        {
            e.printStackTrace();
        }
        catch (MyDataClassException e)
        {
            e.printStackTrace();
            System.out.println("Неверный формат ячейки под номером: " + e.getRow() + " " + e.getCol());
        }

    }


    public static int checkArr(String[][] arr) throws MyArraySizeException, MyDataClassException
    {
        int arrSum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            arrSum += arr[i].length;
        }
//        System.out.println(arrSum);
        if (arrSum != 16)
        {

            throw new  MyArraySizeException();
        }

        int sum =0;

        for(int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length;j++)
            {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e)
                {
                    throw new MyDataClassException("Неверный формат ячейки",i,j);
                }
            }
        }

        return sum;


    }

}

