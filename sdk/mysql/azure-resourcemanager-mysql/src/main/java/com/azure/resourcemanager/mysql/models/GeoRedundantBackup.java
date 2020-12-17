// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GeoRedundantBackup. */
public final class GeoRedundantBackup extends ExpandableStringEnum<GeoRedundantBackup> {
    /** Static value Enabled for GeoRedundantBackup. */
    public static final GeoRedundantBackup ENABLED = fromString("Enabled");

    /** Static value Disabled for GeoRedundantBackup. */
    public static final GeoRedundantBackup DISABLED = fromString("Disabled");

    /**
     * Creates or finds a GeoRedundantBackup from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoRedundantBackup.
     */
    @JsonCreator
    public static GeoRedundantBackup fromString(String name) {
        return fromString(name, GeoRedundantBackup.class);
    }

    /** @return known GeoRedundantBackup values. */
    public static Collection<GeoRedundantBackup> values() {
        return values(GeoRedundantBackup.class);
    }
}