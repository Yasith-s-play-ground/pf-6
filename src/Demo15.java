void main() {
    int[][] coordinates = {{5, 2}, {2, 5}, {3, 4}};

    for (int[] coordinatePair : coordinates) {
        printCoordinate(coordinatePair);
    }
}

void printCoordinate(int[] coordinatePair){
    for (int i : coordinatePair) {
        System.out.println(i);
    }
}