package TypeCasting;
//WAJP to convert long->int->short->byte
public class LongToAll {
    public static void main(String[] args) {
        long longVal = 987654321;
        int intValue = (int) longVal;
        System.out.println("Long to Int: "+intValue);

        short shortVal = (short) intValue;
        System.out.println("Int to Short: "+shortVal);

        byte byteVal = (byte) shortVal;
        System.out.println("Short to Byte: "+byteVal);
    }
}

