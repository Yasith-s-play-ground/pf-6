void main() {
    int[] abc = {10, 20};
    myMethod("IJSE", abc);
    myMethod("DEP", null);
    myMethod("GDSE"); // passes an empty array to int... nums
    myMethod("CMJD", 10);
    myMethod("CMJD", 10, 20);
//    myMethod("GDSE",abc,10); // X
//    myMethod("GDSE",null,10); // X
}

//void myMethod(String something, int[] nums) { // fixed arity method
//
//}
void myMethod(String something, int... nums) { // variable arity method , var args parameter
    System.out.println(STR."\{something}=\{nums != null ? nums.length : nums}");
}
