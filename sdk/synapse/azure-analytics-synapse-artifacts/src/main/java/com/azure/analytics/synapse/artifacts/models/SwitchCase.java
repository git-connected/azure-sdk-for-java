// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Switch cases with have a value and corresponding activities. */
@Fluent
public final class SwitchCase {
    /*
     * Expected value that satisfies the expression result of the 'on'
     * property.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * List of activities to execute for satisfied case condition.
     */
    @JsonProperty(value = "activities")
    private List<Activity> activities;

    /**
     * Get the value property: Expected value that satisfies the expression result of the 'on' property.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Expected value that satisfies the expression result of the 'on' property.
     *
     * @param value the value value to set.
     * @return the SwitchCase object itself.
     */
    public SwitchCase setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the activities property: List of activities to execute for satisfied case condition.
     *
     * @return the activities value.
     */
    public List<Activity> getActivities() {
        return this.activities;
    }

    /**
     * Set the activities property: List of activities to execute for satisfied case condition.
     *
     * @param activities the activities value to set.
     * @return the SwitchCase object itself.
     */
    public SwitchCase setActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }
}