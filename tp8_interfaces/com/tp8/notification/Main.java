import com.tp8.notification.*;

// ... dans la méthode main ...

System.out.println("\n" + "=".repeat(40) + "\n");
System.out.println("TESTS NOTIFICATIONS\n");

NotificationSender emailSender = new EmailNotificationSender();
NotificationService emailService = new NotificationService(emailSender);
emailService.sendWelcomeMessage("user@example.com");

System.out.println("\n");

NotificationSender smsSender = new SmsNotificationSender();
NotificationService smsService = new NotificationService(smsSender);
smsService.sendWelcomeMessage("+33612345678");
