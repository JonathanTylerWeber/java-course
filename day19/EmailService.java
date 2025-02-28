package day19;

public class EmailService extends BaseMessageService {

  @Override
  public void sendMessage(String message, String recipient){
    logMessage(message);
    System.out.println("Sending email to " + recipient + ", message: " + message);
  }

}
