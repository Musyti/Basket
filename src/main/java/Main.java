public class Main {
    public static void main(String[] args) {
        Basket kikBasket = new Basket();
        kikBasket.add("1 грамм курицы", 300);
        kikBasket.add("1 грамм курицы", 300);
        kikBasket.add("5 штук помидорок", 800);
        kikBasket.add("1 грамм курицы", 300);
        kikBasket.print("Содержание корзины:");
        kikBasket.clear();
        kikBasket.print("Содержание корзины: ");

        System.out.println();

        Basket hiBasket = new Basket();
        hiBasket.add("1 грамм курицы", 700);
        hiBasket.add("5 штук помидорок", 800);
        hiBasket.print("Содержание корзины:");
        hiBasket.clear();
        hiBasket.print("Содержание корзины: ");

        System.out.println();

        Basket serBasket = new Basket();
        serBasket.add("30 грамм пиццы", 3000);
        serBasket.add("5 штук арбузов", 7001);
        serBasket.print("Содержание корзины:");
        serBasket.clear();
        serBasket.print("Содержание корзины: ");

    }
}
