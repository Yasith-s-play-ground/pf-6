void main() {
    int[][] my2DArray = new int[3][];
    int[][] my2DArray2 = new int[3][2];
//    System.out.println(my2DArray[0]);
//    System.out.println(my2DArray[1]);
//    System.out.println(my2DArray[2]);

    System.out.println(my2DArray2[0][1]);
    System.out.println(my2DArray2[1][1]);
    System.out.println(my2DArray2[2][1]);

    for (int i = 0; i < my2DArray.length; i++) {
        my2DArray[i] = my2DArray2[i];
    }

    my2DArray2[0][1] = 20;
    System.out.println(my2DArray[0][1]);

}