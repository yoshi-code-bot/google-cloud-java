/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.artifactregistry.v1.stub;

import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListAttachmentsPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListDockerImagesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListFilesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListLocationsPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListMavenArtifactsPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListNpmPackagesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListPackagesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListPythonPackagesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListRepositoriesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListRulesPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListTagsPagedResponse;
import static com.google.devtools.artifactregistry.v1.ArtifactRegistryClient.ListVersionsPagedResponse;

import com.google.api.HttpRule;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableMap;
import com.google.devtools.artifactregistry.v1.Attachment;
import com.google.devtools.artifactregistry.v1.BatchDeleteVersionsMetadata;
import com.google.devtools.artifactregistry.v1.BatchDeleteVersionsRequest;
import com.google.devtools.artifactregistry.v1.CreateAttachmentRequest;
import com.google.devtools.artifactregistry.v1.CreateRepositoryRequest;
import com.google.devtools.artifactregistry.v1.CreateRuleRequest;
import com.google.devtools.artifactregistry.v1.CreateTagRequest;
import com.google.devtools.artifactregistry.v1.DeleteAttachmentRequest;
import com.google.devtools.artifactregistry.v1.DeleteFileRequest;
import com.google.devtools.artifactregistry.v1.DeletePackageRequest;
import com.google.devtools.artifactregistry.v1.DeleteRepositoryRequest;
import com.google.devtools.artifactregistry.v1.DeleteRuleRequest;
import com.google.devtools.artifactregistry.v1.DeleteTagRequest;
import com.google.devtools.artifactregistry.v1.DeleteVersionRequest;
import com.google.devtools.artifactregistry.v1.DockerImage;
import com.google.devtools.artifactregistry.v1.File;
import com.google.devtools.artifactregistry.v1.GetAttachmentRequest;
import com.google.devtools.artifactregistry.v1.GetDockerImageRequest;
import com.google.devtools.artifactregistry.v1.GetFileRequest;
import com.google.devtools.artifactregistry.v1.GetMavenArtifactRequest;
import com.google.devtools.artifactregistry.v1.GetNpmPackageRequest;
import com.google.devtools.artifactregistry.v1.GetPackageRequest;
import com.google.devtools.artifactregistry.v1.GetProjectSettingsRequest;
import com.google.devtools.artifactregistry.v1.GetPythonPackageRequest;
import com.google.devtools.artifactregistry.v1.GetRepositoryRequest;
import com.google.devtools.artifactregistry.v1.GetRuleRequest;
import com.google.devtools.artifactregistry.v1.GetTagRequest;
import com.google.devtools.artifactregistry.v1.GetVPCSCConfigRequest;
import com.google.devtools.artifactregistry.v1.GetVersionRequest;
import com.google.devtools.artifactregistry.v1.ImportAptArtifactsMetadata;
import com.google.devtools.artifactregistry.v1.ImportAptArtifactsRequest;
import com.google.devtools.artifactregistry.v1.ImportAptArtifactsResponse;
import com.google.devtools.artifactregistry.v1.ImportYumArtifactsMetadata;
import com.google.devtools.artifactregistry.v1.ImportYumArtifactsRequest;
import com.google.devtools.artifactregistry.v1.ImportYumArtifactsResponse;
import com.google.devtools.artifactregistry.v1.ListAttachmentsRequest;
import com.google.devtools.artifactregistry.v1.ListAttachmentsResponse;
import com.google.devtools.artifactregistry.v1.ListDockerImagesRequest;
import com.google.devtools.artifactregistry.v1.ListDockerImagesResponse;
import com.google.devtools.artifactregistry.v1.ListFilesRequest;
import com.google.devtools.artifactregistry.v1.ListFilesResponse;
import com.google.devtools.artifactregistry.v1.ListMavenArtifactsRequest;
import com.google.devtools.artifactregistry.v1.ListMavenArtifactsResponse;
import com.google.devtools.artifactregistry.v1.ListNpmPackagesRequest;
import com.google.devtools.artifactregistry.v1.ListNpmPackagesResponse;
import com.google.devtools.artifactregistry.v1.ListPackagesRequest;
import com.google.devtools.artifactregistry.v1.ListPackagesResponse;
import com.google.devtools.artifactregistry.v1.ListPythonPackagesRequest;
import com.google.devtools.artifactregistry.v1.ListPythonPackagesResponse;
import com.google.devtools.artifactregistry.v1.ListRepositoriesRequest;
import com.google.devtools.artifactregistry.v1.ListRepositoriesResponse;
import com.google.devtools.artifactregistry.v1.ListRulesRequest;
import com.google.devtools.artifactregistry.v1.ListRulesResponse;
import com.google.devtools.artifactregistry.v1.ListTagsRequest;
import com.google.devtools.artifactregistry.v1.ListTagsResponse;
import com.google.devtools.artifactregistry.v1.ListVersionsRequest;
import com.google.devtools.artifactregistry.v1.ListVersionsResponse;
import com.google.devtools.artifactregistry.v1.MavenArtifact;
import com.google.devtools.artifactregistry.v1.NpmPackage;
import com.google.devtools.artifactregistry.v1.OperationMetadata;
import com.google.devtools.artifactregistry.v1.Package;
import com.google.devtools.artifactregistry.v1.ProjectSettings;
import com.google.devtools.artifactregistry.v1.PythonPackage;
import com.google.devtools.artifactregistry.v1.Repository;
import com.google.devtools.artifactregistry.v1.Rule;
import com.google.devtools.artifactregistry.v1.Tag;
import com.google.devtools.artifactregistry.v1.UpdateFileRequest;
import com.google.devtools.artifactregistry.v1.UpdatePackageRequest;
import com.google.devtools.artifactregistry.v1.UpdateProjectSettingsRequest;
import com.google.devtools.artifactregistry.v1.UpdateRepositoryRequest;
import com.google.devtools.artifactregistry.v1.UpdateRuleRequest;
import com.google.devtools.artifactregistry.v1.UpdateTagRequest;
import com.google.devtools.artifactregistry.v1.UpdateVPCSCConfigRequest;
import com.google.devtools.artifactregistry.v1.UpdateVersionRequest;
import com.google.devtools.artifactregistry.v1.VPCSCConfig;
import com.google.devtools.artifactregistry.v1.Version;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the ArtifactRegistry service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonArtifactRegistryStub extends ArtifactRegistryStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(BatchDeleteVersionsMetadata.getDescriptor())
          .add(Attachment.getDescriptor())
          .add(Empty.getDescriptor())
          .add(ImportYumArtifactsResponse.getDescriptor())
          .add(ImportAptArtifactsResponse.getDescriptor())
          .add(ImportYumArtifactsMetadata.getDescriptor())
          .add(ImportAptArtifactsMetadata.getDescriptor())
          .add(Repository.getDescriptor())
          .add(OperationMetadata.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<ListDockerImagesRequest, ListDockerImagesResponse>
      listDockerImagesMethodDescriptor =
          ApiMethodDescriptor.<ListDockerImagesRequest, ListDockerImagesResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListDockerImages")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListDockerImagesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/dockerImages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListDockerImagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListDockerImagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListDockerImagesResponse>newBuilder()
                      .setDefaultInstance(ListDockerImagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetDockerImageRequest, DockerImage>
      getDockerImageMethodDescriptor =
          ApiMethodDescriptor.<GetDockerImageRequest, DockerImage>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetDockerImage")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetDockerImageRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/dockerImages/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetDockerImageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetDockerImageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<DockerImage>newBuilder()
                      .setDefaultInstance(DockerImage.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListMavenArtifactsRequest, ListMavenArtifactsResponse>
      listMavenArtifactsMethodDescriptor =
          ApiMethodDescriptor.<ListMavenArtifactsRequest, ListMavenArtifactsResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListMavenArtifacts")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListMavenArtifactsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/mavenArtifacts",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListMavenArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListMavenArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListMavenArtifactsResponse>newBuilder()
                      .setDefaultInstance(ListMavenArtifactsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetMavenArtifactRequest, MavenArtifact>
      getMavenArtifactMethodDescriptor =
          ApiMethodDescriptor.<GetMavenArtifactRequest, MavenArtifact>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetMavenArtifact")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetMavenArtifactRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/mavenArtifacts/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetMavenArtifactRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetMavenArtifactRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<MavenArtifact>newBuilder()
                      .setDefaultInstance(MavenArtifact.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListNpmPackagesRequest, ListNpmPackagesResponse>
      listNpmPackagesMethodDescriptor =
          ApiMethodDescriptor.<ListNpmPackagesRequest, ListNpmPackagesResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListNpmPackages")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListNpmPackagesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/npmPackages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListNpmPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListNpmPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListNpmPackagesResponse>newBuilder()
                      .setDefaultInstance(ListNpmPackagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetNpmPackageRequest, NpmPackage>
      getNpmPackageMethodDescriptor =
          ApiMethodDescriptor.<GetNpmPackageRequest, NpmPackage>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetNpmPackage")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetNpmPackageRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/npmPackages/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetNpmPackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetNpmPackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<NpmPackage>newBuilder()
                      .setDefaultInstance(NpmPackage.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListPythonPackagesRequest, ListPythonPackagesResponse>
      listPythonPackagesMethodDescriptor =
          ApiMethodDescriptor.<ListPythonPackagesRequest, ListPythonPackagesResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListPythonPackages")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListPythonPackagesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/pythonPackages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListPythonPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListPythonPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListPythonPackagesResponse>newBuilder()
                      .setDefaultInstance(ListPythonPackagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetPythonPackageRequest, PythonPackage>
      getPythonPackageMethodDescriptor =
          ApiMethodDescriptor.<GetPythonPackageRequest, PythonPackage>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetPythonPackage")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetPythonPackageRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/pythonPackages/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetPythonPackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetPythonPackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<PythonPackage>newBuilder()
                      .setDefaultInstance(PythonPackage.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ImportAptArtifactsRequest, Operation>
      importAptArtifactsMethodDescriptor =
          ApiMethodDescriptor.<ImportAptArtifactsRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ImportAptArtifacts")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ImportAptArtifactsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/aptArtifacts:import",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ImportAptArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ImportAptArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ImportAptArtifactsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ImportYumArtifactsRequest, Operation>
      importYumArtifactsMethodDescriptor =
          ApiMethodDescriptor.<ImportYumArtifactsRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ImportYumArtifacts")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ImportYumArtifactsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/yumArtifacts:import",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ImportYumArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ImportYumArtifactsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ImportYumArtifactsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesMethodDescriptor =
          ApiMethodDescriptor.<ListRepositoriesRequest, ListRepositoriesResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListRepositories")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListRepositoriesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/repositories",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListRepositoriesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListRepositoriesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListRepositoriesResponse>newBuilder()
                      .setDefaultInstance(ListRepositoriesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetRepositoryRequest, Repository>
      getRepositoryMethodDescriptor =
          ApiMethodDescriptor.<GetRepositoryRequest, Repository>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetRepository")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetRepositoryRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Repository>newBuilder()
                      .setDefaultInstance(Repository.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateRepositoryRequest, Operation>
      createRepositoryMethodDescriptor =
          ApiMethodDescriptor.<CreateRepositoryRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/CreateRepository")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateRepositoryRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/repositories",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "repositoryId", request.getRepositoryId());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("repository", request.getRepository(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateRepositoryRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateRepositoryRequest, Repository>
      updateRepositoryMethodDescriptor =
          ApiMethodDescriptor.<UpdateRepositoryRequest, Repository>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateRepository")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateRepositoryRequest>newBuilder()
                      .setPath(
                          "/v1/{repository.name=projects/*/locations/*/repositories/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "repository.name", request.getRepository().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("repository", request.getRepository(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Repository>newBuilder()
                      .setDefaultInstance(Repository.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteRepositoryRequest, Operation>
      deleteRepositoryMethodDescriptor =
          ApiMethodDescriptor.<DeleteRepositoryRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteRepository")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteRepositoryRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteRepositoryRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteRepositoryRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListPackagesRequest, ListPackagesResponse>
      listPackagesMethodDescriptor =
          ApiMethodDescriptor.<ListPackagesRequest, ListPackagesResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListPackages")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListPackagesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/packages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListPackagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListPackagesResponse>newBuilder()
                      .setDefaultInstance(ListPackagesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetPackageRequest, Package> getPackageMethodDescriptor =
      ApiMethodDescriptor.<GetPackageRequest, Package>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/GetPackage")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetPackageRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/packages/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetPackageRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetPackageRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Package>newBuilder()
                  .setDefaultInstance(Package.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeletePackageRequest, Operation>
      deletePackageMethodDescriptor =
          ApiMethodDescriptor.<DeletePackageRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/DeletePackage")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeletePackageRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/packages/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeletePackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeletePackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeletePackageRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListVersionsRequest, ListVersionsResponse>
      listVersionsMethodDescriptor =
          ApiMethodDescriptor.<ListVersionsRequest, ListVersionsResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListVersions")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListVersionsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*/packages/*}/versions",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "view", request.getViewValue());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListVersionsResponse>newBuilder()
                      .setDefaultInstance(ListVersionsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetVersionRequest, Version> getVersionMethodDescriptor =
      ApiMethodDescriptor.<GetVersionRequest, Version>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/GetVersion")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetVersionRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetVersionRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetVersionRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "view", request.getViewValue());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Version>newBuilder()
                  .setDefaultInstance(Version.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeleteVersionRequest, Operation>
      deleteVersionMethodDescriptor =
          ApiMethodDescriptor.<DeleteVersionRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteVersion")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteVersionRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/packages/*/versions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "force", request.getForce());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteVersionRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<BatchDeleteVersionsRequest, Operation>
      batchDeleteVersionsMethodDescriptor =
          ApiMethodDescriptor.<BatchDeleteVersionsRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/BatchDeleteVersions")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<BatchDeleteVersionsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*/packages/*}/versions:batchDelete",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<BatchDeleteVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<BatchDeleteVersionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearParent().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (BatchDeleteVersionsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateVersionRequest, Version>
      updateVersionMethodDescriptor =
          ApiMethodDescriptor.<UpdateVersionRequest, Version>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateVersion")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateVersionRequest>newBuilder()
                      .setPath(
                          "/v1/{version.name=projects/*/locations/*/repositories/*/packages/*/versions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "version.name", request.getVersion().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateVersionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("version", request.getVersion(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Version>newBuilder()
                      .setDefaultInstance(Version.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListFilesRequest, ListFilesResponse>
      listFilesMethodDescriptor =
          ApiMethodDescriptor.<ListFilesRequest, ListFilesResponse>newBuilder()
              .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/ListFiles")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListFilesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/files",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListFilesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListFilesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListFilesResponse>newBuilder()
                      .setDefaultInstance(ListFilesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetFileRequest, File> getFileMethodDescriptor =
      ApiMethodDescriptor.<GetFileRequest, File>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/GetFile")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetFileRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/files/**}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetFileRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetFileRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<File>newBuilder()
                  .setDefaultInstance(File.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeleteFileRequest, Operation>
      deleteFileMethodDescriptor =
          ApiMethodDescriptor.<DeleteFileRequest, Operation>newBuilder()
              .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteFile")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteFileRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/files/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteFileRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteFileRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteFileRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<UpdateFileRequest, File> updateFileMethodDescriptor =
      ApiMethodDescriptor.<UpdateFileRequest, File>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateFile")
          .setHttpMethod("PATCH")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<UpdateFileRequest>newBuilder()
                  .setPath(
                      "/v1/{file.name=projects/*/locations/*/repositories/*/files/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateFileRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "file.name", request.getFile().getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateFileRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request ->
                          ProtoRestSerializer.create().toBody("file", request.getFile(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<File>newBuilder()
                  .setDefaultInstance(File.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListTagsRequest, ListTagsResponse>
      listTagsMethodDescriptor =
          ApiMethodDescriptor.<ListTagsRequest, ListTagsResponse>newBuilder()
              .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/ListTags")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListTagsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*/packages/*}/tags",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListTagsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListTagsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListTagsResponse>newBuilder()
                      .setDefaultInstance(ListTagsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetTagRequest, Tag> getTagMethodDescriptor =
      ApiMethodDescriptor.<GetTagRequest, Tag>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/GetTag")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetTagRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Tag>newBuilder()
                  .setDefaultInstance(Tag.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<CreateTagRequest, Tag> createTagMethodDescriptor =
      ApiMethodDescriptor.<CreateTagRequest, Tag>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/CreateTag")
          .setHttpMethod("POST")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<CreateTagRequest>newBuilder()
                  .setPath(
                      "/v1/{parent=projects/*/locations/*/repositories/*/packages/*}/tags",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<CreateTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "parent", request.getParent());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<CreateTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "tagId", request.getTagId());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request -> ProtoRestSerializer.create().toBody("tag", request.getTag(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Tag>newBuilder()
                  .setDefaultInstance(Tag.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<UpdateTagRequest, Tag> updateTagMethodDescriptor =
      ApiMethodDescriptor.<UpdateTagRequest, Tag>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateTag")
          .setHttpMethod("PATCH")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<UpdateTagRequest>newBuilder()
                  .setPath(
                      "/v1/{tag.name=projects/*/locations/*/repositories/*/packages/*/tags/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "tag.name", request.getTag().getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request -> ProtoRestSerializer.create().toBody("tag", request.getTag(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Tag>newBuilder()
                  .setDefaultInstance(Tag.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeleteTagRequest, Empty> deleteTagMethodDescriptor =
      ApiMethodDescriptor.<DeleteTagRequest, Empty>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteTag")
          .setHttpMethod("DELETE")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<DeleteTagRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/packages/*/tags/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteTagRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Empty>newBuilder()
                  .setDefaultInstance(Empty.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<CreateRuleRequest, Rule> createRuleMethodDescriptor =
      ApiMethodDescriptor.<CreateRuleRequest, Rule>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/CreateRule")
          .setHttpMethod("POST")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<CreateRuleRequest>newBuilder()
                  .setPath(
                      "/v1/{parent=projects/*/locations/*/repositories/*}/rules",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<CreateRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "parent", request.getParent());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<CreateRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "ruleId", request.getRuleId());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request ->
                          ProtoRestSerializer.create().toBody("rule", request.getRule(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Rule>newBuilder()
                  .setDefaultInstance(Rule.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListRulesRequest, ListRulesResponse>
      listRulesMethodDescriptor =
          ApiMethodDescriptor.<ListRulesRequest, ListRulesResponse>newBuilder()
              .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/ListRules")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListRulesRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/rules",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListRulesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListRulesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListRulesResponse>newBuilder()
                      .setDefaultInstance(ListRulesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetRuleRequest, Rule> getRuleMethodDescriptor =
      ApiMethodDescriptor.<GetRuleRequest, Rule>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/GetRule")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetRuleRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/rules/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Rule>newBuilder()
                  .setDefaultInstance(Rule.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<UpdateRuleRequest, Rule> updateRuleMethodDescriptor =
      ApiMethodDescriptor.<UpdateRuleRequest, Rule>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateRule")
          .setHttpMethod("PATCH")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<UpdateRuleRequest>newBuilder()
                  .setPath(
                      "/v1/{rule.name=projects/*/locations/*/repositories/*/rules/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "rule.name", request.getRule().getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<UpdateRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request ->
                          ProtoRestSerializer.create().toBody("rule", request.getRule(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Rule>newBuilder()
                  .setDefaultInstance(Rule.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<DeleteRuleRequest, Empty> deleteRuleMethodDescriptor =
      ApiMethodDescriptor.<DeleteRuleRequest, Empty>newBuilder()
          .setFullMethodName("google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteRule")
          .setHttpMethod("DELETE")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<DeleteRuleRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/repositories/*/rules/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<DeleteRuleRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Empty>newBuilder()
                  .setDefaultInstance(Empty.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<SetIamPolicyRequest, Policy>
      setIamPolicyMethodDescriptor =
          ApiMethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/SetIamPolicy")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetIamPolicyRequest>newBuilder()
                      .setPath(
                          "/v1/{resource=projects/*/locations/*/repositories/*}:setIamPolicy",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "resource", request.getResource());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearResource().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Policy>newBuilder()
                      .setDefaultInstance(Policy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetIamPolicyRequest, Policy>
      getIamPolicyMethodDescriptor =
          ApiMethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetIamPolicy")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetIamPolicyRequest>newBuilder()
                      .setPath(
                          "/v1/{resource=projects/*/locations/*/repositories/*}:getIamPolicy",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "resource", request.getResource());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetIamPolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "options", request.getOptions());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Policy>newBuilder()
                      .setDefaultInstance(Policy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          ApiMethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/TestIamPermissions")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<TestIamPermissionsRequest>newBuilder()
                      .setPath(
                          "/v1/{resource=projects/*/locations/*/repositories/*}:testIamPermissions",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<TestIamPermissionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "resource", request.getResource());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<TestIamPermissionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearResource().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<TestIamPermissionsResponse>newBuilder()
                      .setDefaultInstance(TestIamPermissionsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetProjectSettingsRequest, ProjectSettings>
      getProjectSettingsMethodDescriptor =
          ApiMethodDescriptor.<GetProjectSettingsRequest, ProjectSettings>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetProjectSettings")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetProjectSettingsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/projectSettings}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetProjectSettingsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetProjectSettingsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProjectSettings>newBuilder()
                      .setDefaultInstance(ProjectSettings.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateProjectSettingsRequest, ProjectSettings>
      updateProjectSettingsMethodDescriptor =
          ApiMethodDescriptor.<UpdateProjectSettingsRequest, ProjectSettings>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateProjectSettings")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateProjectSettingsRequest>newBuilder()
                      .setPath(
                          "/v1/{projectSettings.name=projects/*/projectSettings}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateProjectSettingsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "projectSettings.name",
                                request.getProjectSettings().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateProjectSettingsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("projectSettings", request.getProjectSettings(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ProjectSettings>newBuilder()
                      .setDefaultInstance(ProjectSettings.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetVPCSCConfigRequest, VPCSCConfig>
      getVPCSCConfigMethodDescriptor =
          ApiMethodDescriptor.<GetVPCSCConfigRequest, VPCSCConfig>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetVPCSCConfig")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetVPCSCConfigRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/vpcscConfig}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetVPCSCConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetVPCSCConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<VPCSCConfig>newBuilder()
                      .setDefaultInstance(VPCSCConfig.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateVPCSCConfigRequest, VPCSCConfig>
      updateVPCSCConfigMethodDescriptor =
          ApiMethodDescriptor.<UpdateVPCSCConfigRequest, VPCSCConfig>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/UpdateVPCSCConfig")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateVPCSCConfigRequest>newBuilder()
                      .setPath(
                          "/v1/{vpcscConfig.name=projects/*/locations/*/vpcscConfig}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateVPCSCConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "vpcscConfig.name", request.getVpcscConfig().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateVPCSCConfigRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("vpcscConfig", request.getVpcscConfig(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<VPCSCConfig>newBuilder()
                      .setDefaultInstance(VPCSCConfig.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdatePackageRequest, Package>
      updatePackageMethodDescriptor =
          ApiMethodDescriptor.<UpdatePackageRequest, Package>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/UpdatePackage")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdatePackageRequest>newBuilder()
                      .setPath(
                          "/v1/{package.name=projects/*/locations/*/repositories/*/packages/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdatePackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "package.name", request.getPackage().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdatePackageRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("package_", request.getPackage(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Package>newBuilder()
                      .setDefaultInstance(Package.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListAttachmentsRequest, ListAttachmentsResponse>
      listAttachmentsMethodDescriptor =
          ApiMethodDescriptor.<ListAttachmentsRequest, ListAttachmentsResponse>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/ListAttachments")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListAttachmentsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/attachments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListAttachmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListAttachmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListAttachmentsResponse>newBuilder()
                      .setDefaultInstance(ListAttachmentsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetAttachmentRequest, Attachment>
      getAttachmentMethodDescriptor =
          ApiMethodDescriptor.<GetAttachmentRequest, Attachment>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/GetAttachment")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetAttachmentRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/attachments/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Attachment>newBuilder()
                      .setDefaultInstance(Attachment.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateAttachmentRequest, Operation>
      createAttachmentMethodDescriptor =
          ApiMethodDescriptor.<CreateAttachmentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/CreateAttachment")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateAttachmentRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*/repositories/*}/attachments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "attachmentId", request.getAttachmentId());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("attachment", request.getAttachment(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateAttachmentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteAttachmentRequest, Operation>
      deleteAttachmentMethodDescriptor =
          ApiMethodDescriptor.<DeleteAttachmentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.devtools.artifactregistry.v1.ArtifactRegistry/DeleteAttachment")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteAttachmentRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/repositories/*/attachments/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteAttachmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteAttachmentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          ApiMethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListLocationsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*}/locations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListLocationsResponse>newBuilder()
                      .setDefaultInstance(ListLocationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetLocationRequest, Location>
      getLocationMethodDescriptor =
          ApiMethodDescriptor.<GetLocationRequest, Location>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/GetLocation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetLocationRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Location>newBuilder()
                      .setDefaultInstance(Location.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<ListDockerImagesRequest, ListDockerImagesResponse>
      listDockerImagesCallable;
  private final UnaryCallable<ListDockerImagesRequest, ListDockerImagesPagedResponse>
      listDockerImagesPagedCallable;
  private final UnaryCallable<GetDockerImageRequest, DockerImage> getDockerImageCallable;
  private final UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsResponse>
      listMavenArtifactsCallable;
  private final UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsPagedResponse>
      listMavenArtifactsPagedCallable;
  private final UnaryCallable<GetMavenArtifactRequest, MavenArtifact> getMavenArtifactCallable;
  private final UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesResponse>
      listNpmPackagesCallable;
  private final UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesPagedResponse>
      listNpmPackagesPagedCallable;
  private final UnaryCallable<GetNpmPackageRequest, NpmPackage> getNpmPackageCallable;
  private final UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesResponse>
      listPythonPackagesCallable;
  private final UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesPagedResponse>
      listPythonPackagesPagedCallable;
  private final UnaryCallable<GetPythonPackageRequest, PythonPackage> getPythonPackageCallable;
  private final UnaryCallable<ImportAptArtifactsRequest, Operation> importAptArtifactsCallable;
  private final OperationCallable<
          ImportAptArtifactsRequest, ImportAptArtifactsResponse, ImportAptArtifactsMetadata>
      importAptArtifactsOperationCallable;
  private final UnaryCallable<ImportYumArtifactsRequest, Operation> importYumArtifactsCallable;
  private final OperationCallable<
          ImportYumArtifactsRequest, ImportYumArtifactsResponse, ImportYumArtifactsMetadata>
      importYumArtifactsOperationCallable;
  private final UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesCallable;
  private final UnaryCallable<ListRepositoriesRequest, ListRepositoriesPagedResponse>
      listRepositoriesPagedCallable;
  private final UnaryCallable<GetRepositoryRequest, Repository> getRepositoryCallable;
  private final UnaryCallable<CreateRepositoryRequest, Operation> createRepositoryCallable;
  private final OperationCallable<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationCallable;
  private final UnaryCallable<UpdateRepositoryRequest, Repository> updateRepositoryCallable;
  private final UnaryCallable<DeleteRepositoryRequest, Operation> deleteRepositoryCallable;
  private final OperationCallable<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationCallable;
  private final UnaryCallable<ListPackagesRequest, ListPackagesResponse> listPackagesCallable;
  private final UnaryCallable<ListPackagesRequest, ListPackagesPagedResponse>
      listPackagesPagedCallable;
  private final UnaryCallable<GetPackageRequest, Package> getPackageCallable;
  private final UnaryCallable<DeletePackageRequest, Operation> deletePackageCallable;
  private final OperationCallable<DeletePackageRequest, Empty, OperationMetadata>
      deletePackageOperationCallable;
  private final UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable;
  private final UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse>
      listVersionsPagedCallable;
  private final UnaryCallable<GetVersionRequest, Version> getVersionCallable;
  private final UnaryCallable<DeleteVersionRequest, Operation> deleteVersionCallable;
  private final OperationCallable<DeleteVersionRequest, Empty, OperationMetadata>
      deleteVersionOperationCallable;
  private final UnaryCallable<BatchDeleteVersionsRequest, Operation> batchDeleteVersionsCallable;
  private final OperationCallable<BatchDeleteVersionsRequest, Empty, BatchDeleteVersionsMetadata>
      batchDeleteVersionsOperationCallable;
  private final UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable;
  private final UnaryCallable<ListFilesRequest, ListFilesResponse> listFilesCallable;
  private final UnaryCallable<ListFilesRequest, ListFilesPagedResponse> listFilesPagedCallable;
  private final UnaryCallable<GetFileRequest, File> getFileCallable;
  private final UnaryCallable<DeleteFileRequest, Operation> deleteFileCallable;
  private final OperationCallable<DeleteFileRequest, Empty, OperationMetadata>
      deleteFileOperationCallable;
  private final UnaryCallable<UpdateFileRequest, File> updateFileCallable;
  private final UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable;
  private final UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable;
  private final UnaryCallable<GetTagRequest, Tag> getTagCallable;
  private final UnaryCallable<CreateTagRequest, Tag> createTagCallable;
  private final UnaryCallable<UpdateTagRequest, Tag> updateTagCallable;
  private final UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable;
  private final UnaryCallable<CreateRuleRequest, Rule> createRuleCallable;
  private final UnaryCallable<ListRulesRequest, ListRulesResponse> listRulesCallable;
  private final UnaryCallable<ListRulesRequest, ListRulesPagedResponse> listRulesPagedCallable;
  private final UnaryCallable<GetRuleRequest, Rule> getRuleCallable;
  private final UnaryCallable<UpdateRuleRequest, Rule> updateRuleCallable;
  private final UnaryCallable<DeleteRuleRequest, Empty> deleteRuleCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;
  private final UnaryCallable<GetProjectSettingsRequest, ProjectSettings>
      getProjectSettingsCallable;
  private final UnaryCallable<UpdateProjectSettingsRequest, ProjectSettings>
      updateProjectSettingsCallable;
  private final UnaryCallable<GetVPCSCConfigRequest, VPCSCConfig> getVPCSCConfigCallable;
  private final UnaryCallable<UpdateVPCSCConfigRequest, VPCSCConfig> updateVPCSCConfigCallable;
  private final UnaryCallable<UpdatePackageRequest, Package> updatePackageCallable;
  private final UnaryCallable<ListAttachmentsRequest, ListAttachmentsResponse>
      listAttachmentsCallable;
  private final UnaryCallable<ListAttachmentsRequest, ListAttachmentsPagedResponse>
      listAttachmentsPagedCallable;
  private final UnaryCallable<GetAttachmentRequest, Attachment> getAttachmentCallable;
  private final UnaryCallable<CreateAttachmentRequest, Operation> createAttachmentCallable;
  private final OperationCallable<CreateAttachmentRequest, Attachment, OperationMetadata>
      createAttachmentOperationCallable;
  private final UnaryCallable<DeleteAttachmentRequest, Operation> deleteAttachmentCallable;
  private final OperationCallable<DeleteAttachmentRequest, Empty, OperationMetadata>
      deleteAttachmentOperationCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonArtifactRegistryStub create(ArtifactRegistryStubSettings settings)
      throws IOException {
    return new HttpJsonArtifactRegistryStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonArtifactRegistryStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonArtifactRegistryStub(
        ArtifactRegistryStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonArtifactRegistryStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonArtifactRegistryStub(
        ArtifactRegistryStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonArtifactRegistryStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonArtifactRegistryStub(
      ArtifactRegistryStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonArtifactRegistryCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonArtifactRegistryStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonArtifactRegistryStub(
      ArtifactRegistryStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(
            clientContext,
            callableFactory,
            typeRegistry,
            ImmutableMap.<String, HttpRule>builder()
                .put(
                    "google.longrunning.Operations.GetOperation",
                    HttpRule.newBuilder()
                        .setGet("/v1/{name=projects/*/locations/*/operations/*}")
                        .build())
                .build());

    HttpJsonCallSettings<ListDockerImagesRequest, ListDockerImagesResponse>
        listDockerImagesTransportSettings =
            HttpJsonCallSettings.<ListDockerImagesRequest, ListDockerImagesResponse>newBuilder()
                .setMethodDescriptor(listDockerImagesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetDockerImageRequest, DockerImage> getDockerImageTransportSettings =
        HttpJsonCallSettings.<GetDockerImageRequest, DockerImage>newBuilder()
            .setMethodDescriptor(getDockerImageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListMavenArtifactsRequest, ListMavenArtifactsResponse>
        listMavenArtifactsTransportSettings =
            HttpJsonCallSettings.<ListMavenArtifactsRequest, ListMavenArtifactsResponse>newBuilder()
                .setMethodDescriptor(listMavenArtifactsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetMavenArtifactRequest, MavenArtifact> getMavenArtifactTransportSettings =
        HttpJsonCallSettings.<GetMavenArtifactRequest, MavenArtifact>newBuilder()
            .setMethodDescriptor(getMavenArtifactMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListNpmPackagesRequest, ListNpmPackagesResponse>
        listNpmPackagesTransportSettings =
            HttpJsonCallSettings.<ListNpmPackagesRequest, ListNpmPackagesResponse>newBuilder()
                .setMethodDescriptor(listNpmPackagesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetNpmPackageRequest, NpmPackage> getNpmPackageTransportSettings =
        HttpJsonCallSettings.<GetNpmPackageRequest, NpmPackage>newBuilder()
            .setMethodDescriptor(getNpmPackageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListPythonPackagesRequest, ListPythonPackagesResponse>
        listPythonPackagesTransportSettings =
            HttpJsonCallSettings.<ListPythonPackagesRequest, ListPythonPackagesResponse>newBuilder()
                .setMethodDescriptor(listPythonPackagesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetPythonPackageRequest, PythonPackage> getPythonPackageTransportSettings =
        HttpJsonCallSettings.<GetPythonPackageRequest, PythonPackage>newBuilder()
            .setMethodDescriptor(getPythonPackageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ImportAptArtifactsRequest, Operation> importAptArtifactsTransportSettings =
        HttpJsonCallSettings.<ImportAptArtifactsRequest, Operation>newBuilder()
            .setMethodDescriptor(importAptArtifactsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ImportYumArtifactsRequest, Operation> importYumArtifactsTransportSettings =
        HttpJsonCallSettings.<ImportYumArtifactsRequest, Operation>newBuilder()
            .setMethodDescriptor(importYumArtifactsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListRepositoriesRequest, ListRepositoriesResponse>
        listRepositoriesTransportSettings =
            HttpJsonCallSettings.<ListRepositoriesRequest, ListRepositoriesResponse>newBuilder()
                .setMethodDescriptor(listRepositoriesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetRepositoryRequest, Repository> getRepositoryTransportSettings =
        HttpJsonCallSettings.<GetRepositoryRequest, Repository>newBuilder()
            .setMethodDescriptor(getRepositoryMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateRepositoryRequest, Operation> createRepositoryTransportSettings =
        HttpJsonCallSettings.<CreateRepositoryRequest, Operation>newBuilder()
            .setMethodDescriptor(createRepositoryMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateRepositoryRequest, Repository> updateRepositoryTransportSettings =
        HttpJsonCallSettings.<UpdateRepositoryRequest, Repository>newBuilder()
            .setMethodDescriptor(updateRepositoryMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("repository.name", String.valueOf(request.getRepository().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteRepositoryRequest, Operation> deleteRepositoryTransportSettings =
        HttpJsonCallSettings.<DeleteRepositoryRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteRepositoryMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListPackagesRequest, ListPackagesResponse> listPackagesTransportSettings =
        HttpJsonCallSettings.<ListPackagesRequest, ListPackagesResponse>newBuilder()
            .setMethodDescriptor(listPackagesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetPackageRequest, Package> getPackageTransportSettings =
        HttpJsonCallSettings.<GetPackageRequest, Package>newBuilder()
            .setMethodDescriptor(getPackageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeletePackageRequest, Operation> deletePackageTransportSettings =
        HttpJsonCallSettings.<DeletePackageRequest, Operation>newBuilder()
            .setMethodDescriptor(deletePackageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListVersionsRequest, ListVersionsResponse> listVersionsTransportSettings =
        HttpJsonCallSettings.<ListVersionsRequest, ListVersionsResponse>newBuilder()
            .setMethodDescriptor(listVersionsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetVersionRequest, Version> getVersionTransportSettings =
        HttpJsonCallSettings.<GetVersionRequest, Version>newBuilder()
            .setMethodDescriptor(getVersionMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteVersionRequest, Operation> deleteVersionTransportSettings =
        HttpJsonCallSettings.<DeleteVersionRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteVersionMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<BatchDeleteVersionsRequest, Operation>
        batchDeleteVersionsTransportSettings =
            HttpJsonCallSettings.<BatchDeleteVersionsRequest, Operation>newBuilder()
                .setMethodDescriptor(batchDeleteVersionsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<UpdateVersionRequest, Version> updateVersionTransportSettings =
        HttpJsonCallSettings.<UpdateVersionRequest, Version>newBuilder()
            .setMethodDescriptor(updateVersionMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("version.name", String.valueOf(request.getVersion().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListFilesRequest, ListFilesResponse> listFilesTransportSettings =
        HttpJsonCallSettings.<ListFilesRequest, ListFilesResponse>newBuilder()
            .setMethodDescriptor(listFilesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetFileRequest, File> getFileTransportSettings =
        HttpJsonCallSettings.<GetFileRequest, File>newBuilder()
            .setMethodDescriptor(getFileMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteFileRequest, Operation> deleteFileTransportSettings =
        HttpJsonCallSettings.<DeleteFileRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteFileMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateFileRequest, File> updateFileTransportSettings =
        HttpJsonCallSettings.<UpdateFileRequest, File>newBuilder()
            .setMethodDescriptor(updateFileMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("file.name", String.valueOf(request.getFile().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListTagsRequest, ListTagsResponse> listTagsTransportSettings =
        HttpJsonCallSettings.<ListTagsRequest, ListTagsResponse>newBuilder()
            .setMethodDescriptor(listTagsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetTagRequest, Tag> getTagTransportSettings =
        HttpJsonCallSettings.<GetTagRequest, Tag>newBuilder()
            .setMethodDescriptor(getTagMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateTagRequest, Tag> createTagTransportSettings =
        HttpJsonCallSettings.<CreateTagRequest, Tag>newBuilder()
            .setMethodDescriptor(createTagMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateTagRequest, Tag> updateTagTransportSettings =
        HttpJsonCallSettings.<UpdateTagRequest, Tag>newBuilder()
            .setMethodDescriptor(updateTagMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("tag.name", String.valueOf(request.getTag().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteTagRequest, Empty> deleteTagTransportSettings =
        HttpJsonCallSettings.<DeleteTagRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteTagMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateRuleRequest, Rule> createRuleTransportSettings =
        HttpJsonCallSettings.<CreateRuleRequest, Rule>newBuilder()
            .setMethodDescriptor(createRuleMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListRulesRequest, ListRulesResponse> listRulesTransportSettings =
        HttpJsonCallSettings.<ListRulesRequest, ListRulesResponse>newBuilder()
            .setMethodDescriptor(listRulesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetRuleRequest, Rule> getRuleTransportSettings =
        HttpJsonCallSettings.<GetRuleRequest, Rule>newBuilder()
            .setMethodDescriptor(getRuleMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateRuleRequest, Rule> updateRuleTransportSettings =
        HttpJsonCallSettings.<UpdateRuleRequest, Rule>newBuilder()
            .setMethodDescriptor(updateRuleMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("rule.name", String.valueOf(request.getRule().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteRuleRequest, Empty> deleteRuleTransportSettings =
        HttpJsonCallSettings.<DeleteRuleRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteRuleMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        HttpJsonCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        HttpJsonCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            HttpJsonCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource", String.valueOf(request.getResource()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetProjectSettingsRequest, ProjectSettings>
        getProjectSettingsTransportSettings =
            HttpJsonCallSettings.<GetProjectSettingsRequest, ProjectSettings>newBuilder()
                .setMethodDescriptor(getProjectSettingsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<UpdateProjectSettingsRequest, ProjectSettings>
        updateProjectSettingsTransportSettings =
            HttpJsonCallSettings.<UpdateProjectSettingsRequest, ProjectSettings>newBuilder()
                .setMethodDescriptor(updateProjectSettingsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "project_settings.name",
                          String.valueOf(request.getProjectSettings().getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetVPCSCConfigRequest, VPCSCConfig> getVPCSCConfigTransportSettings =
        HttpJsonCallSettings.<GetVPCSCConfigRequest, VPCSCConfig>newBuilder()
            .setMethodDescriptor(getVPCSCConfigMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateVPCSCConfigRequest, VPCSCConfig> updateVPCSCConfigTransportSettings =
        HttpJsonCallSettings.<UpdateVPCSCConfigRequest, VPCSCConfig>newBuilder()
            .setMethodDescriptor(updateVPCSCConfigMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "vpcsc_config.name", String.valueOf(request.getVpcscConfig().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdatePackageRequest, Package> updatePackageTransportSettings =
        HttpJsonCallSettings.<UpdatePackageRequest, Package>newBuilder()
            .setMethodDescriptor(updatePackageMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("package.name", String.valueOf(request.getPackage().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListAttachmentsRequest, ListAttachmentsResponse>
        listAttachmentsTransportSettings =
            HttpJsonCallSettings.<ListAttachmentsRequest, ListAttachmentsResponse>newBuilder()
                .setMethodDescriptor(listAttachmentsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetAttachmentRequest, Attachment> getAttachmentTransportSettings =
        HttpJsonCallSettings.<GetAttachmentRequest, Attachment>newBuilder()
            .setMethodDescriptor(getAttachmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateAttachmentRequest, Operation> createAttachmentTransportSettings =
        HttpJsonCallSettings.<CreateAttachmentRequest, Operation>newBuilder()
            .setMethodDescriptor(createAttachmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteAttachmentRequest, Operation> deleteAttachmentTransportSettings =
        HttpJsonCallSettings.<DeleteAttachmentRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteAttachmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListLocationsRequest, ListLocationsResponse>
        listLocationsTransportSettings =
            HttpJsonCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
                .setMethodDescriptor(listLocationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        HttpJsonCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.listDockerImagesCallable =
        callableFactory.createUnaryCallable(
            listDockerImagesTransportSettings, settings.listDockerImagesSettings(), clientContext);
    this.listDockerImagesPagedCallable =
        callableFactory.createPagedCallable(
            listDockerImagesTransportSettings, settings.listDockerImagesSettings(), clientContext);
    this.getDockerImageCallable =
        callableFactory.createUnaryCallable(
            getDockerImageTransportSettings, settings.getDockerImageSettings(), clientContext);
    this.listMavenArtifactsCallable =
        callableFactory.createUnaryCallable(
            listMavenArtifactsTransportSettings,
            settings.listMavenArtifactsSettings(),
            clientContext);
    this.listMavenArtifactsPagedCallable =
        callableFactory.createPagedCallable(
            listMavenArtifactsTransportSettings,
            settings.listMavenArtifactsSettings(),
            clientContext);
    this.getMavenArtifactCallable =
        callableFactory.createUnaryCallable(
            getMavenArtifactTransportSettings, settings.getMavenArtifactSettings(), clientContext);
    this.listNpmPackagesCallable =
        callableFactory.createUnaryCallable(
            listNpmPackagesTransportSettings, settings.listNpmPackagesSettings(), clientContext);
    this.listNpmPackagesPagedCallable =
        callableFactory.createPagedCallable(
            listNpmPackagesTransportSettings, settings.listNpmPackagesSettings(), clientContext);
    this.getNpmPackageCallable =
        callableFactory.createUnaryCallable(
            getNpmPackageTransportSettings, settings.getNpmPackageSettings(), clientContext);
    this.listPythonPackagesCallable =
        callableFactory.createUnaryCallable(
            listPythonPackagesTransportSettings,
            settings.listPythonPackagesSettings(),
            clientContext);
    this.listPythonPackagesPagedCallable =
        callableFactory.createPagedCallable(
            listPythonPackagesTransportSettings,
            settings.listPythonPackagesSettings(),
            clientContext);
    this.getPythonPackageCallable =
        callableFactory.createUnaryCallable(
            getPythonPackageTransportSettings, settings.getPythonPackageSettings(), clientContext);
    this.importAptArtifactsCallable =
        callableFactory.createUnaryCallable(
            importAptArtifactsTransportSettings,
            settings.importAptArtifactsSettings(),
            clientContext);
    this.importAptArtifactsOperationCallable =
        callableFactory.createOperationCallable(
            importAptArtifactsTransportSettings,
            settings.importAptArtifactsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.importYumArtifactsCallable =
        callableFactory.createUnaryCallable(
            importYumArtifactsTransportSettings,
            settings.importYumArtifactsSettings(),
            clientContext);
    this.importYumArtifactsOperationCallable =
        callableFactory.createOperationCallable(
            importYumArtifactsTransportSettings,
            settings.importYumArtifactsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listRepositoriesCallable =
        callableFactory.createUnaryCallable(
            listRepositoriesTransportSettings, settings.listRepositoriesSettings(), clientContext);
    this.listRepositoriesPagedCallable =
        callableFactory.createPagedCallable(
            listRepositoriesTransportSettings, settings.listRepositoriesSettings(), clientContext);
    this.getRepositoryCallable =
        callableFactory.createUnaryCallable(
            getRepositoryTransportSettings, settings.getRepositorySettings(), clientContext);
    this.createRepositoryCallable =
        callableFactory.createUnaryCallable(
            createRepositoryTransportSettings, settings.createRepositorySettings(), clientContext);
    this.createRepositoryOperationCallable =
        callableFactory.createOperationCallable(
            createRepositoryTransportSettings,
            settings.createRepositoryOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateRepositoryCallable =
        callableFactory.createUnaryCallable(
            updateRepositoryTransportSettings, settings.updateRepositorySettings(), clientContext);
    this.deleteRepositoryCallable =
        callableFactory.createUnaryCallable(
            deleteRepositoryTransportSettings, settings.deleteRepositorySettings(), clientContext);
    this.deleteRepositoryOperationCallable =
        callableFactory.createOperationCallable(
            deleteRepositoryTransportSettings,
            settings.deleteRepositoryOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listPackagesCallable =
        callableFactory.createUnaryCallable(
            listPackagesTransportSettings, settings.listPackagesSettings(), clientContext);
    this.listPackagesPagedCallable =
        callableFactory.createPagedCallable(
            listPackagesTransportSettings, settings.listPackagesSettings(), clientContext);
    this.getPackageCallable =
        callableFactory.createUnaryCallable(
            getPackageTransportSettings, settings.getPackageSettings(), clientContext);
    this.deletePackageCallable =
        callableFactory.createUnaryCallable(
            deletePackageTransportSettings, settings.deletePackageSettings(), clientContext);
    this.deletePackageOperationCallable =
        callableFactory.createOperationCallable(
            deletePackageTransportSettings,
            settings.deletePackageOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listVersionsCallable =
        callableFactory.createUnaryCallable(
            listVersionsTransportSettings, settings.listVersionsSettings(), clientContext);
    this.listVersionsPagedCallable =
        callableFactory.createPagedCallable(
            listVersionsTransportSettings, settings.listVersionsSettings(), clientContext);
    this.getVersionCallable =
        callableFactory.createUnaryCallable(
            getVersionTransportSettings, settings.getVersionSettings(), clientContext);
    this.deleteVersionCallable =
        callableFactory.createUnaryCallable(
            deleteVersionTransportSettings, settings.deleteVersionSettings(), clientContext);
    this.deleteVersionOperationCallable =
        callableFactory.createOperationCallable(
            deleteVersionTransportSettings,
            settings.deleteVersionOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.batchDeleteVersionsCallable =
        callableFactory.createUnaryCallable(
            batchDeleteVersionsTransportSettings,
            settings.batchDeleteVersionsSettings(),
            clientContext);
    this.batchDeleteVersionsOperationCallable =
        callableFactory.createOperationCallable(
            batchDeleteVersionsTransportSettings,
            settings.batchDeleteVersionsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateVersionCallable =
        callableFactory.createUnaryCallable(
            updateVersionTransportSettings, settings.updateVersionSettings(), clientContext);
    this.listFilesCallable =
        callableFactory.createUnaryCallable(
            listFilesTransportSettings, settings.listFilesSettings(), clientContext);
    this.listFilesPagedCallable =
        callableFactory.createPagedCallable(
            listFilesTransportSettings, settings.listFilesSettings(), clientContext);
    this.getFileCallable =
        callableFactory.createUnaryCallable(
            getFileTransportSettings, settings.getFileSettings(), clientContext);
    this.deleteFileCallable =
        callableFactory.createUnaryCallable(
            deleteFileTransportSettings, settings.deleteFileSettings(), clientContext);
    this.deleteFileOperationCallable =
        callableFactory.createOperationCallable(
            deleteFileTransportSettings,
            settings.deleteFileOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.updateFileCallable =
        callableFactory.createUnaryCallable(
            updateFileTransportSettings, settings.updateFileSettings(), clientContext);
    this.listTagsCallable =
        callableFactory.createUnaryCallable(
            listTagsTransportSettings, settings.listTagsSettings(), clientContext);
    this.listTagsPagedCallable =
        callableFactory.createPagedCallable(
            listTagsTransportSettings, settings.listTagsSettings(), clientContext);
    this.getTagCallable =
        callableFactory.createUnaryCallable(
            getTagTransportSettings, settings.getTagSettings(), clientContext);
    this.createTagCallable =
        callableFactory.createUnaryCallable(
            createTagTransportSettings, settings.createTagSettings(), clientContext);
    this.updateTagCallable =
        callableFactory.createUnaryCallable(
            updateTagTransportSettings, settings.updateTagSettings(), clientContext);
    this.deleteTagCallable =
        callableFactory.createUnaryCallable(
            deleteTagTransportSettings, settings.deleteTagSettings(), clientContext);
    this.createRuleCallable =
        callableFactory.createUnaryCallable(
            createRuleTransportSettings, settings.createRuleSettings(), clientContext);
    this.listRulesCallable =
        callableFactory.createUnaryCallable(
            listRulesTransportSettings, settings.listRulesSettings(), clientContext);
    this.listRulesPagedCallable =
        callableFactory.createPagedCallable(
            listRulesTransportSettings, settings.listRulesSettings(), clientContext);
    this.getRuleCallable =
        callableFactory.createUnaryCallable(
            getRuleTransportSettings, settings.getRuleSettings(), clientContext);
    this.updateRuleCallable =
        callableFactory.createUnaryCallable(
            updateRuleTransportSettings, settings.updateRuleSettings(), clientContext);
    this.deleteRuleCallable =
        callableFactory.createUnaryCallable(
            deleteRuleTransportSettings, settings.deleteRuleSettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);
    this.getProjectSettingsCallable =
        callableFactory.createUnaryCallable(
            getProjectSettingsTransportSettings,
            settings.getProjectSettingsSettings(),
            clientContext);
    this.updateProjectSettingsCallable =
        callableFactory.createUnaryCallable(
            updateProjectSettingsTransportSettings,
            settings.updateProjectSettingsSettings(),
            clientContext);
    this.getVPCSCConfigCallable =
        callableFactory.createUnaryCallable(
            getVPCSCConfigTransportSettings, settings.getVPCSCConfigSettings(), clientContext);
    this.updateVPCSCConfigCallable =
        callableFactory.createUnaryCallable(
            updateVPCSCConfigTransportSettings,
            settings.updateVPCSCConfigSettings(),
            clientContext);
    this.updatePackageCallable =
        callableFactory.createUnaryCallable(
            updatePackageTransportSettings, settings.updatePackageSettings(), clientContext);
    this.listAttachmentsCallable =
        callableFactory.createUnaryCallable(
            listAttachmentsTransportSettings, settings.listAttachmentsSettings(), clientContext);
    this.listAttachmentsPagedCallable =
        callableFactory.createPagedCallable(
            listAttachmentsTransportSettings, settings.listAttachmentsSettings(), clientContext);
    this.getAttachmentCallable =
        callableFactory.createUnaryCallable(
            getAttachmentTransportSettings, settings.getAttachmentSettings(), clientContext);
    this.createAttachmentCallable =
        callableFactory.createUnaryCallable(
            createAttachmentTransportSettings, settings.createAttachmentSettings(), clientContext);
    this.createAttachmentOperationCallable =
        callableFactory.createOperationCallable(
            createAttachmentTransportSettings,
            settings.createAttachmentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteAttachmentCallable =
        callableFactory.createUnaryCallable(
            deleteAttachmentTransportSettings, settings.deleteAttachmentSettings(), clientContext);
    this.deleteAttachmentOperationCallable =
        callableFactory.createOperationCallable(
            deleteAttachmentTransportSettings,
            settings.deleteAttachmentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listDockerImagesMethodDescriptor);
    methodDescriptors.add(getDockerImageMethodDescriptor);
    methodDescriptors.add(listMavenArtifactsMethodDescriptor);
    methodDescriptors.add(getMavenArtifactMethodDescriptor);
    methodDescriptors.add(listNpmPackagesMethodDescriptor);
    methodDescriptors.add(getNpmPackageMethodDescriptor);
    methodDescriptors.add(listPythonPackagesMethodDescriptor);
    methodDescriptors.add(getPythonPackageMethodDescriptor);
    methodDescriptors.add(importAptArtifactsMethodDescriptor);
    methodDescriptors.add(importYumArtifactsMethodDescriptor);
    methodDescriptors.add(listRepositoriesMethodDescriptor);
    methodDescriptors.add(getRepositoryMethodDescriptor);
    methodDescriptors.add(createRepositoryMethodDescriptor);
    methodDescriptors.add(updateRepositoryMethodDescriptor);
    methodDescriptors.add(deleteRepositoryMethodDescriptor);
    methodDescriptors.add(listPackagesMethodDescriptor);
    methodDescriptors.add(getPackageMethodDescriptor);
    methodDescriptors.add(deletePackageMethodDescriptor);
    methodDescriptors.add(listVersionsMethodDescriptor);
    methodDescriptors.add(getVersionMethodDescriptor);
    methodDescriptors.add(deleteVersionMethodDescriptor);
    methodDescriptors.add(batchDeleteVersionsMethodDescriptor);
    methodDescriptors.add(updateVersionMethodDescriptor);
    methodDescriptors.add(listFilesMethodDescriptor);
    methodDescriptors.add(getFileMethodDescriptor);
    methodDescriptors.add(deleteFileMethodDescriptor);
    methodDescriptors.add(updateFileMethodDescriptor);
    methodDescriptors.add(listTagsMethodDescriptor);
    methodDescriptors.add(getTagMethodDescriptor);
    methodDescriptors.add(createTagMethodDescriptor);
    methodDescriptors.add(updateTagMethodDescriptor);
    methodDescriptors.add(deleteTagMethodDescriptor);
    methodDescriptors.add(createRuleMethodDescriptor);
    methodDescriptors.add(listRulesMethodDescriptor);
    methodDescriptors.add(getRuleMethodDescriptor);
    methodDescriptors.add(updateRuleMethodDescriptor);
    methodDescriptors.add(deleteRuleMethodDescriptor);
    methodDescriptors.add(setIamPolicyMethodDescriptor);
    methodDescriptors.add(getIamPolicyMethodDescriptor);
    methodDescriptors.add(testIamPermissionsMethodDescriptor);
    methodDescriptors.add(getProjectSettingsMethodDescriptor);
    methodDescriptors.add(updateProjectSettingsMethodDescriptor);
    methodDescriptors.add(getVPCSCConfigMethodDescriptor);
    methodDescriptors.add(updateVPCSCConfigMethodDescriptor);
    methodDescriptors.add(updatePackageMethodDescriptor);
    methodDescriptors.add(listAttachmentsMethodDescriptor);
    methodDescriptors.add(getAttachmentMethodDescriptor);
    methodDescriptors.add(createAttachmentMethodDescriptor);
    methodDescriptors.add(deleteAttachmentMethodDescriptor);
    methodDescriptors.add(listLocationsMethodDescriptor);
    methodDescriptors.add(getLocationMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<ListDockerImagesRequest, ListDockerImagesResponse>
      listDockerImagesCallable() {
    return listDockerImagesCallable;
  }

  @Override
  public UnaryCallable<ListDockerImagesRequest, ListDockerImagesPagedResponse>
      listDockerImagesPagedCallable() {
    return listDockerImagesPagedCallable;
  }

  @Override
  public UnaryCallable<GetDockerImageRequest, DockerImage> getDockerImageCallable() {
    return getDockerImageCallable;
  }

  @Override
  public UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsResponse>
      listMavenArtifactsCallable() {
    return listMavenArtifactsCallable;
  }

  @Override
  public UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsPagedResponse>
      listMavenArtifactsPagedCallable() {
    return listMavenArtifactsPagedCallable;
  }

  @Override
  public UnaryCallable<GetMavenArtifactRequest, MavenArtifact> getMavenArtifactCallable() {
    return getMavenArtifactCallable;
  }

  @Override
  public UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesResponse> listNpmPackagesCallable() {
    return listNpmPackagesCallable;
  }

  @Override
  public UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesPagedResponse>
      listNpmPackagesPagedCallable() {
    return listNpmPackagesPagedCallable;
  }

  @Override
  public UnaryCallable<GetNpmPackageRequest, NpmPackage> getNpmPackageCallable() {
    return getNpmPackageCallable;
  }

  @Override
  public UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesResponse>
      listPythonPackagesCallable() {
    return listPythonPackagesCallable;
  }

  @Override
  public UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesPagedResponse>
      listPythonPackagesPagedCallable() {
    return listPythonPackagesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPythonPackageRequest, PythonPackage> getPythonPackageCallable() {
    return getPythonPackageCallable;
  }

  @Override
  public UnaryCallable<ImportAptArtifactsRequest, Operation> importAptArtifactsCallable() {
    return importAptArtifactsCallable;
  }

  @Override
  public OperationCallable<
          ImportAptArtifactsRequest, ImportAptArtifactsResponse, ImportAptArtifactsMetadata>
      importAptArtifactsOperationCallable() {
    return importAptArtifactsOperationCallable;
  }

  @Override
  public UnaryCallable<ImportYumArtifactsRequest, Operation> importYumArtifactsCallable() {
    return importYumArtifactsCallable;
  }

  @Override
  public OperationCallable<
          ImportYumArtifactsRequest, ImportYumArtifactsResponse, ImportYumArtifactsMetadata>
      importYumArtifactsOperationCallable() {
    return importYumArtifactsOperationCallable;
  }

  @Override
  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesCallable() {
    return listRepositoriesCallable;
  }

  @Override
  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesPagedResponse>
      listRepositoriesPagedCallable() {
    return listRepositoriesPagedCallable;
  }

  @Override
  public UnaryCallable<GetRepositoryRequest, Repository> getRepositoryCallable() {
    return getRepositoryCallable;
  }

  @Override
  public UnaryCallable<CreateRepositoryRequest, Operation> createRepositoryCallable() {
    return createRepositoryCallable;
  }

  @Override
  public OperationCallable<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationCallable() {
    return createRepositoryOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateRepositoryRequest, Repository> updateRepositoryCallable() {
    return updateRepositoryCallable;
  }

  @Override
  public UnaryCallable<DeleteRepositoryRequest, Operation> deleteRepositoryCallable() {
    return deleteRepositoryCallable;
  }

  @Override
  public OperationCallable<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationCallable() {
    return deleteRepositoryOperationCallable;
  }

  @Override
  public UnaryCallable<ListPackagesRequest, ListPackagesResponse> listPackagesCallable() {
    return listPackagesCallable;
  }

  @Override
  public UnaryCallable<ListPackagesRequest, ListPackagesPagedResponse> listPackagesPagedCallable() {
    return listPackagesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPackageRequest, Package> getPackageCallable() {
    return getPackageCallable;
  }

  @Override
  public UnaryCallable<DeletePackageRequest, Operation> deletePackageCallable() {
    return deletePackageCallable;
  }

  @Override
  public OperationCallable<DeletePackageRequest, Empty, OperationMetadata>
      deletePackageOperationCallable() {
    return deletePackageOperationCallable;
  }

  @Override
  public UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    return listVersionsCallable;
  }

  @Override
  public UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse> listVersionsPagedCallable() {
    return listVersionsPagedCallable;
  }

  @Override
  public UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    return getVersionCallable;
  }

  @Override
  public UnaryCallable<DeleteVersionRequest, Operation> deleteVersionCallable() {
    return deleteVersionCallable;
  }

  @Override
  public OperationCallable<DeleteVersionRequest, Empty, OperationMetadata>
      deleteVersionOperationCallable() {
    return deleteVersionOperationCallable;
  }

  @Override
  public UnaryCallable<BatchDeleteVersionsRequest, Operation> batchDeleteVersionsCallable() {
    return batchDeleteVersionsCallable;
  }

  @Override
  public OperationCallable<BatchDeleteVersionsRequest, Empty, BatchDeleteVersionsMetadata>
      batchDeleteVersionsOperationCallable() {
    return batchDeleteVersionsOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    return updateVersionCallable;
  }

  @Override
  public UnaryCallable<ListFilesRequest, ListFilesResponse> listFilesCallable() {
    return listFilesCallable;
  }

  @Override
  public UnaryCallable<ListFilesRequest, ListFilesPagedResponse> listFilesPagedCallable() {
    return listFilesPagedCallable;
  }

  @Override
  public UnaryCallable<GetFileRequest, File> getFileCallable() {
    return getFileCallable;
  }

  @Override
  public UnaryCallable<DeleteFileRequest, Operation> deleteFileCallable() {
    return deleteFileCallable;
  }

  @Override
  public OperationCallable<DeleteFileRequest, Empty, OperationMetadata>
      deleteFileOperationCallable() {
    return deleteFileOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateFileRequest, File> updateFileCallable() {
    return updateFileCallable;
  }

  @Override
  public UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    return listTagsCallable;
  }

  @Override
  public UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    return listTagsPagedCallable;
  }

  @Override
  public UnaryCallable<GetTagRequest, Tag> getTagCallable() {
    return getTagCallable;
  }

  @Override
  public UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    return createTagCallable;
  }

  @Override
  public UnaryCallable<UpdateTagRequest, Tag> updateTagCallable() {
    return updateTagCallable;
  }

  @Override
  public UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    return deleteTagCallable;
  }

  @Override
  public UnaryCallable<CreateRuleRequest, Rule> createRuleCallable() {
    return createRuleCallable;
  }

  @Override
  public UnaryCallable<ListRulesRequest, ListRulesResponse> listRulesCallable() {
    return listRulesCallable;
  }

  @Override
  public UnaryCallable<ListRulesRequest, ListRulesPagedResponse> listRulesPagedCallable() {
    return listRulesPagedCallable;
  }

  @Override
  public UnaryCallable<GetRuleRequest, Rule> getRuleCallable() {
    return getRuleCallable;
  }

  @Override
  public UnaryCallable<UpdateRuleRequest, Rule> updateRuleCallable() {
    return updateRuleCallable;
  }

  @Override
  public UnaryCallable<DeleteRuleRequest, Empty> deleteRuleCallable() {
    return deleteRuleCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public UnaryCallable<GetProjectSettingsRequest, ProjectSettings> getProjectSettingsCallable() {
    return getProjectSettingsCallable;
  }

  @Override
  public UnaryCallable<UpdateProjectSettingsRequest, ProjectSettings>
      updateProjectSettingsCallable() {
    return updateProjectSettingsCallable;
  }

  @Override
  public UnaryCallable<GetVPCSCConfigRequest, VPCSCConfig> getVPCSCConfigCallable() {
    return getVPCSCConfigCallable;
  }

  @Override
  public UnaryCallable<UpdateVPCSCConfigRequest, VPCSCConfig> updateVPCSCConfigCallable() {
    return updateVPCSCConfigCallable;
  }

  @Override
  public UnaryCallable<UpdatePackageRequest, Package> updatePackageCallable() {
    return updatePackageCallable;
  }

  @Override
  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsCallable() {
    return listAttachmentsCallable;
  }

  @Override
  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsPagedResponse>
      listAttachmentsPagedCallable() {
    return listAttachmentsPagedCallable;
  }

  @Override
  public UnaryCallable<GetAttachmentRequest, Attachment> getAttachmentCallable() {
    return getAttachmentCallable;
  }

  @Override
  public UnaryCallable<CreateAttachmentRequest, Operation> createAttachmentCallable() {
    return createAttachmentCallable;
  }

  @Override
  public OperationCallable<CreateAttachmentRequest, Attachment, OperationMetadata>
      createAttachmentOperationCallable() {
    return createAttachmentOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteAttachmentRequest, Operation> deleteAttachmentCallable() {
    return deleteAttachmentCallable;
  }

  @Override
  public OperationCallable<DeleteAttachmentRequest, Empty, OperationMetadata>
      deleteAttachmentOperationCallable() {
    return deleteAttachmentOperationCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
