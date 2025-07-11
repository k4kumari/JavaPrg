//1. Using reverse() method

public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}


//2. Using a Loop


public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}
//3. Using Recursion

public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverse(original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}


