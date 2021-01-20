public class EnCode {
    public static void main(String[] args) {
        String msg="Илюша самый лучший";
        String encmsg="";
        String decmsg="";
        int key=88;

        System.out.println("Исходное сообщение");
        System.out.println(msg);
        // Шифр-е сообщения
        for(int i=0;i<msg.length();i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Зашифр-е сообщение:");
        System.out.println(encmsg);

        // Дешифр-ка сообщения:
        for (int i=0;i<msg.length();i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Дешифр-е сообщение:");
        System.out.println(decmsg);
    }
}
