package primitiveDataTypes;

public class Long {
    public static void main(String[] args) {
        long myLongValue = 1000L;
        System.out.println(myLongValue);
        long myMinLongValue = java.lang.Long.MIN_VALUE; // Warpper Class
        long myMaxLongValue = java.lang.Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_121L;
        System.out.println(bigLongLiteralValue);
    }
}
