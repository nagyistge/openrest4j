package com.openrest.v1_1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.openrest.olo.GetPotentialWeeklyStatsRequest;
import com.openrest.olo.SetPotentialWeeklyStatsRequest;
import com.wix.restaurants.reservations.requests.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,  
	    include = JsonTypeInfo.As.PROPERTY,  
	    property = "type")  
@JsonSubTypes({
	@Type(value = GetOrganizationRequest.class, name = GetOrganizationRequest.TYPE),
	@Type(value = GetOrganizationsRequest.class, name = GetOrganizationsRequest.TYPE),
	@Type(value = SetOrganizationRequest.class, name = SetOrganizationRequest.TYPE),
	@Type(value = AddOrganizationRequest.class, name = AddOrganizationRequest.TYPE),
	@Type(value = GetChainsRequest.class, name = GetChainsRequest.TYPE),
	@Type(value = GetDistributorsRequest.class, name = GetDistributorsRequest.TYPE),
	@Type(value = GetOrganizationFullRequest.class, name = GetOrganizationFullRequest.TYPE),
	@Type(value = GetItemRequest.class, name = GetItemRequest.TYPE),
	@Type(value = SearchRequest.class, name = SearchRequest.TYPE),
	@Type(value = SearchPortalsRequest.class, name = SearchPortalsRequest.TYPE),
	@Type(value = QueryOrdersRequest.class, name = QueryOrdersRequest.TYPE),
	@Type(value = GetOrderRequest.class, name = GetOrderRequest.TYPE),
	@Type(value = DisplayOrderRequest.class, name = DisplayOrderRequest.TYPE),
	@Type(value = NotifyOrderRequest.class, name = NotifyOrderRequest.TYPE),
	@Type(value = SubmitOrderRequest.class, name = SubmitOrderRequest.TYPE),
	@Type(value = SetOrderStatusRequest.class, name = SetOrderStatusRequest.TYPE),
	@Type(value = SetOrderPropertiesRequest.class, name = SetOrderPropertiesRequest.TYPE),
	@Type(value = QueryClubMembersRequest.class, name = QueryClubMembersRequest.TYPE),
	@Type(value = SubmitFeedbackRequest.class, name = SubmitFeedbackRequest.TYPE),
    @Type(value = SaveCardRequest.class, name = SaveCardRequest.TYPE),
	@Type(value = SaveCardsRequest.class, name = SaveCardsRequest.TYPE),
	@Type(value = CreatePaypalPaymentRequest.class, name = CreatePaypalPaymentRequest.TYPE),
	@Type(value = CreateBitpayPaymentRequest.class, name = CreateBitpayPaymentRequest.TYPE),
	@Type(value = CreateCreditmutuelPaymentRequest.class, name = CreateCreditmutuelPaymentRequest.TYPE),
	@Type(value = SetMenuRequest.class, name = SetMenuRequest.TYPE),
	@Type(value = RegisterForPushNotificationsRequest.class, name = RegisterForPushNotificationsRequest.TYPE),
	@Type(value = RegisterForPushRequest.class, name = RegisterForPushRequest.TYPE),
	@Type(value = PushRequest.class, name = PushRequest.TYPE),
	@Type(value = GetAppCredentialsRequest.class, name = GetAppCredentialsRequest.TYPE),
	@Type(value = SetAppCredentialsRequest.class, name = SetAppCredentialsRequest.TYPE),
	@Type(value = SetAppMappingRequest.class, name = SetAppMappingRequest.TYPE),
	@Type(value = SetWixAppMappingRequest.class, name = SetWixAppMappingRequest.TYPE),
	@Type(value = SetFacebookAppMappingRequest.class, name = SetFacebookAppMappingRequest.TYPE),
	@Type(value = GetAppMappedObjectRequest.class, name = GetAppMappedObjectRequest.TYPE),
	@Type(value = SetBlobRequest.class, name = SetBlobRequest.TYPE),
	@Type(value = GetRolesRequest.class, name = GetRolesRequest.TYPE),
	@Type(value = GetClientIdRequest.class, name = GetClientIdRequest.TYPE),
	@Type(value = GetClientInfoRequest.class, name = GetClientInfoRequest.TYPE),
	@Type(value = SetClientInfoRequest.class, name = SetClientInfoRequest.TYPE),
	@Type(value = SetClientInfoCommentsRequest.class, name = SetClientInfoCommentsRequest.TYPE),
	@Type(value = SetAvailabilityExceptionsRequest.class, name = SetAvailabilityExceptionsRequest.TYPE),
	@Type(value = QueryEmailRequest.class, name = QueryEmailRequest.TYPE),
	@Type(value = DeferredRequest.class, name = DeferredRequest.TYPE),
	@Type(value = BatchRequest.class, name = BatchRequest.TYPE),
	@Type(value = GetStatsRequest.class, name = GetStatsRequest.TYPE),
    @Type(value = GetPotentialWeeklyStatsRequest.class, name = GetPotentialWeeklyStatsRequest.TYPE),
    @Type(value = SetPotentialWeeklyStatsRequest.class, name = SetPotentialWeeklyStatsRequest.TYPE),
	@Type(value = GetStaffRequest.class, name = GetStaffRequest.TYPE),
	@Type(value = SetStaffRequest.class, name = SetStaffRequest.TYPE),
	@Type(value = GetNotificationsRequest.class, name = GetNotificationsRequest.TYPE),
	@Type(value = SetNotificationsRequest.class, name = SetNotificationsRequest.TYPE),
	@Type(value = GetBillingRequest.class, name = GetBillingRequest.TYPE),
	@Type(value = SetBillingRequest.class, name = SetBillingRequest.TYPE),
	@Type(value = GetBillRequest.class, name = GetBillRequest.TYPE),
	@Type(value = CalculateBillRequest.class, name = CalculateBillRequest.TYPE),
	@Type(value = GetBalanceLinesRequest.class, name = GetBalanceLinesRequest.TYPE),
	@Type(value = AddBalanceLineRequest.class, name = AddBalanceLineRequest.TYPE),
	@Type(value = AddCostRequest.class, name = AddCostRequest.TYPE),
	@Type(value = ExtendAccessTokenRequest.class, name = ExtendAccessTokenRequest.TYPE),
	@Type(value = SubscribeToMailingListRequest.class, name = SubscribeToMailingListRequest.TYPE),
	@Type(value = SignUpRequest.class, name = SignUpRequest.TYPE),
	@Type(value = SignedRequest.class, name = SignedRequest.TYPE),
	@Type(value = ResetPasswordRequest.class, name = ResetPasswordRequest.TYPE),
	@Type(value = SetPasswordRequest.class, name = SetPasswordRequest.TYPE),
	@Type(value = GetAppPublisherRequest.class, name = GetAppPublisherRequest.TYPE),
	@Type(value = SetAppPublisherRequest.class, name = SetAppPublisherRequest.TYPE),
	@Type(value = SubmitAppRequest.class, name = SubmitAppRequest.TYPE),
	@Type(value = SetAppRequest.class, name = SetAppRequest.TYPE),
	@Type(value = QueryAppsRequest.class, name = QueryAppsRequest.TYPE),
	@Type(value = GetSecretsRequest.class, name = GetSecretsRequest.TYPE),
	@Type(value = SetSecretsRequest.class, name = SetSecretsRequest.TYPE),
	@Type(value = SetSecretRequest.class, name = SetSecretRequest.TYPE),
	@Type(value = GetFeaturesRequest.class, name = GetFeaturesRequest.TYPE),
	@Type(value = GetPropertyRequest.class, name = GetPropertyRequest.TYPE),
	@Type(value = SetPropertyRequest.class, name = SetPropertyRequest.TYPE),
	@Type(value = GeocodeRequest.class, name = GeocodeRequest.TYPE),
	@Type(value = ToggleProductRequest.class, name = ToggleProductRequest.TYPE),
    @Type(value = ToggleInactiveRequest.class, name = ToggleInactiveRequest.TYPE),
	@Type(value = QueryUsageRequest.class, name = QueryUsageRequest.TYPE),
	@Type(value = GetInvrecRequest.class, name = GetInvrecRequest.TYPE),
	@Type(value = AcceptDocumentRequest.class, name = AcceptDocumentRequest.TYPE),
	@Type(value = GetInventoryRequest.class, name = GetInventoryRequest.TYPE),
	@Type(value = SetInventoryRequest.class, name = SetInventoryRequest.TYPE),
	@Type(value = AddInventoryRequest.class, name = AddInventoryRequest.TYPE),
	@Type(value = AddChargeUsageRequest.class, name = AddChargeUsageRequest.TYPE),
	@Type(value = GetChargeUsageRequest.class, name = GetChargeUsageRequest.TYPE),
	@Type(value = CreateGroupRequest.class, name = CreateGroupRequest.TYPE),
	@Type(value = SetGroupRequest.class, name = SetGroupRequest.TYPE),
	@Type(value = GetGroupsRequest.class, name = GetGroupsRequest.TYPE),
	@Type(value = JoinGroupRequest.class, name = JoinGroupRequest.TYPE),
	@Type(value = LeaveGroupRequest.class, name = LeaveGroupRequest.TYPE),
	@Type(value = GetGroupStaffRequest.class, name = GetGroupStaffRequest.TYPE),
	@Type(value = SetGroupStaffRequest.class, name = SetGroupStaffRequest.TYPE),
	@Type(value = AuthenticateRequest.class, name = AuthenticateRequest.TYPE),
	@Type(value = SubmitReservationRequest.class, name = SubmitReservationRequest.TYPE),
	@Type(value = GetReservationRequest.class, name = GetReservationRequest.TYPE),
	@Type(value = QueryUnhandledReservationsRequest.class, name = QueryUnhandledReservationsRequest.TYPE),
	@Type(value = QueryModifiedReservationsRequest.class, name = QueryModifiedReservationsRequest.TYPE),
	@Type(value = QueryReservationsRequest.class, name = QueryReservationsRequest.TYPE)
})
public abstract class Request implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public Request() {}
}
