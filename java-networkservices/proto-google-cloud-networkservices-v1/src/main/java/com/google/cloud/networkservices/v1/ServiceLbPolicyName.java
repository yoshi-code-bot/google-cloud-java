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

package com.google.cloud.networkservices.v1;

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
public class ServiceLbPolicyName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_SERVICE_LB_POLICY =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String serviceLbPolicy;

  @Deprecated
  protected ServiceLbPolicyName() {
    project = null;
    location = null;
    serviceLbPolicy = null;
  }

  private ServiceLbPolicyName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    serviceLbPolicy = Preconditions.checkNotNull(builder.getServiceLbPolicy());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getServiceLbPolicy() {
    return serviceLbPolicy;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ServiceLbPolicyName of(String project, String location, String serviceLbPolicy) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setServiceLbPolicy(serviceLbPolicy)
        .build();
  }

  public static String format(String project, String location, String serviceLbPolicy) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setServiceLbPolicy(serviceLbPolicy)
        .build()
        .toString();
  }

  public static ServiceLbPolicyName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_SERVICE_LB_POLICY.validatedMatch(
            formattedString, "ServiceLbPolicyName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("service_lb_policy"));
  }

  public static List<ServiceLbPolicyName> parseList(List<String> formattedStrings) {
    List<ServiceLbPolicyName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ServiceLbPolicyName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ServiceLbPolicyName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_SERVICE_LB_POLICY.matches(formattedString);
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
          if (serviceLbPolicy != null) {
            fieldMapBuilder.put("service_lb_policy", serviceLbPolicy);
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
    return PROJECT_LOCATION_SERVICE_LB_POLICY.instantiate(
        "project", project, "location", location, "service_lb_policy", serviceLbPolicy);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ServiceLbPolicyName that = ((ServiceLbPolicyName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.serviceLbPolicy, that.serviceLbPolicy);
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
    h ^= Objects.hashCode(serviceLbPolicy);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/serviceLbPolicies/{service_lb_policy}. */
  public static class Builder {
    private String project;
    private String location;
    private String serviceLbPolicy;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getServiceLbPolicy() {
      return serviceLbPolicy;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setServiceLbPolicy(String serviceLbPolicy) {
      this.serviceLbPolicy = serviceLbPolicy;
      return this;
    }

    private Builder(ServiceLbPolicyName serviceLbPolicyName) {
      this.project = serviceLbPolicyName.project;
      this.location = serviceLbPolicyName.location;
      this.serviceLbPolicy = serviceLbPolicyName.serviceLbPolicy;
    }

    public ServiceLbPolicyName build() {
      return new ServiceLbPolicyName(this);
    }
  }
}
