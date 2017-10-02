/**
 * Created by Raj Rathore on 02-Oct-17
 */
public class Main {

  public static void main(String[] args) {

    //byte has a width of 8
    byte myMaxByte = 127;
    byte myMinByte = -128;
    byte myMaxByteHalf = (byte) (myMaxByte / 2);
    System.out.println("The half of the max byte value is : " + myMaxByteHalf);

    //short has a width of 16
    short myMaxShort = 32767;
    short myMinShort = -32768;
    short myMaxShortHalf = (short) (myMaxShort / 2);
    System.out.println("The half of the max short value is : " + myMaxShortHalf);

    //int has a width of 32
    int myMaxInt = 2_147_483_647;
    int myMinInt = -2_147_483_648;
    int myMaxIntHalf = myMaxInt / 2;
    System.out.println("The Half of the max int value is : " + myMaxIntHalf);

    //long has a width of 64
    long myMaxLong = 9_223_372_036_854_775_807L;
    long myMinLong = -9_223_372_036_854_775_808L;
    long myMaxLongHalf = myMaxLong / 2;
    System.out.println("The half of the max long value is : " + myMaxLongHalf);

    System.out.println(myMaxInt + 3);
    System.out.println(myMinInt - 1);

    //Challenge
    byte validByte = -120;
    short validShort = 30_000;
    int validInt = 55_438;
    long longValue = 50_000L + 10L * (validByte + validShort + validInt);
    System.out.println("The long value is equal to : " + longValue);

    short shortValue = (short) (50_000L + 100L * (validByte + validShort + validInt));
    System.out.println("The short value is equal to : " + shortValue);

  }
}
