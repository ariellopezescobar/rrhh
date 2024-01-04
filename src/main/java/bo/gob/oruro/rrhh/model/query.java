package bo.gob.oruro.rrhh.model;

public class query {
    private String sender;
    private String message;
    private boolean isGroup;
    private String groupParticipant;
    private float ruleId;
    private boolean isTestMessage;
  
  
   // Getter Methods 
  
    public String getSender() {
      return sender;
    }
  
    public String getMessage() {
      return message;
    }
  
    public boolean getIsGroup() {
      return isGroup;
    }
  
    public String getGroupParticipant() {
      return groupParticipant;
    }
  
    public float getRuleId() {
      return ruleId;
    }
  
    public boolean getIsTestMessage() {
      return isTestMessage;
    }
  
   // Setter Methods 
  
    public void setSender( String sender ) {
      this.sender = sender;
    }
  
    public void setMessage( String message ) {
      this.message = message;
    }
  
    public void setIsGroup( boolean isGroup ) {
      this.isGroup = isGroup;
    }
  
    public void setGroupParticipant( String groupParticipant ) {
      this.groupParticipant = groupParticipant;
    }
  
    public void setRuleId( float ruleId ) {
      this.ruleId = ruleId;
    }
  
    public void setIsTestMessage( boolean isTestMessage ) {
      this.isTestMessage = isTestMessage;
    }
}