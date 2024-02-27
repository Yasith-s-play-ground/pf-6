void main() {
    int[][] coordinates = {{5, 2}, {3, 2}};
    int[][] clone = coordinates.clone();
    for (int i = 0; i < coordinates.length; i++) {
        clone[i] = coordinates[i].clone();
    }
    System.out.println("Assigned 20 to coordinates[0][1]");
    coordinates[0][1] = 20;
    System.out.println(STR."clone [0][1] : \{clone[0][1]}");
    System.out.println(STR."coordinates [0][1] : \{coordinates[0][1]}");
}