package day17;

public class SmartAppliance {
  private String applianceName;
  private String applianceType;
  private String powerStatus;

  // constructor to set parameters
  public SmartAppliance(String applianceName, String applianceType, String powerStatus){
    this.applianceName = applianceName;
    this.applianceType = applianceType;
    this.powerStatus = powerStatus;
  }

  // setter method
  // do SmartAppliance instead of void and return this to use method chaining
  public SmartAppliance setApplianceName(String applianceName){
    this.applianceName = applianceName;
    return this;
  }
  public SmartAppliance setApplianceType(String applianceType){
    this.applianceType = applianceType;
    return this;

  }
  public SmartAppliance setPowerStatus(String powerStatus){
    this.powerStatus = powerStatus;
    return this;

  }

  // methods
  public SmartAppliance getInstance(){
    return this;
  }

  public void displayDetails(){
    System.out.println(applianceName);
    System.out.println(applianceType);
    System.out.println(powerStatus);
  }
}
