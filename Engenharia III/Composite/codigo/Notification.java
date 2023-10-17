class Notification implements NotificationComponent {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification: " + this.message);
    }
}