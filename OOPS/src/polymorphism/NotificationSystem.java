package polymorphism;
class Notification{
	void send() {
		System.out.println("Notification has been send");
	}
}

class EmailNotification extends Notification{
	void send() {
		System.out.println("Email has been sended");
	}
}

class SmsNotification extends Notification{
	void send() {
		System.out.println("SMS has been sended");
	}
}

class PushNotification extends Notification{
	void send() {
		System.out.println("Notification has been pushed");
	}
}

class SendNotification{
	static void sendNotification(Notification n) {
		n.send();
	}
}
public class NotificationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotification e = new EmailNotification();
		SmsNotification s = new SmsNotification();
		PushNotification p = new PushNotification();
		SendNotification.sendNotification(e);
		SendNotification.sendNotification(s);
		SendNotification.sendNotification(p);

	}

}
