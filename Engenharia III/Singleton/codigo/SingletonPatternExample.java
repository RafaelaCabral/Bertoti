public class SingletonPatternExample {
    public static void main(String[] args) {
        NotificationManager notificationManager = NotificationManager.getInstance();

        notificationManager.sendNotification("New notification from Singleton");
    }
}