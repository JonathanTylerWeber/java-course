package day34;

public class GreetingServiceImpl implements GreetingService {

  private MessageService messageService;


  // setter dep injection
  public void setMessageService(MessageService messageService){
    this.messageService = messageService;
  }

  @Override
  public void sendGreeting() {
    if(messageService != null){
      System.out.println("messageService is initialized");
      System.out.println(messageService.getMessage());
    } else {
      System.out.println("messageService is not initialized");
    }
  }
  
}
