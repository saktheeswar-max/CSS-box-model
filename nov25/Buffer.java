package nov25;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");
        sb.append(" User");
        System.out.println(sb);

        StringBuffer a = new StringBuffer("test");
        StringBuffer b = new StringBuffer("test");
        System.out.println(a == b);
        System.out.println(a.equals(b));

        StringBuffer sb1 = new StringBuffer("World");
        sb1.insert(3, "Java");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Programming");
        sb2.replace(0, 6, "Code");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("Language");
        sb3.delete(2, 5);
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Buffer");
        sb4.reverse();
        System.out.println(sb4);
    }
}
