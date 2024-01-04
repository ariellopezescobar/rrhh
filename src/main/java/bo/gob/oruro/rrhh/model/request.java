package bo.gob.oruro.rrhh.model;

public class request {
    private String appPackageName;
    private String messengerPackageName;
    query QueryObject;
  
  
   // Getter Methods 
  
    public String getAppPackageName() {
      return appPackageName;
    }
  
    public String getMessengerPackageName() {
      return messengerPackageName;
    }
  
    public query getQuery() {
      return QueryObject;
    }
  
   // Setter Methods 
  
    public void setAppPackageName( String appPackageName ) {
      this.appPackageName = appPackageName;
    }
  
    public void setMessengerPackageName( String messengerPackageName ) {
      this.messengerPackageName = messengerPackageName;
    }
  
    public void setQuery( query queryObject ) {
      this.QueryObject = queryObject;
    }
  }
  