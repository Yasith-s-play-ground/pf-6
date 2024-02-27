void main() {
    int[] nums = {10, 20, 30, 40};
    System.out.println(nums.hashCode()); // returns hexa value but prints decimal value
    System.out.println(nums.toString()); // returns hexa value

    String str = nums + ""; // concatenates nums.toString() with ""
    System.out.println(str);
}