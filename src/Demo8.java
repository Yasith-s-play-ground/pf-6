void main() {
    int[] myArray1 = {10, 20};
    int[] myArray2 = {30, 40, 50};

    int[][][] my3dArray = new int[3][2][];

    System.out.println(my3dArray[0][0]);

    my3dArray[0][0] = myArray1;
    System.out.println(my3dArray[0][0][0]);

    my3dArray[2][0] = myArray2;
    System.out.println(my3dArray[2][0][0]);

    int[][][] my3dArray2 = {{null, {10, 20, 30}}, null, {{10, 20, 30}, null}};

    int[][][][] my4dArray = {null, {{null, {10, 20}}}};
    System.out.println(my4dArray[1][0][1][1]);

    int[][] my2dArray = {{10, 20}, null};
    int[][][][] my4dArray2 = {null, {my2dArray, {{10, 20}, null}, my2dArray}, null};
    System.out.println(my4dArray2[1][0][0][0]);


    int[] myf12_2dArray = {10, 20};
    int[][] myf15Array = {myf12_2dArray, null};
    int[] myf11Array = {10, 20, 30};

    //int[][][][][] my5dArray = {{{{}, {}, myf15Array}, {{myf12_2dArray, null}, null}, null}, {null, null, null}};

    //int[][][][][] my5dArray = {{{{}, {}, {}}, {}, null}, {null, null, null}};

    int[][][][][] my5dArray = {{null, null, null}, {{{{10, 20}, myf11Array}, {myf11Array, myf12_2dArray}, myf15Array}, {myf15Array, null}, null}};

    System.out.println(my5dArray[1][0][1][1] == my5dArray[1][1][0][0]);
}