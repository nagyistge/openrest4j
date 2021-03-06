package com.openrest.v1_1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LatLng implements Serializable, Cloneable {
	@Override
	public String toString() {
		return "{\"lat\":" + lat + ",\"lng\":" + lng + "}";
	}

	public LatLng(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    /** Default constructor for JSON deserialization. */
    public LatLng() {}
    
    @Override
	public Object clone() {
    	return new LatLng(lat, lng);
	}

    @JsonInclude(Include.NON_NULL)
    public Double lat;

    @JsonInclude(Include.NON_NULL)
    public Double lng;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LatLng other = (LatLng) obj;
        if (this.lat != other.lat && (this.lat == null || !this.lat.equals(other.lat))) {
            return false;
        }
        if (this.lng != other.lng && (this.lng == null || !this.lng.equals(other.lng))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.lat != null ? this.lat.hashCode() : 0);
        hash = 29 * hash + (this.lng != null ? this.lng.hashCode() : 0);
        return hash;
    }
    
    private static final long serialVersionUID = 1L;
}
