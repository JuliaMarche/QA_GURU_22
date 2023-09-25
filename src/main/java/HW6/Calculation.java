
public class Calculation {
    public static void main(String[] args) {
        byte aByte = 67;
        byte bByte = 127;
        short aShort = 22767;
        short bShort = 3766;
        int aInt = 2147483647;
        int bInt = 65;
        long aLong = 2013456;
        float bFloat = 1.3F;
        double aDouble = 8.5;
        char aChar = 'a';
        boolean aBool = true;
        boolean bBool = false;

        //Арифметические операторы
        System.out.println("aInt+bInt = "+(aInt+bInt));
        System.out.println("aByte-bByte = "+(aByte-bByte));
        System.out.println("aShort/bShort = "+(aShort/bShort));
        System.out.println("aInt%bInt = "+(aInt%bInt));
        System.out.println("bInt++ = "+(++bInt));
        System.out.println("aInt-- = "+(--aInt));

        //Операторы сравнения
        System.out.println("aInt==bInt = "+(aInt==bInt));
        System.out.println("aInt!=bInt = "+(aInt!=bInt));
        System.out.println("aByte>bByte = "+(aByte>bByte));
        System.out.println("aShort<bShort = "+(aShort<bShort));
        System.out.println("aInt>=bInt = "+(aInt>=bInt));

        //Логические операторы
        System.out.println("aBool&&aBool = "+(aBool&&aBool));
        System.out.println("aBool||bBool = "+(aBool||bBool));
        System.out.println("!aBool||bBool = "+!(aBool&&bBool));

        //Вычисления комбинаций типов данных (int и double)
        System.out.println("bFloat+aInt = "+(bFloat+aInt));
        System.out.println("bFloat/aDouble = "+(bFloat/aDouble));
        System.out.println("aDouble*aByte = "+(aDouble*aByte));
        System.out.println("aLong%bFloat = "+(aLong%bFloat));

        //Переполнение
        System.out.println("aByte+bByte = "+(byte)(aByte+bByte));
        System.out.println("aInt+bInt = "+(bInt+aInt));
    }
}
