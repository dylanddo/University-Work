public class MultidiensionalArrays
{
    public static void main(String[] args)
    {
        // int firstArray[][] ={{8, 9, 10, 11}, {12, 13, 14, 15}};

        int firstArray[][] = 
            {
                {8, 9, 10, 11}, 
                {12, 13, 14, 15}
            };
        // 1st square brackets is for the row.
        // 2nd square brackets is for the column.
        // The 1st row is {8, 9, 10, 11}
        // The 2nd row is {12, 13, 14, 15
        // Think of it like coordinates, for example 9 will be firstArray[0][1]
        // 14 is firstArray[1][2]

        int secondArray[][] = 
            {
                {30, 31, 32, 33}, 
                {43},
                {4, 5, 6}
            };

        System.out.println("This is the first array:");
        print(firstArray); // Calls method.

        System.out.println();

        System.out.println("This is the second array:");
        print(secondArray);
    }

    public static void print(int x[][])
    // The parameter takes a multidimensional Array.
    // We need two loops, one to loop through the rows and one to loop through the columns (nested for loop).
    {
        for(int row = 0; row < x.length; row++)
        // Loops through the rows.
        {
            for(int column = 0; column < x[row].length; column++)
            // Loops through the columns.
            // x[row].length this will loop through the length of the row. So it will go until the end of the row
            {
                System.out.print(x[row][column] + "  ");
            }
            System.out.println();
        }
    }

    public static void size() 
    {
        //two dimensional array definition  
        int[][] myarray = new int[5][20]; // The array is of size 5 with each array inside it holding 20 values.
        //printing the 2-d array
        System.out.println("The two-dimensional array:");
        for (int i = 0; i <myarray.length; i++) {
            for (int j = 0; j <myarray [i].length; j++) {
                myarray[i][j] = j+1;                    //assign value to each array element
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
