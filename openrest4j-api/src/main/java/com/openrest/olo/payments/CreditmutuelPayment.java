package com.openrest.olo.payments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;
import java.util.Map;

/** Payment with CreditMutuel token. */
@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditmutuelPayment extends Payment {
    public static final String TYPE = "fr.creditmutuel";
    private static final long serialVersionUID = 1L;

    /** Default constructor for JSON deserialization. */
    public CreditmutuelPayment() {}

    public CreditmutuelPayment(Integer amount, Map<String, String> externalIds, String token) {
        super(amount, externalIds);
        this.token = token;
    }

    @Override
    public Object clone() {
        return new CreditmutuelPayment(amount,
                ((externalIds != null) ? new LinkedHashMap<>(externalIds) : null),
                token);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CreditmutuelPayment that = (CreditmutuelPayment) o;

        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (externalIds != null ? !externalIds.equals(that.externalIds) : that.externalIds != null) return false;
        return !(token != null ? !token.equals(that.token) : that.token != null);
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (externalIds != null ? externalIds.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    /** Payment token. */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String token;
}
