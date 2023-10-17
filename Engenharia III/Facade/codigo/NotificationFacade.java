class NotificationFacade {
    private EmailNotification emailNotification;
    private SMSNotification smsNotification;

    public NotificationFacade() {
        this.emailNotification = new EmailNotification();
        this.smsNotification = new SMSNotification();
    }

    public void sendEmailNotification(String message) {
        emailNotification.sendEmail(message);
    }

    public void sendSMSNotification(String message) {
        smsNotification.sendSMS(message);
    }
}