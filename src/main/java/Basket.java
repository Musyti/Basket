public class Basket {
    private static String items = "";

    public static void main(String[] args) {
        add("1 грамм курицы", 300);
        add("5 штук помидорок", 800);
        print("Содержание корзины:");
        clear();
        print("Содержание корзины: ");
    }

    public static void add(String name, int price) {
        if (items.isEmpty()) {
            items += name + " - " + price;
        } else {
            items += "\n" + name + " - " + price;
        }
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}
