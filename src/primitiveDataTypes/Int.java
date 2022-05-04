package primitiveDataTypes;

public class Int {
    public static void main(String[] args) {
        int myIntValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE; // Warpper Class
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1)); // Underflow

        // int myMaxIntTest = 2147483648;
        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
    }
}
