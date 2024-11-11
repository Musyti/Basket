public class Basket {
    private String items = "";

    private int limit = 20000;
    private int totalPrice = 0;

    public boolean contains (String name) {
        return items.contains(name);
    }

    public void add(String name, int price) {
        if (contains(name)){
            return;
        }
        if (totalPrice + price >= limit) {
            return;
        }
        if (items.isEmpty()) {
            items += name + " - " + price;
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price;
            totalPrice += price;
        }
    }

    public void clear() {
        items = "";
    }

    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость корзины равна:" + totalPrice);
        }
    }
}
