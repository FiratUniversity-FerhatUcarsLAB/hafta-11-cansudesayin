public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        //1-cevap: getNumber() çağrılır ama değeri kullanılmaz → Java hata vermez, uyarı da vermez. Return edilen değer yok sayılır.
        

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // 2-cevap: void metot bir ifadenin içinde kullanılamaz. Java “void value cannot be used” veya “bad operand types for +” şeklinde hata üretir. 

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
