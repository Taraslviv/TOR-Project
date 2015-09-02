package model.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 45)
	private String time_from;
	
	@Column(length = 45)
	private String duration;
	
	@Column 
	private Boolean isComfirmed;
	
	@ManyToOne
	private Type types;
	
	@ManyToOne
	private Schedule schedules;

	public Event(Long id, String time_from, String duration, Boolean isComfirmed, Type types, Schedule schedules) {
		
		this.id = id;
		this.time_from = time_from;
		this.duration = duration;
		this.isComfirmed = isComfirmed;
		this.types = types;
		this.schedules = schedules;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime_from() {
		return time_from;
	}

	public void setTime_from(String time_from) {
		this.time_from = time_from;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Boolean getIsComfirmed() {
		return isComfirmed;
	}

	public void setIsComfirmed(Boolean isComfirmed) {
		this.isComfirmed = isComfirmed;
	}

	public Type getTypes() {
		return types;
	}

	public void setTypes(Type types) {
		this.types = types;
	}

	public Schedule getSchedules() {
		return schedules;
	}

	public void setSchedules(Schedule schedules) {
		this.schedules = schedules;
	}
	

}
