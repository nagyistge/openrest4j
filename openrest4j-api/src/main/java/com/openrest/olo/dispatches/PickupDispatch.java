package com.openrest.olo.dispatches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/** Pickup from the restaurant. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PickupDispatch extends Dispatch {
    public static final String TYPE = "takeout";
    private static final long serialVersionUID = 1L;

    /** Default constructor for JSON deserialization. */
    public PickupDispatch() {}

    public PickupDispatch(Date time, String timeGuarantee, Integer charge, Map<String, String> properties) {
        super(time, timeGuarantee, charge, properties);
    }

    @Override
    public Object clone() {
        return new PickupDispatch(
                (time != null) ? (Date) time.clone() : null,
                timeGuarantee, charge,
                ((properties != null) ? new LinkedHashMap<>(properties) : null));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PickupDispatch dispatch = (PickupDispatch) o;

        if (time != null ? !time.equals(dispatch.time) : dispatch.time != null) return false;
        if (timeGuarantee != null ? !timeGuarantee.equals(dispatch.timeGuarantee) : dispatch.timeGuarantee != null)
            return false;
        if (charge != null ? !charge.equals(dispatch.charge) : dispatch.charge != null) return false;
        return !(properties != null ? !properties.equals(dispatch.properties) : dispatch.properties != null);

    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (timeGuarantee != null ? timeGuarantee.hashCode() : 0);
        result = 31 * result + (charge != null ? charge.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        return result;
    }
}
