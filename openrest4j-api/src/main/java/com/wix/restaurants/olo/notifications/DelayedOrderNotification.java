package com.wix.restaurants.olo.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wix.restaurants.notifications.Notification;

/** Triggered when a new order is not handled for some duration. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DelayedOrderNotification extends Notification {
    public static final String TYPE = "delayed_order";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public DelayedOrderNotification() {}
    
    public DelayedOrderNotification(String organizationId, String channelId, String channelParam, String comment, String state,
    		Boolean acceptOrder, Integer durationMins) {
    	super(organizationId, channelId, channelParam, comment, state);
    	this.acceptOrder = acceptOrder;
    	this.durationMins = durationMins;
    }
    
	@Override
	public Object clone() {
		return new DelayedOrderNotification(organizationId, channelId, channelParam, comment, state, acceptOrder, durationMins);
	}
	
    /**
     * For orders-related notifications, whether or not the order should be
     * marked as accepted upon successful transmission of the notification.
     */
    @JsonInclude(Include.NON_DEFAULT)
    public Boolean acceptOrder = Boolean.FALSE;
    
    /** Event duration for triggering a notification, e.g. "after 15 minutes of not handling an incoming order". */
    @JsonInclude(Include.NON_DEFAULT)
    public Integer durationMins = 0;
}
