/**
 * ============================================================================
 * JAVA DATA TYPES — COMPLETE REFERENCE
 * ============================================================================
 * 
 * ----------------------------------------------------------------------------
 * QUICK REVISION & EXAM SUMMARY
 * ----------------------------------------------------------------------------
 * 1. 8 PRIMITIVE DATA TYPES:
 *    - byte    -> (-128 to 127)
 *    - short   -> (-32,768 to 32,767)
 *    - int     -> (~ -2.1 billion to +2.1 billion)
 *    - long    -> Very large integers (requires 'L' suffix for literals)
 *    - float   -> Less precision decimal (requires 'f' suffix for literals)
 *    - double  -> High precision decimal (default for floating-point literals)
 *    - char    -> Single 16-bit Unicode character (uses 'single quotes')
 *    - boolean -> Holds only 'true' or 'false'
 * 
 * 2. REFERENCE TYPES:
 *    - Examples: String (uses "double quotes"), Arrays, Classes, Objects, Interfaces
 * 
 * 3. TYPE CASTING:
 *    - Widening (Smaller -> Larger): Happens automatically (e.g., int -> double)
 *    - Narrowing (Larger -> Smaller): Requires explicit cast (e.g., double -> int)
 *    - Decimal Handling: Casting double/float to int DISCARDS the decimal part (no rounding)
 * ============================================================================
 */

public class DataTypes {

    public static void main(String[] args) {

        // =====================================================
        // 1. INTEGER TYPES
        // =====================================================
        byte byteValue = 100;
        short shortValue = 30000;
        int intValue = 100000;
        long longValue = 10000000000L;

        System.out.println("--- 1. Integer Types ---");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println();


        // =====================================================
        // 2. DECIMAL / FLOATING-POINT TYPES
        // =====================================================
        float floatValue = 5.5f;
        double doubleValue = 5.555555;

        System.out.println("--- 2. Floating-Point Types ---");
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println();


        // =====================================================
        // 3. CHARACTER
        // =====================================================
        char grade = 'A';
        char symbol = '#';
        char digit = '7';

        System.out.println("--- 3. Character Type ---");
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
        System.out.println("Character digit: " + digit);
        System.out.println();


        // =====================================================
        // 4. BOOLEAN
        // =====================================================
        boolean passed = true;
        boolean failed = false;

        System.out.println("--- 4. Boolean Type ---");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println();


        // =====================================================
        // 5. STRING — REFERENCE TYPE
        // =====================================================
        String name = "Suvo";

        System.out.println("--- 5. String (Reference Type) ---");
        System.out.println("Name: " + name);
        System.out.println("Name length: " + name.length());
        System.out.println();


        // =====================================================
        // 6. CUSTOM CLASS — REFERENCE TYPE
        // =====================================================
        Student student = new Student();
        student.name = "Suvo";
        student.age = 21;

        System.out.println("--- 6. Custom Class Object ---");
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
        System.out.println();


        // =====================================================
        // 7. WIDENING TYPE CASTING
        // Smaller type → Larger type (Happens automatically)
        // =====================================================
        int number = 25;
        double widenedNumber = number;

        System.out.println("--- 7. Widening Type Casting ---");
        System.out.println("Original int: " + number);
        System.out.println("Widened double: " + widenedNumber);
        System.out.println();


        // =====================================================
        // 8. NARROWING TYPE CASTING
        // Larger type → Smaller type (Requires explicit casting)
        // =====================================================
        double decimalNumber = 25.8;
        int narrowedNumber = (int) decimalNumber;

        System.out.println("--- 8. Narrowing Type Casting ---");
        System.out.println("Original double: " + decimalNumber);
        System.out.println("Narrowed int: " + narrowedNumber);
        System.out.println();


        // =====================================================
        // 9. ANOTHER NARROWING EXAMPLE
        // Decimal portion is discarded, NOT rounded
        // =====================================================
        double price = 99.99;
        int integerPrice = (int) price;

        System.out.println("--- 9. Narrowing (Truncation) ---");
        System.out.println("Original price: " + price);
        System.out.println("After casting: " + integerPrice);
        System.out.println();


        // =====================================================
        // 10. TYPE CASTING WITH CHAR
        // =====================================================
        char letter = 'A';
        int asciiValue = letter;

        System.out.println("--- 10. Char to Int Casting ---");
        System.out.println("Character: " + letter);
        System.out.println("ASCII/Unicode value: " + asciiValue);
        System.out.println();


        // =====================================================
        // 11. CASTING INT TO CHAR
        // =====================================================
        int value = 66;
        char character = (char) value;

        System.out.println("--- 11. Int to Char Casting ---");
        System.out.println("Integer: " + value);
        System.out.println("Character: " + character);
        System.out.println();


        // =====================================================
        // 12. INTEGER OVERFLOW EXAMPLE
        // =====================================================
        byte smallNumber = 127;

        System.out.println("--- 12. Integer Overflow Context ---");
        System.out.println("Maximum byte value: " + smallNumber);
        // The following would wrap around to -128 if uncommented:
        // byte overflow = (byte) 128;
        // System.out.println(overflow);
        System.out.println();


        // =====================================================
        // 13. SHORT → INT → LONG → DOUBLE
        // Widening conversion chain
        // =====================================================
        short small = 100;
        int medium = small;
        long large = medium;
        double decimal = large;

        System.out.println("--- 13. Widening Conversion Chain ---");
        System.out.println("Short: " + small);
        System.out.println("Int: " + medium);
        System.out.println("Long: " + large);
        System.out.println("Double: " + decimal);
        System.out.println();


        // =====================================================
        // 14. USING +=
        // =====================================================
        int balance = 500;
        balance += 200;

        System.out.println("--- 14. Compound Assignment ---");
        System.out.println("Balance: " + balance);
    }
}

// =========================================================
// CUSTOM CLASS (Package-Private Helper Class)
// Demonstrates a reference type
// =========================================================
class Student {
    String name;
    int age;
}
