import java.math.BigDecimal;
import java.util.Scanner;

void main() {
    System.out.println(new String[5]);
    System.out.println(new String[]{"ijse", "dep", "gdse", "cmjd"});

    System.out.println(new int[5][6][][][]);

    byte myByte = 5;
    short myShort = 3;
    char myChar = 1;
    int myInt = 3;
    long myLong = 4;

    System.out.println(new double[myByte + myShort + myChar + myInt]);

    System.out.println(new Scanner[myByte - myShort - myChar + myInt]);

    System.out.println(new Scanner[0]);
    System.out.println(new BigDecimal[-5]);  // < - Negative array size exception.Mot in compile time
}