void main() {
    int[] myArray1 = new int[]{10, 20, 30};
    int[] myArray2 = {10, 20, 30, 40};
    int[][] my2DArray = new int[][]{myArray1, myArray2, null, {10, 20}};

    System.out.println(my2DArray[0] == myArray1);
    System.out.println(my2DArray[1] == myArray2);
    System.out.println(my2DArray[0][1]);

}

