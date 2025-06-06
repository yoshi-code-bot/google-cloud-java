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

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
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
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ArtifactRegistry service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class ArtifactRegistryStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListDockerImagesRequest, ListDockerImagesPagedResponse>
      listDockerImagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDockerImagesPagedCallable()");
  }

  public UnaryCallable<ListDockerImagesRequest, ListDockerImagesResponse>
      listDockerImagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listDockerImagesCallable()");
  }

  public UnaryCallable<GetDockerImageRequest, DockerImage> getDockerImageCallable() {
    throw new UnsupportedOperationException("Not implemented: getDockerImageCallable()");
  }

  public UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsPagedResponse>
      listMavenArtifactsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listMavenArtifactsPagedCallable()");
  }

  public UnaryCallable<ListMavenArtifactsRequest, ListMavenArtifactsResponse>
      listMavenArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: listMavenArtifactsCallable()");
  }

  public UnaryCallable<GetMavenArtifactRequest, MavenArtifact> getMavenArtifactCallable() {
    throw new UnsupportedOperationException("Not implemented: getMavenArtifactCallable()");
  }

  public UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesPagedResponse>
      listNpmPackagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listNpmPackagesPagedCallable()");
  }

  public UnaryCallable<ListNpmPackagesRequest, ListNpmPackagesResponse> listNpmPackagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listNpmPackagesCallable()");
  }

  public UnaryCallable<GetNpmPackageRequest, NpmPackage> getNpmPackageCallable() {
    throw new UnsupportedOperationException("Not implemented: getNpmPackageCallable()");
  }

  public UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesPagedResponse>
      listPythonPackagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPythonPackagesPagedCallable()");
  }

  public UnaryCallable<ListPythonPackagesRequest, ListPythonPackagesResponse>
      listPythonPackagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listPythonPackagesCallable()");
  }

  public UnaryCallable<GetPythonPackageRequest, PythonPackage> getPythonPackageCallable() {
    throw new UnsupportedOperationException("Not implemented: getPythonPackageCallable()");
  }

  public OperationCallable<
          ImportAptArtifactsRequest, ImportAptArtifactsResponse, ImportAptArtifactsMetadata>
      importAptArtifactsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importAptArtifactsOperationCallable()");
  }

  public UnaryCallable<ImportAptArtifactsRequest, Operation> importAptArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: importAptArtifactsCallable()");
  }

  public OperationCallable<
          ImportYumArtifactsRequest, ImportYumArtifactsResponse, ImportYumArtifactsMetadata>
      importYumArtifactsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importYumArtifactsOperationCallable()");
  }

  public UnaryCallable<ImportYumArtifactsRequest, Operation> importYumArtifactsCallable() {
    throw new UnsupportedOperationException("Not implemented: importYumArtifactsCallable()");
  }

  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesPagedResponse>
      listRepositoriesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRepositoriesPagedCallable()");
  }

  public UnaryCallable<ListRepositoriesRequest, ListRepositoriesResponse>
      listRepositoriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listRepositoriesCallable()");
  }

  public UnaryCallable<GetRepositoryRequest, Repository> getRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: getRepositoryCallable()");
  }

  public OperationCallable<CreateRepositoryRequest, Repository, OperationMetadata>
      createRepositoryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createRepositoryOperationCallable()");
  }

  public UnaryCallable<CreateRepositoryRequest, Operation> createRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: createRepositoryCallable()");
  }

  public UnaryCallable<UpdateRepositoryRequest, Repository> updateRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateRepositoryCallable()");
  }

  public OperationCallable<DeleteRepositoryRequest, Empty, OperationMetadata>
      deleteRepositoryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRepositoryOperationCallable()");
  }

  public UnaryCallable<DeleteRepositoryRequest, Operation> deleteRepositoryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRepositoryCallable()");
  }

  public UnaryCallable<ListPackagesRequest, ListPackagesPagedResponse> listPackagesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPackagesPagedCallable()");
  }

  public UnaryCallable<ListPackagesRequest, ListPackagesResponse> listPackagesCallable() {
    throw new UnsupportedOperationException("Not implemented: listPackagesCallable()");
  }

  public UnaryCallable<GetPackageRequest, Package> getPackageCallable() {
    throw new UnsupportedOperationException("Not implemented: getPackageCallable()");
  }

  public OperationCallable<DeletePackageRequest, Empty, OperationMetadata>
      deletePackageOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePackageOperationCallable()");
  }

  public UnaryCallable<DeletePackageRequest, Operation> deletePackageCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePackageCallable()");
  }

  public UnaryCallable<ListVersionsRequest, ListVersionsPagedResponse> listVersionsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsPagedCallable()");
  }

  public UnaryCallable<ListVersionsRequest, ListVersionsResponse> listVersionsCallable() {
    throw new UnsupportedOperationException("Not implemented: listVersionsCallable()");
  }

  public UnaryCallable<GetVersionRequest, Version> getVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: getVersionCallable()");
  }

  public OperationCallable<DeleteVersionRequest, Empty, OperationMetadata>
      deleteVersionOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVersionOperationCallable()");
  }

  public UnaryCallable<DeleteVersionRequest, Operation> deleteVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteVersionCallable()");
  }

  public OperationCallable<BatchDeleteVersionsRequest, Empty, BatchDeleteVersionsMetadata>
      batchDeleteVersionsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchDeleteVersionsOperationCallable()");
  }

  public UnaryCallable<BatchDeleteVersionsRequest, Operation> batchDeleteVersionsCallable() {
    throw new UnsupportedOperationException("Not implemented: batchDeleteVersionsCallable()");
  }

  public UnaryCallable<UpdateVersionRequest, Version> updateVersionCallable() {
    throw new UnsupportedOperationException("Not implemented: updateVersionCallable()");
  }

  public UnaryCallable<ListFilesRequest, ListFilesPagedResponse> listFilesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFilesPagedCallable()");
  }

  public UnaryCallable<ListFilesRequest, ListFilesResponse> listFilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listFilesCallable()");
  }

  public UnaryCallable<GetFileRequest, File> getFileCallable() {
    throw new UnsupportedOperationException("Not implemented: getFileCallable()");
  }

  public OperationCallable<DeleteFileRequest, Empty, OperationMetadata>
      deleteFileOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteFileOperationCallable()");
  }

  public UnaryCallable<DeleteFileRequest, Operation> deleteFileCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteFileCallable()");
  }

  public UnaryCallable<UpdateFileRequest, File> updateFileCallable() {
    throw new UnsupportedOperationException("Not implemented: updateFileCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsPagedResponse> listTagsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsPagedCallable()");
  }

  public UnaryCallable<ListTagsRequest, ListTagsResponse> listTagsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagsCallable()");
  }

  public UnaryCallable<GetTagRequest, Tag> getTagCallable() {
    throw new UnsupportedOperationException("Not implemented: getTagCallable()");
  }

  public UnaryCallable<CreateTagRequest, Tag> createTagCallable() {
    throw new UnsupportedOperationException("Not implemented: createTagCallable()");
  }

  public UnaryCallable<UpdateTagRequest, Tag> updateTagCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTagCallable()");
  }

  public UnaryCallable<DeleteTagRequest, Empty> deleteTagCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTagCallable()");
  }

  public UnaryCallable<CreateRuleRequest, Rule> createRuleCallable() {
    throw new UnsupportedOperationException("Not implemented: createRuleCallable()");
  }

  public UnaryCallable<ListRulesRequest, ListRulesPagedResponse> listRulesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRulesPagedCallable()");
  }

  public UnaryCallable<ListRulesRequest, ListRulesResponse> listRulesCallable() {
    throw new UnsupportedOperationException("Not implemented: listRulesCallable()");
  }

  public UnaryCallable<GetRuleRequest, Rule> getRuleCallable() {
    throw new UnsupportedOperationException("Not implemented: getRuleCallable()");
  }

  public UnaryCallable<UpdateRuleRequest, Rule> updateRuleCallable() {
    throw new UnsupportedOperationException("Not implemented: updateRuleCallable()");
  }

  public UnaryCallable<DeleteRuleRequest, Empty> deleteRuleCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRuleCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public UnaryCallable<GetProjectSettingsRequest, ProjectSettings> getProjectSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getProjectSettingsCallable()");
  }

  public UnaryCallable<UpdateProjectSettingsRequest, ProjectSettings>
      updateProjectSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: updateProjectSettingsCallable()");
  }

  public UnaryCallable<GetVPCSCConfigRequest, VPCSCConfig> getVPCSCConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getVPCSCConfigCallable()");
  }

  public UnaryCallable<UpdateVPCSCConfigRequest, VPCSCConfig> updateVPCSCConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateVPCSCConfigCallable()");
  }

  public UnaryCallable<UpdatePackageRequest, Package> updatePackageCallable() {
    throw new UnsupportedOperationException("Not implemented: updatePackageCallable()");
  }

  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsPagedResponse>
      listAttachmentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttachmentsPagedCallable()");
  }

  public UnaryCallable<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttachmentsCallable()");
  }

  public UnaryCallable<GetAttachmentRequest, Attachment> getAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: getAttachmentCallable()");
  }

  public OperationCallable<CreateAttachmentRequest, Attachment, OperationMetadata>
      createAttachmentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createAttachmentOperationCallable()");
  }

  public UnaryCallable<CreateAttachmentRequest, Operation> createAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: createAttachmentCallable()");
  }

  public OperationCallable<DeleteAttachmentRequest, Empty, OperationMetadata>
      deleteAttachmentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAttachmentOperationCallable()");
  }

  public UnaryCallable<DeleteAttachmentRequest, Operation> deleteAttachmentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAttachmentCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
