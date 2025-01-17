// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurearcdata.fluent.SqlServerInstancesClient;
import com.azure.resourcemanager.azurearcdata.fluent.models.SqlServerInstanceInner;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstance;
import com.azure.resourcemanager.azurearcdata.models.SqlServerInstances;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlServerInstancesImpl implements SqlServerInstances {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlServerInstancesImpl.class);

    private final SqlServerInstancesClient innerClient;

    private final com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager;

    public SqlServerInstancesImpl(
        SqlServerInstancesClient innerClient,
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SqlServerInstance> list() {
        PagedIterable<SqlServerInstanceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SqlServerInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlServerInstance> list(Context context) {
        PagedIterable<SqlServerInstanceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SqlServerInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlServerInstance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SqlServerInstanceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SqlServerInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<SqlServerInstance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SqlServerInstanceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SqlServerInstanceImpl(inner1, this.manager()));
    }

    public SqlServerInstance getByResourceGroup(String resourceGroupName, String sqlServerInstanceName) {
        SqlServerInstanceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, sqlServerInstanceName);
        if (inner != null) {
            return new SqlServerInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SqlServerInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String sqlServerInstanceName, Context context) {
        Response<SqlServerInstanceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, sqlServerInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SqlServerInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String sqlServerInstanceName) {
        this.serviceClient().delete(resourceGroupName, sqlServerInstanceName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String sqlServerInstanceName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, sqlServerInstanceName, context);
    }

    public SqlServerInstance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlServerInstanceName = Utils.getValueFromIdByName(id, "sqlServerInstances");
        if (sqlServerInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlServerInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sqlServerInstanceName, Context.NONE).getValue();
    }

    public Response<SqlServerInstance> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlServerInstanceName = Utils.getValueFromIdByName(id, "sqlServerInstances");
        if (sqlServerInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlServerInstances'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, sqlServerInstanceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlServerInstanceName = Utils.getValueFromIdByName(id, "sqlServerInstances");
        if (sqlServerInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlServerInstances'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, sqlServerInstanceName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String sqlServerInstanceName = Utils.getValueFromIdByName(id, "sqlServerInstances");
        if (sqlServerInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'sqlServerInstances'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, sqlServerInstanceName, context);
    }

    private SqlServerInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager() {
        return this.serviceManager;
    }

    public SqlServerInstanceImpl define(String name) {
        return new SqlServerInstanceImpl(name, this.manager());
    }
}
