package assessment;

public class Egret {
    private String color;
    public Egret() {
        this("white");
    }
    public Egret(String color) {
        color = color;
    }
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);

        String name = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = new String("Fluffy");
        String name4 = "Fluffy";
        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name == name4);
        String name5 = true + "hello";
        System.out.println(name5);
        System.out.println(1 + 3);
    }
}
