// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backup;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CreateMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Network;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersion;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Sku;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Storage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents a server. */
@JsonFlatten
@Fluent
public class ServerInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerInner.class);

    /*
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /*
     * The administrator login password (required for server creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * PostgreSQL Server version.
     */
    @JsonProperty(value = "properties.version")
    private ServerVersion version;

    /*
     * The minor version of the server.
     */
    @JsonProperty(value = "properties.minorVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String minorVersion;

    /*
     * A state of a server that is visible to user.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /*
     * The fully qualified domain name of a server.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /*
     * Storage properties of a server.
     */
    @JsonProperty(value = "properties.storage")
    private Storage storage;

    /*
     * Backup properties of a server.
     */
    @JsonProperty(value = "properties.backup")
    private Backup backup;

    /*
     * Network properties of a server.
     */
    @JsonProperty(value = "properties.network")
    private Network network;

    /*
     * High availability properties of a server.
     */
    @JsonProperty(value = "properties.highAvailability")
    private HighAvailability highAvailability;

    /*
     * Maintenance window properties of a server.
     */
    @JsonProperty(value = "properties.maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     */
    @JsonProperty(value = "properties.sourceServerResourceId")
    private String sourceServerResourceId;

    /*
     * Restore point creation time (ISO8601 format), specifying the time to
     * restore from. It's required when 'createMode' is 'PointInTimeRestore'.
     */
    @JsonProperty(value = "properties.pointInTimeUTC")
    private OffsetDateTime pointInTimeUtc;

    /*
     * availability zone information of the server.
     */
    @JsonProperty(value = "properties.availabilityZone")
    private String availabilityZone;

    /*
     * The mode to create a new PostgreSQL server.
     */
    @JsonProperty(value = "properties.createMode")
    private CreateMode createMode;

    /*
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "properties.tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tagsPropertiesTags;

    /**
     * Get the sku property: The SKU (pricing tier) of the server.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The administrator login password (required for server creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: PostgreSQL Server version.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: PostgreSQL Server version.
     *
     * @param version the version value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the minorVersion property: The minor version of the server.
     *
     * @return the minorVersion value.
     */
    public String minorVersion() {
        return this.minorVersion;
    }

    /**
     * Get the state property: A state of a server that is visible to user.
     *
     * @return the state value.
     */
    public ServerState state() {
        return this.state;
    }

    /**
     * Get the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get the storage property: Storage properties of a server.
     *
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage properties of a server.
     *
     * @param storage the storage value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the backup property: Backup properties of a server.
     *
     * @return the backup value.
     */
    public Backup backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup properties of a server.
     *
     * @param backup the backup value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withBackup(Backup backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the network property: Network properties of a server.
     *
     * @return the network value.
     */
    public Network network() {
        return this.network;
    }

    /**
     * Set the network property: Network properties of a server.
     *
     * @param network the network value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     * Get the highAvailability property: High availability properties of a server.
     *
     * @return the highAvailability value.
     */
    public HighAvailability highAvailability() {
        return this.highAvailability;
    }

    /**
     * Set the highAvailability property: High availability properties of a server.
     *
     * @param highAvailability the highAvailability value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withHighAvailability(HighAvailability highAvailability) {
        this.highAvailability = highAvailability;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window properties of a server.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the sourceServerResourceId property: The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceServerResourceId value.
     */
    public String sourceServerResourceId() {
        return this.sourceServerResourceId;
    }

    /**
     * Set the sourceServerResourceId property: The source server resource ID to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @param sourceServerResourceId the sourceServerResourceId value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withSourceServerResourceId(String sourceServerResourceId) {
        this.sourceServerResourceId = sourceServerResourceId;
        return this;
    }

    /**
     * Get the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore'.
     *
     * @return the pointInTimeUtc value.
     */
    public OffsetDateTime pointInTimeUtc() {
        return this.pointInTimeUtc;
    }

    /**
     * Set the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore'.
     *
     * @param pointInTimeUtc the pointInTimeUtc value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withPointInTimeUtc(OffsetDateTime pointInTimeUtc) {
        this.pointInTimeUtc = pointInTimeUtc;
        return this;
    }

    /**
     * Get the availabilityZone property: availability zone information of the server.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: availability zone information of the server.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the createMode property: The mode to create a new PostgreSQL server.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to create a new PostgreSQL server.
     *
     * @param createMode the createMode value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the tagsPropertiesTags property: Application-specific metadata in the form of key-value pairs.
     *
     * @return the tagsPropertiesTags value.
     */
    public Map<String, String> tagsPropertiesTags() {
        return this.tagsPropertiesTags;
    }

    /**
     * Set the tagsPropertiesTags property: Application-specific metadata in the form of key-value pairs.
     *
     * @param tagsPropertiesTags the tagsPropertiesTags value to set.
     * @return the ServerInner object itself.
     */
    public ServerInner withTagsPropertiesTags(Map<String, String> tagsPropertiesTags) {
        this.tagsPropertiesTags = tagsPropertiesTags;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (storage() != null) {
            storage().validate();
        }
        if (backup() != null) {
            backup().validate();
        }
        if (network() != null) {
            network().validate();
        }
        if (highAvailability() != null) {
            highAvailability().validate();
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
    }
}
