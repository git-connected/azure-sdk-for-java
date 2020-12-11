// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.WorkspaceGitRepoManagementsImpl;
import com.azure.analytics.synapse.artifacts.models.GitHubAccessTokenRequest;
import com.azure.analytics.synapse.artifacts.models.GitHubAccessTokenResponse;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class WorkspaceGitRepoManagementAsyncClient {
    private final WorkspaceGitRepoManagementsImpl serviceClient;

    /**
     * Initializes an instance of WorkspaceGitRepoManagements client.
     *
     * @param serviceClient the service client implementation.
     */
    WorkspaceGitRepoManagementAsyncClient(WorkspaceGitRepoManagementsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @param clientRequestId Can provide a guid, which is helpful for debugging and to provide better customer support.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<GitHubAccessTokenResponse>> getGitHubAccessTokenWithResponse(
            GitHubAccessTokenRequest gitHubAccessTokenRequest, String clientRequestId) {
        return this.serviceClient.getGitHubAccessTokenWithResponseAsync(gitHubAccessTokenRequest, clientRequestId);
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @param clientRequestId Can provide a guid, which is helpful for debugging and to provide better customer support.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GitHubAccessTokenResponse> getGitHubAccessToken(
            GitHubAccessTokenRequest gitHubAccessTokenRequest, String clientRequestId) {
        return this.serviceClient.getGitHubAccessTokenAsync(gitHubAccessTokenRequest, clientRequestId);
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GitHubAccessTokenResponse> getGitHubAccessToken(GitHubAccessTokenRequest gitHubAccessTokenRequest) {
        return this.serviceClient.getGitHubAccessTokenAsync(gitHubAccessTokenRequest);
    }
}