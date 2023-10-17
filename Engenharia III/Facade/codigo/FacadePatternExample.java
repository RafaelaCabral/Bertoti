public class FacadePatternExample {
    public static void main(String[] args) {
        NotificationFacade notificationFacade = new NotificationFacade();

        notificationFacade.sendEmailNotification("New email notification");
        notificationFacade.sendSMSNotification("New SMS notification");
    }
}