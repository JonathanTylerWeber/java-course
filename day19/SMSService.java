package day19;

public class SMSService extends BaseMessageService {

  @Override
  public void sendMessage(String message, String recipient){
    logMessage(message);
    System.out.println("Sending sms to " + recipient + ", message: " + message);
  }
  
}
