package it.polito.tdp.carsharing.model;

public class Event implements Comparable<Event> {
	
	public enum EventType { NUOVO_CLIENTE, AUTO_RESTITUITA } ;
	
	private int time ; // minuti dalla mezzanotte
	private EventType type ;
	
	

	public Event(int time, EventType type) {
		super();
		this.time = time;
		this.type = type;
	}



	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}



	/**
	 * @return the type
	 */
	public EventType getType() {
		return type;
	}



	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(EventType type) {
		this.type = type;
	}



	@Override
	public int compareTo(Event other) {
		return this.time - other.time ;
	}

}
