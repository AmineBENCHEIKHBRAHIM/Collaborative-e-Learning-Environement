// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;

/**
 * MessageId generated by hbm2java
 */
public class MessageId implements java.io.Serializable {

	private int idMessage;
	private Topic topic;

	public MessageId() {
	}

	public MessageId(int idMessage, Topic topic) {
		this.idMessage = idMessage;
		this.topic = topic;
	}

	public int getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MessageId))
			return false;
		MessageId castOther = (MessageId) other;

		return (this.getIdMessage() == castOther.getIdMessage())
				&& ((this.getTopic() == castOther.getTopic()) || (this
						.getTopic() != null
						&& castOther.getTopic() != null && this.getTopic()
						.equals(castOther.getTopic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdMessage();
		result = 37 * result
				+ (getTopic() == null ? 0 : this.getTopic().hashCode());
		return result;
	}

}
