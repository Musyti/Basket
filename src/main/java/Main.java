public class Main {
    public static void main(String[] args) {
        Basket kikBasket = new Basket();
        kikBasket.add("1 грамм курицы", 300);
        kikBasket.add("5 штук помидорок", 800);
        kikBasket.print("Содержание корзины:");
        kikBasket.clear();
        kikBasket.print("Содержание корзины: ");

        Basket hiBasket = new Basket();
        hiBasket.add("1 грамм курицы", 300);
        hiBasket.add("5 штук помидорок", 800);
        hiBasket.print("Содержание корзины:");
        hiBasket.clear();
        hiBasket.print("Содержание корзины: ");
    }
}
