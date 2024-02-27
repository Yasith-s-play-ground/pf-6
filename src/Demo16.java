void main() {
    char[] myChars = {'I', 'J', 'S', 'E'};
    char[] myChars2 = {'d', 'e', 'p'};

    System.out.println(myChars.equals(myChars2)); // compare memory locations
    System.out.println(myChars == myChars2); // compare memory locations

    System.out.println("-------------------");

    String str1 = new String("ijse");
    String str2 = new String("ijse");
    System.out.println(str1.equals(str2));  // compare values
    System.out.println(str1 == str2); // compare locations
}