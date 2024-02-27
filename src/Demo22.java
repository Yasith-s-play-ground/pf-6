void main() {
    printCoordinates(new int[]{10, 20},
            new int[0],
            new int[]{20},
            new int[]{},
            new int[]{40, 50},
            new int[]{10, 20, 30});
}

void printCoordinates(int[]... coordinatePairs) {
    for (int[] values : coordinatePairs) {
//        if (values.length != 0 && values.length < 3) {
//            if (values.length == 1) {
//                printCoordinate(values[0], values[0]);
//            } else {
//                printCoordinate(values[0], values[1]);
//            }
//        }
        if (values.length == 1 || values.length == 2) printCoordinate(values[0], values.length == 1 ? values[0] : values[1]);
    }
}

void printCoordinate(int x, int y) {
    System.out.println(STR."(\{x},\{y})");
}