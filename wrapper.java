// 4. Why do we need wrapper classes?
// Reason 1: Collections

// Java collections such as ArrayList store objects, not primitive types.

import java.util.ArrayList;

/**
 * wrapper
 */
public class wrapper {

    public static void main(String[] args) {
        
        // with primitive
        int x = 20;
        // with wrapper
        Integer y = 10;

        // we can explicitly create Integer object like:

        Integer u = Integer.valueOf(30);

        // Autoboxing:
        Integer c = x;
        // Unboxing:
        int d = y;

        // Why do we need wrapper classes?
        // Reason 1: Collections Java collections such as ArrayList store objects, not primitive types.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(90);
        nums.add(87);

        // Reason 2: Useful conversion methods

        int p = Integer.parseInt("123");
        // this converts string to int
        String s = Integer.toString(1234);
        // this converts integer to string

        int max = Integer.max(87,67);
        // this returns max .. i.e 87

        // parseInt() returns a primitive int.

        // valueOf() returns an Integer object.

    }
}

// 🧠 Quick revision

// Wrapper classes represent primitive values as objects.

// int → Integer; char → Character.

// Autoboxing: primitive → wrapper.

// Unboxing: wrapper → primitive.

// ArrayList<Integer> works; ArrayList<int> does not.

// Integer.parseInt("123") returns int.

// Integer.valueOf("123") returns Integer.

// Wrapper references can be null; primitives cannot.