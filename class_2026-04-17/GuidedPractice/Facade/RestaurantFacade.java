public class RestaurantFacade {

    private TableService tableService;
    private KitchenService kitchenService;
    private BillingService billingService;
    private NotificationService notificationService;

    public RestaurantFacade() {
        this.tableService = new TableService();
        this.kitchenService = new KitchenService();
        this.billingService = new BillingService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String customer, String dish) {

        System.out.println("Starting order process...\n");

        if (tableService.checkTableAvailability()) {
            kitchenService.registerOrder(dish);
            billingService.generateInvoice(customer, dish);
            notificationService.sendNotification(customer);

            System.out.println("\nOrder completed successfully.");
        } else {
            System.out.println("No tables available. Order rejected.");
        }
    }
}