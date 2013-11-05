import java.util.Date;

public class Message {

	private String message;
	private String sender;
	private String addressee;
	private Date sendDate;

	public String getMessage() {
		return message;
	}

	public void setMessage( String message ) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender( String sender ) {
		this.sender = sender;
	}

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee( String addressee ) {
		this.addressee = addressee;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate( Date sendDate ) {
		this.sendDate = sendDate;
	}
}
