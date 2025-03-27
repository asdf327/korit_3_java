package ch13_abstraction.hotification;

public class NotificatiinMain {
    public static void main(String[] args) {
        EmailNotificatiom emailNotificatiom = new EmailNotificatiom("djemals@",
                "dbwhals@", "가입 대기", 1);

        emailNotificatiom.setPriority(8); //뷸가능
        System.out.println(emailNotificatiom.getPriority()); //가능
        emailNotificatiom.pirntNotificationInfo();
        emailNotificatiom.validateRecipient();
        emailNotificatiom.send();
        emailNotificatiom.updateMessage("가입 승인");
        //formatMessage 서브 클래스에서 updateMessage 호출했지만 부모 클래스 메서드이기 때문에 바로 사용 가능
    }
}
