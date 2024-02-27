void main() {
    myMethod(new int[][]{{-8, -2}, {-6, -3}},
            new int[][]{{8, -2}, {7, 10}},
            new int[][]{{8, 5}, {-7, 8}, {4, 11}},
            new int[][]{{12, 3}});
}

void myMethod(int[][]... pairGroups) {
    for (int[][] pairGroup : pairGroups) {
        int[] minMaxPair = getMinMaxPair(pairGroup);
        printPair(minMaxPair);
    }

}

int[] getMinMaxPair(int[]... pairs) {
    int min = pairs[0][0], max = min;
    for (int[] pair : pairs) {
        for (int value : pair) {
            min = value < min ? value : min;
            max = value > max ? value : max;
        }
    }
    return new int[]{min, max};
}

void printPair(int[] pair) {
    System.out.println(STR."(\{pair[0]},\{pair[1]})");
}