package com.openrest.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetPasswordRequest extends Request {
	public static final String TYPE = "reset_password";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public ResetPasswordRequest() {}
    
    public ResetPasswordRequest(String locale, String distributorId, ClientId clientId) {
    	this.locale = locale;
    	this.distributorId = distributorId;
    	this.clientId = clientId;
    }
    
    @JsonInclude(Include.NON_NULL)
    public String locale;
    
    @JsonInclude(Include.NON_NULL)
    public String distributorId;
    
    @JsonInclude(Include.NON_NULL)
    public ClientId clientId;
}
