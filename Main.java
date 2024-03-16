public class Main  {
    public static void main(String[] args) {
//Добавлены классы Queue и Orders по 1 принципу единственной ответственности.
        Queue queue = new Queue(12);
        Orders orders = new Orders(9);
        Market market = new Market();
        System.out.println("Магазин. Заказов:"+ market.getStatus(orders)+" Очередь: "+ market.getStatus(queue));
        queue.showQueue();
        queue.deletePerson();
        queue.deletePerson();
        queue.showQueue();
        orders.giveOrder();
        orders.giveOrder();
        queue.addPerson();
        orders.newOrder();
        System.out.println("Магазин. Заказов:"+ market.getStatus(orders)+" Очередь: "+ market.getStatus(queue));
    }
}
