package source.iterator;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Item("Home", "/home"));
        menu.addItem(new Item("Java", "/java"));
        menu.addItem(new Item("Yii Frame", "/yii-frame"));
 
        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}