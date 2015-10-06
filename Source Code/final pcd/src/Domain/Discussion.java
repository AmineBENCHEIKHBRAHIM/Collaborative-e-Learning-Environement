// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;

import java.util.Date; 

/**
 * @author Amine
 */
public class Discussion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3077858224587493401L;

	private int id;
	
	private int sender;
	private int receiver;
	protected String msg ;
	protected String date ;
	
	public Discussion(int id, int sender, int receiver, String msg, String date) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.msg = msg;
		this.date = date;
	}

	public Discussion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public long getReceiver() {
		return receiver;
	}

	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

 
	

 
 

}
