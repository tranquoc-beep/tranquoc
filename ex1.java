public class ex1 {
    public static void main(String[] args) {
        char[] testChars = {'A', 'a', '1', ' ', '_', '5', 'B', '\n', 'Z', '!'};
        for (char ch : testChars) {
            System.out.println("Character: " + ch);
            System.out.println("isLetter: " + Character.isLetter(ch));
            System.out.println("isDigit: " + Character.isDigit(ch));
            System.out.println("isWhitespace: " + Character.isWhitespace(ch));
            System.out.println("toUpperCase: " + Character.toUpperCase(ch));
            System.out.println("toLowerCase: " + Character.toLowerCase(ch));
            System.out.println("isUpperCase: " + Character.isUpperCase(ch));
            System.out.println("isLowerCase: " + Character.isLowerCase(ch));
            System.out.println("isJavaIdentifierStart: " + Character.isJavaIdentifierStart(ch));
            System.out.println("isJavaIdentifierPart: " + Character.isJavaIdentifierPart(ch));
            System.out.println("digit (base 16): " + Character.digit(ch, 16));
            System.out.println("-----");
        }
    }
}


