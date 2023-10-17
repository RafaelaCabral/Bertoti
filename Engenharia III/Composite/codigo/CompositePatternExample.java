public class CompositePatternExample {
    public static void main(String[] args) {

        Notification notification1 = new Notification("Notification 1");
        Notification notification2 = new Notification("Notification 2");
        Notification notification3 = new Notification("Notification 3");

        NotificationGroup group1 = new NotificationGroup();
        group1.addNotification(notification1);
        group1.addNotification(notification2);

        NotificationGroup group2 = new NotificationGroup();
        group2.addNotification(notification3);

        NotificationGroup topLevelGroup = new NotificationGroup();
        topLevelGroup.addNotification(group1);
        topLevelGroup.addNotification(group2);

        topLevelGroup.sendNotification("New Message Received");
    }
}