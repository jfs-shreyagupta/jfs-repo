package com.emgmt.model;

import java.util.Date;

public class Event {

	private Integer eventId;
	private String eventName;
	private String eventType;
	private Date eventDate;
	private String description;
	private Double budget;
	private Integer noOfGuests;
	private String customerId;
	private String paymentDue;
	private Date paymentDueDate;
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Integer getNoOfGuests() {
		return noOfGuests;
	}
	public void setNoOfGuests(Integer noOfGuests) {
		this.noOfGuests = noOfGuests;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPaymentDue() {
		return paymentDue;
	}
	public void setPaymentDue(String paymentDue) {
		this.paymentDue = paymentDue;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventType=" + eventType + ", eventDate="
				+ eventDate + ", description=" + description + ", budget=" + budget + ", noOfGuests=" + noOfGuests
				+ ", customerId=" + customerId + ", paymentDue=" + paymentDue + ", paymentDueDate=" + paymentDueDate
				+ "]";
	}


	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(Integer eventId, String eventName, String eventType, Date eventDate, 
			String description, Double budget,
			Integer noOfGuests, String customerId, String paymentDue, Date paymentDueDate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.description = description;
		this.budget = budget;
		this.noOfGuests = noOfGuests;
		this.customerId = customerId;
		this.paymentDue = paymentDue;
		this.paymentDueDate = paymentDueDate;
	}



}
