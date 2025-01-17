// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

/** Samples for Factories CreateOrUpdate. */
public final class FactoriesCreateOrUpdateSamples {
    /**
     * Sample code: Factories_CreateOrUpdate.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void factoriesCreateOrUpdate(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .factories()
            .define("exampleFactoryName")
            .withRegion("East US")
            .withExistingResourceGroup("exampleResourceGroup")
            .create();
    }
}
