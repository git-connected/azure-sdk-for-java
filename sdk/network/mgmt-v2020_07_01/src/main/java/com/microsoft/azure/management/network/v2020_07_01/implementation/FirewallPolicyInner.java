/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_07_01.AzureFirewallThreatIntelMode;
import com.microsoft.azure.management.network.v2020_07_01.FirewallPolicyThreatIntelWhitelist;
import com.microsoft.azure.management.network.v2020_07_01.DnsSettings;
import com.microsoft.azure.management.network.v2020_07_01.FirewallPolicyIntrusionDetection;
import com.microsoft.azure.management.network.v2020_07_01.FirewallPolicyTransportSecurity;
import com.microsoft.azure.management.network.v2020_07_01.FirewallPolicySku;
import com.microsoft.azure.management.network.v2020_07_01.ManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * FirewallPolicy Resource.
 */
@JsonFlatten
@SkipParentValidation
public class FirewallPolicyInner extends Resource {
    /**
     * List of references to FirewallPolicyRuleCollectionGroups.
     */
    @JsonProperty(value = "properties.ruleCollectionGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> ruleCollectionGroups;

    /**
     * The provisioning state of the firewall policy resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The parent firewall policy from which rules are inherited.
     */
    @JsonProperty(value = "properties.basePolicy")
    private SubResource basePolicy;

    /**
     * List of references to Azure Firewalls that this Firewall Policy is
     * associated with.
     */
    @JsonProperty(value = "properties.firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

    /**
     * List of references to Child Firewall Policies.
     */
    @JsonProperty(value = "properties.childPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> childPolicies;

    /**
     * The operation mode for Threat Intelligence. Possible values include:
     * 'Alert', 'Deny', 'Off'.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /**
     * ThreatIntel Whitelist for Firewall Policy.
     */
    @JsonProperty(value = "properties.threatIntelWhitelist")
    private FirewallPolicyThreatIntelWhitelist threatIntelWhitelist;

    /**
     * DNS Proxy Settings definition.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private DnsSettings dnsSettings;

    /**
     * The configuration for Intrusion detection.
     */
    @JsonProperty(value = "properties.intrusionDetection")
    private FirewallPolicyIntrusionDetection intrusionDetection;

    /**
     * TLS Configuration definition.
     */
    @JsonProperty(value = "properties.transportSecurity")
    private FirewallPolicyTransportSecurity transportSecurity;

    /**
     * The Firewall Policy SKU.
     */
    @JsonProperty(value = "properties.sku")
    private FirewallPolicySku sku;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The identity of the firewall policy.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get list of references to FirewallPolicyRuleCollectionGroups.
     *
     * @return the ruleCollectionGroups value
     */
    public List<SubResource> ruleCollectionGroups() {
        return this.ruleCollectionGroups;
    }

    /**
     * Get the provisioning state of the firewall policy resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value
     */
    public SubResource basePolicy() {
        return this.basePolicy;
    }

    /**
     * Set the parent firewall policy from which rules are inherited.
     *
     * @param basePolicy the basePolicy value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withBasePolicy(SubResource basePolicy) {
        this.basePolicy = basePolicy;
        return this;
    }

    /**
     * Get list of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value
     */
    public List<SubResource> firewalls() {
        return this.firewalls;
    }

    /**
     * Get list of references to Child Firewall Policies.
     *
     * @return the childPolicies value
     */
    public List<SubResource> childPolicies() {
        return this.childPolicies;
    }

    /**
     * Get the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @return the threatIntelMode value
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'.
     *
     * @param threatIntelMode the threatIntelMode value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get threatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value
     */
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }

    /**
     * Set threatIntel Whitelist for Firewall Policy.
     *
     * @param threatIntelWhitelist the threatIntelWhitelist value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.threatIntelWhitelist = threatIntelWhitelist;
        return this;
    }

    /**
     * Get dNS Proxy Settings definition.
     *
     * @return the dnsSettings value
     */
    public DnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set dNS Proxy Settings definition.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withDnsSettings(DnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the configuration for Intrusion detection.
     *
     * @return the intrusionDetection value
     */
    public FirewallPolicyIntrusionDetection intrusionDetection() {
        return this.intrusionDetection;
    }

    /**
     * Set the configuration for Intrusion detection.
     *
     * @param intrusionDetection the intrusionDetection value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection) {
        this.intrusionDetection = intrusionDetection;
        return this;
    }

    /**
     * Get tLS Configuration definition.
     *
     * @return the transportSecurity value
     */
    public FirewallPolicyTransportSecurity transportSecurity() {
        return this.transportSecurity;
    }

    /**
     * Set tLS Configuration definition.
     *
     * @param transportSecurity the transportSecurity value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity) {
        this.transportSecurity = transportSecurity;
        return this;
    }

    /**
     * Get the Firewall Policy SKU.
     *
     * @return the sku value
     */
    public FirewallPolicySku sku() {
        return this.sku;
    }

    /**
     * Set the Firewall Policy SKU.
     *
     * @param sku the sku value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSku(FirewallPolicySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity of the firewall policy.
     *
     * @return the identity value
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the firewall policy.
     *
     * @param identity the identity value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

}