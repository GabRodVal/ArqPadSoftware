import java.util.Date;

public class ConcretePublisher extends Publisher{
	
	private Date time;

	public void setTime(Date time) {
		this.time = time;
		notifyObserver();
	}

	public Date getTime() {
		return time;
	}
}
