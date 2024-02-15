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

package com.google.cloud.vmwareengine.v1;

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
public class VmwareEngineNetworkName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_VMWARE_ENGINE_NETWORK =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String vmwareEngineNetwork;

  @Deprecated
  protected VmwareEngineNetworkName() {
    project = null;
    location = null;
    vmwareEngineNetwork = null;
  }

  private VmwareEngineNetworkName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    vmwareEngineNetwork = Preconditions.checkNotNull(builder.getVmwareEngineNetwork());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getVmwareEngineNetwork() {
    return vmwareEngineNetwork;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static VmwareEngineNetworkName of(
      String project, String location, String vmwareEngineNetwork) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setVmwareEngineNetwork(vmwareEngineNetwork)
        .build();
  }

  public static String format(String project, String location, String vmwareEngineNetwork) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setVmwareEngineNetwork(vmwareEngineNetwork)
        .build()
        .toString();
  }

  public static VmwareEngineNetworkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_VMWARE_ENGINE_NETWORK.validatedMatch(
            formattedString, "VmwareEngineNetworkName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"), matchMap.get("location"), matchMap.get("vmware_engine_network"));
  }

  public static List<VmwareEngineNetworkName> parseList(List<String> formattedStrings) {
    List<VmwareEngineNetworkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<VmwareEngineNetworkName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (VmwareEngineNetworkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_VMWARE_ENGINE_NETWORK.matches(formattedString);
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
          if (vmwareEngineNetwork != null) {
            fieldMapBuilder.put("vmware_engine_network", vmwareEngineNetwork);
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
    return PROJECT_LOCATION_VMWARE_ENGINE_NETWORK.instantiate(
        "project", project, "location", location, "vmware_engine_network", vmwareEngineNetwork);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      VmwareEngineNetworkName that = ((VmwareEngineNetworkName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.vmwareEngineNetwork, that.vmwareEngineNetwork);
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
    h ^= Objects.hashCode(vmwareEngineNetwork);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/vmwareEngineNetworks/{vmware_engine_network}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String vmwareEngineNetwork;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getVmwareEngineNetwork() {
      return vmwareEngineNetwork;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setVmwareEngineNetwork(String vmwareEngineNetwork) {
      this.vmwareEngineNetwork = vmwareEngineNetwork;
      return this;
    }

    private Builder(VmwareEngineNetworkName vmwareEngineNetworkName) {
      this.project = vmwareEngineNetworkName.project;
      this.location = vmwareEngineNetworkName.location;
      this.vmwareEngineNetwork = vmwareEngineNetworkName.vmwareEngineNetwork;
    }

    public VmwareEngineNetworkName build() {
      return new VmwareEngineNetworkName(this);
    }
  }
}
