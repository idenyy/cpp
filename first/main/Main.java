package first.main;

public class Main {
    public static void CheckJavaIdentifierPart() {
        for (int i = 0; i < 256; i++) {
            if (Character.isJavaIdentifierPart((char)i)) {
                System.out.println(Integer.toString(i) + "  " + (char) i + "  is Java Identifier Part Symbol");
            } else {
                System.out.println(Integer.toString(i) + "  " + (char) i + "  isn't Java Identifier Part Symbol");
            }
        }
    }


    public static void CheckJavaIdentifierStart() {
        for (int i = 0; i < 256; i++) {
            if (Character.isJavaIdentifierStart((char) i)) {
                System.out.println(Integer.toString(i) + "  " + (char) i + "  is Java Identifier Start Symbol");
            } else {
                System.out.println(Integer.toString(i) + "  " + (char) i + "  isn't Java Identifier Start Symbol");
            }
        }
    }

    public static void main(String[] args) {
        // Int constants

        final int DEC_CONST = -5;
        final int OCTAL_CONST = 0777;
        final int HEX_CONST = 0x16db;

        // Character constant

        final char CHAR_CONST = '\u2332';

        // String constant

        final String STRING_CONST = "N\'ew S\ttri\nng";
        System.out.println(STRING_CONST);

        // Names of constants

        int myVariable;
        final int MY_CONSTANT_VARIABLE;

        // Logical type

        boolean isTrue = true;
        boolean isFalse = false;

        // Logical operations

        boolean notOperation = !isTrue;
        boolean andOperation = isFalse & isTrue;
        boolean orOperation = isFalse | isTrue;
        boolean xorOperation = isFalse ^ isTrue;

        System.out.println(notOperation);
        System.out.println(andOperation);
        System.out.println(orOperation);
        System.out.println(xorOperation);

        // Whole types

        byte byteVariable = 100;
        short shortVariable = -256;
        int intVariable = 43567;
        long longVariable = 453269538;

        // Arithmetical operations

        int plusResult, minusResult, multiplyResult, modulusResult;
        float divideResult;

        byteVariable++;
        ++byteVariable;
        shortVariable--;
        --shortVariable;

        plusResult = intVariable + byteVariable;
        minusResult = intVariable - byteVariable;
        multiplyResult = intVariable * byteVariable;
        divideResult = intVariable / shortVariable;
        modulusResult = intVariable % byteVariable;

        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(plusResult);
        System.out.println(minusResult);
        System.out.println(multiplyResult);
        System.out.println(divideResult);
        System.out.println(modulusResult);

        // Type casting

        // Widening Casting
        shortVariable = 0;
        shortVariable = byteVariable;

        //Narrowing Casting
        shortVariable = 0;
        shortVariable = (short)intVariable;

        // Comparison operations

        boolean comparison = intVariable < shortVariable;
        boolean comparison1 = intVariable > shortVariable;
        boolean comparison2 = intVariable >= shortVariable;
        boolean comparison3 = intVariable <= shortVariable;
        boolean comparison4 = intVariable == shortVariable;
        boolean comparison5 = intVariable != shortVariable;

        // Bitwise operations

        byte bitwiseFirstVariable = 0b1111111;
        byte bitwiseSecondVariable = 0b0000000;

        System.out.println(~bitwiseFirstVariable);
        System.out.println(bitwiseFirstVariable & bitwiseSecondVariable);
        System.out.println(bitwiseFirstVariable | bitwiseSecondVariable);
        System.out.println(bitwiseFirstVariable ^ bitwiseSecondVariable);

        // Shifts

        System.out.println(bitwiseFirstVariable >> 3);
        System.out.println(bitwiseFirstVariable << 3);
        System.out.println(bitwiseFirstVariable >>> 3);

        // Float types

        float floatVariable = 3.4f;
        double doubleVariable = 3.4;

        // Assignment operations

        int k = 5;
        k += 4;
        k -= 4;
        k %= 5;

        // Conditional operations

        int x = 5, y = 4;
        if (x > y){
            System.out.println("x is greater than y");
        }
        if (y > x) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("y is equal to x");
        }

        int i = (x > y) ? x : y;
        System.out.println(i);

        // Methods initialisation
        System.out.println("\n\nCheckJavaIdentifierPart() method initialisation");
        CheckJavaIdentifierPart();
        System.out.println("\n\nCheckJavaIdentifierStart() method initialisation");
        CheckJavaIdentifierStart();
    }
}