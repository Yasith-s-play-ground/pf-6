void main() {
    int[][] coordinates = {{5, 2}, {3, 2}};
    int[][] clone = coordinates.clone();
    System.out.println(coordinates == clone);
    coordinates[0][1] = 20;
    System.out.println(clone[0][1]);
}