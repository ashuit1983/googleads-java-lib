/**
 * CampaignServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public interface CampaignServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of campaigns that meet the selector criteria.
     * 
     *         
     * @param serviceSelector the selector specifying the {@link Campaign}s
     * to return.
     *         
     * @return A list of campaigns.
     *         
     * @throws ApiException if problems occurred while fetching campaign
     * information.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignPage get(com.google.api.ads.adwords.axis.v201601.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

    /**
     * Adds, updates, or removes campaigns.
     *         <p class="note"><b>Note:</b> {@link CampaignOperation} does
     * not support the
     *         <code>REMOVE</code> operator. To remove a campaign, set its
     * {@link Campaign#status status} to {@code REMOVED}.</p>
     *         
     * @param operations A list of unique operations.
     *         The same campaign cannot be specified in more than one operation.
     * 
     * @return The list of updated campaigns, returned in the same order
     * as the
     *         <code>operations</code> array.
     *         
     * @throws ApiException if problems occurred while updating campaign
     * information.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignReturnValue mutate(com.google.api.ads.adwords.axis.v201601.cm.CampaignOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

    /**
     * Adds labels to the {@linkplain Campaign campaign} or removes
     * {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}s
     * from the
     *         {@linkplain Campaign campaign}.
     *         <p>Add - Apply an existing label to an existing
     *         {@linkplain Campaign campaign}. The {@code campaignId} must
     * reference an existing
     *         {@linkplain Campaign}. The {@code labelId} must reference
     * an existing
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label
     * label}.</p>
     *         <p>Remove - Removes the link between the specified
     *         {@linkplain Campaign campaign} and
     *         {@linkplain com.google.ads.api.services.campaignmgmt.label.Label
     * label}.</p>
     *         
     * @param operations the operations to apply.
     *         
     * @return a list of {@linkplain CampaignLabel}s where each entry in
     * the list is the result of
     *         applying the operation in the input list with the same index.
     * For an
     *         add operation, the returned CampaignLabel contains the CampaignId
     * and the LabelId.
     *         In the case of a remove operation, the returned CampaignLabel
     * will only have CampaignId.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201601.cm.CampaignLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

    /**
     * Returns the list of campaigns that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return A list of campaigns.
     *         
     * @throws ApiException if problems occur while parsing the query or
     * fetching campaign
     *         information.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.CampaignPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;
}
