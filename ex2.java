public class ex2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);
        stringBuffer.insert(5, ",");
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.delete(5, 6); // Xóa dấu phẩy
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("After replace: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
        System.out.println("Capacity: " + stringBuffer.capacity());
        System.out.println("Length: " + stringBuffer.length());
        String sub = stringBuffer.substring(0, 2);
        System.out.println("Substring (0-2): " + sub);
        char ch = stringBuffer.charAt(1);
        System.out.println("Character at index 1: " + ch);
        stringBuffer.setCharAt(1, 'a');
        System.out.println("After setCharAt: " + stringBuffer);
    }
}


