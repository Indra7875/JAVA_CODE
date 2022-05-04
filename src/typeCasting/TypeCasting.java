package typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
    }
}
