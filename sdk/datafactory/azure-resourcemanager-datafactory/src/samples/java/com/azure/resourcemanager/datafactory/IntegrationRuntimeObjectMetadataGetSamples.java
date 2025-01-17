// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.GetSsisObjectMetadataRequest;

/** Samples for IntegrationRuntimeObjectMetadata Get. */
public final class IntegrationRuntimeObjectMetadataGetSamples {
    /**
     * Sample code: IntegrationRuntimeObjectMetadata_Get.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimeObjectMetadataGet(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimeObjectMetadatas()
            .getWithResponse(
                "exampleResourceGroup",
                "exampleFactoryName",
                "testactivityv2",
                new GetSsisObjectMetadataRequest().withMetadataPath("ssisFolders"),
                Context.NONE);
    }
}
