// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** driveItemVersion. */
@Fluent
public final class MicrosoftGraphDriveItemVersion extends MicrosoftGraphBaseItemVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphDriveItemVersion.class);

    /*
     * The content stream for this version of the item.
     */
    @JsonProperty(value = "content")
    private Base64Url content;

    /*
     * Indicates the size of the content stream for this version of the item.
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * driveItemVersion
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the content property: The content stream for this version of the item.
     *
     * @return the content value.
     */
    public byte[] content() {
        if (this.content == null) {
            return null;
        }
        return this.content.decodedBytes();
    }

    /**
     * Set the content property: The content stream for this version of the item.
     *
     * @param content the content value to set.
     * @return the MicrosoftGraphDriveItemVersion object itself.
     */
    public MicrosoftGraphDriveItemVersion withContent(byte[] content) {
        if (content == null) {
            this.content = null;
        } else {
            this.content = Base64Url.encode(CoreUtils.clone(content));
        }
        return this;
    }

    /**
     * Get the size property: Indicates the size of the content stream for this version of the item.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: Indicates the size of the content stream for this version of the item.
     *
     * @param size the size value to set.
     * @return the MicrosoftGraphDriveItemVersion object itself.
     */
    public MicrosoftGraphDriveItemVersion withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the additionalProperties property: driveItemVersion.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: driveItemVersion.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDriveItemVersion object itself.
     */
    public MicrosoftGraphDriveItemVersion withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItemVersion withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItemVersion withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItemVersion withPublication(MicrosoftGraphPublicationFacet publication) {
        super.withPublication(publication);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItemVersion withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}