// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner;

/** Resource collection API of MarketplaceAgreements. */
public interface MarketplaceAgreements {
    /**
     * List Confluent marketplace agreements in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<ConfluentAgreementResource> list();

    /**
     * List Confluent marketplace agreements in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<ConfluentAgreementResource> list(Context context);

    /**
     * Accept marketplace terms.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confluent Agreements Resource.
     */
    ConfluentAgreementResource create();

    /**
     * Accept marketplace terms.
     *
     * @param body Confluent Agreement resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return confluent Agreements Resource.
     */
    Response<ConfluentAgreementResource> createWithResponse(ConfluentAgreementResourceInner body, Context context);
}