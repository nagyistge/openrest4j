package com.openrest.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetNotificationsRequest extends Request {
	public static final String TYPE = "get_notifications";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public GetNotificationsRequest() {}
    
    public GetNotificationsRequest(String accessToken, String organizationId) {
    	this.accessToken = accessToken;
    	this.organizationId = organizationId;
    }
    
    @JsonInclude(Include.NON_NULL)
    public String accessToken;
    
    @JsonInclude(Include.NON_NULL)
    public String organizationId;
}
