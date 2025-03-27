package ch13_abstraction.hotification;

public abstract class Notificatiin {
    //1
    private String sender;
    private String recipient;
    private String message ;
    private int priority;

    public Notificatiin(String sender, String recipient, String message, int priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.priority = priority;
    }

    //2
    public void pirntNotificationInfo(){
        System.out.println("[ 알림 정보 ]");
        System.out.println("From : " + sender);
        System.out.println("To : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Priority : " + priority);
    }

    public void updateMessage(String newMessage){

        System.out.println("'" + this.message + "'가 `" + newMessage + "'(으)로 변경되었습니다. ");
        this.message = newMessage;
    }


    public void setPriority(int priority) {
        if (priority < 1 || priority > 5){
            System.out.println("X");
            return;
        }
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    //3
    public abstract void send();
    public abstract void validateRecipient();
    public abstract void formatMessage();

    public String getRecipient() {
        return recipient;
    }
}
