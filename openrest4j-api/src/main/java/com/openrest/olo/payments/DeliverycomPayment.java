package com.openrest.olo.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.LinkedHashMap;
import java.util.Map;

/** Payment in delivery.com credit. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliverycomPayment extends Payment {
    public static final String TYPE = "com.delivery";
    private static final long serialVersionUID = 1L;

    /** Default constructor for JSON deserialization. */
    public DeliverycomPayment() {}

    public DeliverycomPayment(Integer amount, Map<String, String> externalIds) {
        super(amount, externalIds);
    }

    @Override
    public Object clone() {
        return new DeliverycomPayment(amount,
                ((externalIds != null) ? new LinkedHashMap<>(externalIds) : null));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final DeliverycomPayment payment = (DeliverycomPayment) o;

        if (amount != null ? !amount.equals(payment.amount) : payment.amount != null) return false;
        if (externalIds != null ? !externalIds.equals(payment.externalIds) : payment.externalIds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (externalIds != null ? externalIds.hashCode() : 0);
        return result;
    }
}
