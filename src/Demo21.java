void main() {
    //myMethod(new String[][]{{"S001", "Kasun Sampath"}, {"S002", "Upul Shantha"}, {"S003", "Ramidu Kumara"}});
    myMethod(new String[]{"S001", "Kasun Sampath"}, new String[]{"S002", "Upul Shantha"}, new String[]{"S003", "Ramidu Kumara"});
}

void myMethod(String[]... students) { // spread syntax , 1 dimensional array collection , 2d array is the same
    for (String[] student : students) {
        myMethod(student);
    }
}

void myMethod(String[] student) {
    System.out.println(STR."ID=\{student[0]}, NAME=\{student[1]}");
}