/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.oracledatabase.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class CloudExadataInfrastructureName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_CLOUD_EXADATA_INFRASTRUCTURE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/cloudExadataInfrastructures/{cloud_exadata_infrastructure}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String cloudExadataInfrastructure;

  @Deprecated
  protected CloudExadataInfrastructureName() {
    project = null;
    location = null;
    cloudExadataInfrastructure = null;
  }

  private CloudExadataInfrastructureName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    cloudExadataInfrastructure =
        Preconditions.checkNotNull(builder.getCloudExadataInfrastructure());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getCloudExadataInfrastructure() {
    return cloudExadataInfrastructure;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CloudExadataInfrastructureName of(
      String project, String location, String cloudExadataInfrastructure) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCloudExadataInfrastructure(cloudExadataInfrastructure)
        .build();
  }

  public static String format(String project, String location, String cloudExadataInfrastructure) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCloudExadataInfrastructure(cloudExadataInfrastructure)
        .build()
        .toString();
  }

  public static CloudExadataInfrastructureName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_CLOUD_EXADATA_INFRASTRUCTURE.validatedMatch(
            formattedString,
            "CloudExadataInfrastructureName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("cloud_exadata_infrastructure"));
  }

  public static List<CloudExadataInfrastructureName> parseList(List<String> formattedStrings) {
    List<CloudExadataInfrastructureName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CloudExadataInfrastructureName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CloudExadataInfrastructureName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_CLOUD_EXADATA_INFRASTRUCTURE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (cloudExadataInfrastructure != null) {
            fieldMapBuilder.put("cloud_exadata_infrastructure", cloudExadataInfrastructure);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_CLOUD_EXADATA_INFRASTRUCTURE.instantiate(
        "project",
        project,
        "location",
        location,
        "cloud_exadata_infrastructure",
        cloudExadataInfrastructure);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CloudExadataInfrastructureName that = ((CloudExadataInfrastructureName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.cloudExadataInfrastructure, that.cloudExadataInfrastructure);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(cloudExadataInfrastructure);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/cloudExadataInfrastructures/{cloud_exadata_infrastructure}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String cloudExadataInfrastructure;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getCloudExadataInfrastructure() {
      return cloudExadataInfrastructure;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setCloudExadataInfrastructure(String cloudExadataInfrastructure) {
      this.cloudExadataInfrastructure = cloudExadataInfrastructure;
      return this;
    }

    private Builder(CloudExadataInfrastructureName cloudExadataInfrastructureName) {
      this.project = cloudExadataInfrastructureName.project;
      this.location = cloudExadataInfrastructureName.location;
      this.cloudExadataInfrastructure = cloudExadataInfrastructureName.cloudExadataInfrastructure;
    }

    public CloudExadataInfrastructureName build() {
      return new CloudExadataInfrastructureName(this);
    }
  }
}
