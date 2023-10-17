class NotificationGroup implements NotificationComponent {
    private List<NotificationComponent> notifications = new ArrayList<>();

    public void addNotification(NotificationComponent notification) {
        notifications.add(notification);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Group Notification: " + message);
        for (NotificationComponent notification : notifications) {
            notification.sendNotification(message);
        }
    }
}
