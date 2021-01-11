// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Intrusion detection bypass traffic specification. */
@Fluent
public final class FirewallPolicyIntrusionDetectionBypassTrafficSpecifications {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(FirewallPolicyIntrusionDetectionBypassTrafficSpecifications.class);

    /*
     * Name of the bypass traffic rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the bypass traffic rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The rule bypass protocol.
     */
    @JsonProperty(value = "protocol")
    private FirewallPolicyIntrusionDetectionProtocol protocol;

    /*
     * List of source IP addresses or ranges for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or ranges for this rule.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports or ranges.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /*
     * List of destination IpGroups for this rule.
     */
    @JsonProperty(value = "destinationIpGroups")
    private List<String> destinationIpGroups;

    /**
     * Get the name property: Name of the bypass traffic rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the bypass traffic rule.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the bypass traffic rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the bypass traffic rule.
     *
     * @param description the description value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocol property: The rule bypass protocol.
     *
     * @return the protocol value.
     */
    public FirewallPolicyIntrusionDetectionProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The rule bypass protocol.
     *
     * @param protocol the protocol value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withProtocol(
        FirewallPolicyIntrusionDetectionProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses or ranges for this rule.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses or ranges for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withSourceAddresses(
        List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or ranges for this rule.
     *
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or ranges for this rule.
     *
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withDestinationAddresses(
        List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports or ranges.
     *
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports or ranges.
     *
     * @param destinationPorts the destinationPorts value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withDestinationPorts(
        List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get the destinationIpGroups property: List of destination IpGroups for this rule.
     *
     * @return the destinationIpGroups value.
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups;
    }

    /**
     * Set the destinationIpGroups property: List of destination IpGroups for this rule.
     *
     * @param destinationIpGroups the destinationIpGroups value to set.
     * @return the FirewallPolicyIntrusionDetectionBypassTrafficSpecifications object itself.
     */
    public FirewallPolicyIntrusionDetectionBypassTrafficSpecifications withDestinationIpGroups(
        List<String> destinationIpGroups) {
        this.destinationIpGroups = destinationIpGroups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}