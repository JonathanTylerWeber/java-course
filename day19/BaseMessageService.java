package day19;

public abstract class BaseMessageService implements MessageService {
  void logMessage(String message){
    System.out.println("message: " + message);
  }
}
