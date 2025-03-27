package ch13_abstraction.hotification;

public class EmailNotificatiom extends Notificatiin {

    public EmailNotificatiom(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }

    @Override
    public void send() {
        System.out.println("이메일을 전수 중 ... ");
        System.out.println(getMessage());
        System.out.println("이메일 전송 완료!");
    }

    @Override
    public void validateRecipient() { //수신자 검증 @ 있는지 확인
        //recipient 데이터에 @가 있는지 확인
        if (!getRecipient().contains("@")){ //String
            System.out.println("잘못된 이메일 주소 형식입니다");
        } else {
            System.out.println("이메일 주소 형식이 유효합니다.");
        }
    }

    @Override
    public void formatMessage() {
        String formattrd = "<p>" + getMessage() + "</p>";
        updateMessage(formattrd);
        System.out.println("메세지가 HMTL 형식으로 포맷되었습니다");
    }
}
