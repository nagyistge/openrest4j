package com.openrest.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.openrest.olo.dispatches.DispatchInfo;
import com.wix.restaurants.availability.Availability;
import com.wix.restaurants.reservations.ReservationsInfo;

import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant extends Organization {
	public static final String TYPE = "restaurant";
	private static final long serialVersionUID = 1L;
    
    public Restaurant(String id, String alias, String affiliateId, Map<String, String> externalIds, Date created, Date modified,
    		String distributorId, String chainId, Map<String, String> title,
    		Map<String, String> description, Contact contact, Map<String, Contact> externalContacts, Address address,
    		Map<String, Map<String, String>> messages, ColorScheme colorScheme,
    		Availability openTimes, Availability deliveryTimes,
            List<DispatchInfo> deliveryInfos, Integer maxFutureOrderDelayMins,
            String timezone, String currency, String locale, Set<String> locales,
            Set<String> paymentTypes, Boolean multiPaymentDisabled, Map<String, CardInfo> cardInfos, CreditcardsInfo creditcardsInfo,
            DeliveriesInfo deliveriesInfo, ReservationsInfo reservations, Map<String, Integer> minPayments, Boolean antiFraudDisabled, String link, String domain,
            Set<String> altDomains, String picture, String icon, String wideLogo, String noImagePicture, Map<String, Blob> blobs,
            List<AppInfo> apps, Seo seo, Map<String, String> properties, Map<String, String> compatibilities,
            Map<String, Availability> availabilities,
            String state, Boolean closed, String virtualId, Boolean inactive, Set<Product> products, Map<String, Double> features, Double rank) {
    	super(id, alias, affiliateId, externalIds, created, modified, title, description, locale, locales, messages, colorScheme,
    			contact, externalContacts, address, timezone, currency, link, domain, altDomains, apps, seo, properties, compatibilities,
                availabilities, picture, icon, wideLogo, noImagePicture, blobs, state, closed, virtualId, inactive, products, rank);
        
    	this.distributorId = distributorId;
    	this.chainId = chainId;
        this.openTimes = openTimes;
        this.deliveryTimes = deliveryTimes;
        this.deliveryInfos = deliveryInfos;
        this.maxFutureOrderDelayMins = maxFutureOrderDelayMins;
        this.paymentTypes = paymentTypes;
        this.multiPaymentDisabled = multiPaymentDisabled;
        this.creditcardsInfo = creditcardsInfo;
        this.deliveriesInfo = deliveriesInfo;
        this.reservations = reservations;
        this.cardInfos = cardInfos;
        this.minPayments = minPayments;
        this.antiFraudDisabled = antiFraudDisabled;
        this.features = features;
    }

    /** Default constructor for JSON deserialization. */
    public Restaurant() {}
    
    /** @return a shallow copy of this object. */
    @Override
	public Object clone() {
    	return new Restaurant(id, alias, affiliateId,
    			((externalIds != null) ? new LinkedHashMap<>(externalIds) : null),
                (created != null) ? (Date) created.clone() : null,
                (modified != null) ? (Date) modified.clone() : null,
                distributorId, chainId,
    			((title != null) ? new LinkedHashMap<>(title) : null),
    			((description != null) ? new LinkedHashMap<>(description) : null),
    			((contact != null) ? (Contact)contact.clone() : null), Contact.clone(externalContacts),
    			((address != null) ? (Address)address.clone() : null),
    			cloneMessages(messages),
    			((colorScheme != null) ? (ColorScheme) colorScheme.clone() : null),
    			((openTimes != null) ? (Availability) openTimes.clone() : null),
    			((deliveryTimes != null) ? (Availability) deliveryTimes.clone() : null),
                DispatchInfo.clone(deliveryInfos), maxFutureOrderDelayMins,
    			timezone, currency, locale,
    			((locales != null) ? new LinkedHashSet<>(locales) : null),
    			((paymentTypes != null) ? new LinkedHashSet<>(paymentTypes) : null),
    			multiPaymentDisabled, CardInfo.clone(cardInfos),
                ((creditcardsInfo != null) ? (CreditcardsInfo) creditcardsInfo.clone() : null),
                ((deliveriesInfo != null) ? (DeliveriesInfo) deliveriesInfo.clone() : null),
                ((reservations != null) ? (ReservationsInfo) reservations.clone() : null),
    			((minPayments != null) ? new LinkedHashMap<>(minPayments) : null),
    			antiFraudDisabled, link, domain,
    			((altDomains != null) ? new LinkedHashSet<>(altDomains) : null),
    			picture, icon, wideLogo, noImagePicture, Blob.clone(blobs),
    			AppInfo.clone(apps),
    			((seo != null) ? (Seo) seo.clone() : null),
    			((properties != null) ? new LinkedHashMap<>(properties) : null),
    			((compatibilities != null) ? new LinkedHashMap<>(compatibilities) : null),
                Availability.clone(availabilities),
    			state, closed, virtualId, inactive,
    			Product.clone(products),
    			((features != null) ? new LinkedHashMap<>(features) : null),
    			rank);
	}
    

    /** The distributor in charge of this restaurant. */
    @JsonInclude(Include.NON_NULL)
    public String distributorId;
    
    /** The chain this restaurant is part of. */
    @JsonInclude(Include.NON_NULL)
    public String chainId;
    
    /**
     * Restaurant availability.
     * Scheduled for deprecation on 2016-10-27 (use availabilities).
     *
     * @see Organization#availabilities
     * @see com.wix.restaurants.Aspects#open
     */
    @Deprecated
    @JsonInclude(Include.NON_DEFAULT)
    public Availability openTimes = new Availability();

    /**
     * Deliveries availability.
     * Scheduled for deprecation on 2016-10-27 (use individual availability fields of deliveryInfos).
     */
    @Deprecated
    @JsonInclude(Include.NON_DEFAULT)
    public Availability deliveryTimes = new Availability();

    /** Information regarding the different delivery destinations. */
    @JsonInclude(Include.NON_DEFAULT)
    public List<DispatchInfo> deliveryInfos = new LinkedList<>();
    
    /**
     * Latest time up to which future orders will be accepted. For example, a value of 4320 means
     * that the restaurant is willing to accept future orders up to 3 days in advance. The default
     * value of 0 means that the restaurant does not allow future orders.
     */
    @JsonInclude(Include.NON_DEFAULT)
    public Integer maxFutureOrderDelayMins = 0;

    /** Available payment methods. */
    @JsonInclude(Include.NON_DEFAULT)
    public Set<String> paymentTypes = new LinkedHashSet<>();
    
    /** Whether or not the restaurant supports multiple payments in a single order. */
    @JsonInclude(Include.NON_DEFAULT)
    public Boolean multiPaymentDisabled = Boolean.FALSE;
    
    /**
     * Maps credit card networks (e.g. "visa", "amex" etc) to the information
     * required to clear cards of that network.
     * 
     * Networks that do not appear here are not supported by the restaurant.
     * 
     * For the complete list of credit card networks, see
     * http://code.google.com/p/creditcard/
     *
     * Scheduled for deprecation on 2015-08-01 (use creditcardsInfo).
     */
    @Deprecated
    @JsonInclude(Include.NON_DEFAULT)
    public Map<String, CardInfo> cardInfos = new LinkedHashMap<>();

    @JsonInclude(Include.NON_NULL)
    public CreditcardsInfo creditcardsInfo = new CreditcardsInfo();

    @JsonInclude(Include.NON_NULL)
    public DeliveriesInfo deliveriesInfo;

    @JsonInclude(Include.NON_NULL)
    public ReservationsInfo reservations;

    /**
     * Maps available payment types to minimal charge allowed per payment, e.g.
     * "credit cards can only be used for paying $5 or more". Non-referenced
     * payment types have zero minimum by default.
     */
    @JsonInclude(Include.NON_DEFAULT)
    public Map<String, Integer> minPayments = new LinkedHashMap<>();
    
    /** Whether or not the fraud prevention feature is turned off. */
    @JsonInclude(Include.NON_DEFAULT)
    public Boolean antiFraudDisabled = Boolean.FALSE;
    
    /**
     * Maps feature-IDs to their values. The values correspond to how strongly the feature
     * is relevant for the restaurant, which influences its position in search results.
     * 
     * For example, a restaurant with "hamburger" feature = 3.7 will appear before a
     * restaurant with the same feature = 2.3 when customers search for hamburgers.
     */
    @JsonInclude(Include.NON_DEFAULT)
    public Map<String, Double> features = new LinkedHashMap<>();
}
