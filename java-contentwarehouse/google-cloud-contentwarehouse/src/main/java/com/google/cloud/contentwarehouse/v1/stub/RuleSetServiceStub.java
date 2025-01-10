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

package com.google.cloud.contentwarehouse.v1.stub;

import static com.google.cloud.contentwarehouse.v1.RuleSetServiceClient.ListRuleSetsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.contentwarehouse.v1.CreateRuleSetRequest;
import com.google.cloud.contentwarehouse.v1.DeleteRuleSetRequest;
import com.google.cloud.contentwarehouse.v1.GetRuleSetRequest;
import com.google.cloud.contentwarehouse.v1.ListRuleSetsRequest;
import com.google.cloud.contentwarehouse.v1.ListRuleSetsResponse;
import com.google.cloud.contentwarehouse.v1.RuleSet;
import com.google.cloud.contentwarehouse.v1.UpdateRuleSetRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the RuleSetService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class RuleSetServiceStub implements BackgroundResource {

  public UnaryCallable<CreateRuleSetRequest, RuleSet> createRuleSetCallable() {
    throw new UnsupportedOperationException("Not implemented: createRuleSetCallable()");
  }

  public UnaryCallable<GetRuleSetRequest, RuleSet> getRuleSetCallable() {
    throw new UnsupportedOperationException("Not implemented: getRuleSetCallable()");
  }

  public UnaryCallable<UpdateRuleSetRequest, RuleSet> updateRuleSetCallable() {
    throw new UnsupportedOperationException("Not implemented: updateRuleSetCallable()");
  }

  public UnaryCallable<DeleteRuleSetRequest, Empty> deleteRuleSetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteRuleSetCallable()");
  }

  public UnaryCallable<ListRuleSetsRequest, ListRuleSetsPagedResponse> listRuleSetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listRuleSetsPagedCallable()");
  }

  public UnaryCallable<ListRuleSetsRequest, ListRuleSetsResponse> listRuleSetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listRuleSetsCallable()");
  }

  @Override
  public abstract void close();
}
