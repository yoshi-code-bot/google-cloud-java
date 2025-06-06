/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.solar.v1;

public interface FinancialAnalysisOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.solar.v1.FinancialAnalysis)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The monthly electric bill this analysis assumes.
   * </pre>
   *
   * <code>.google.type.Money monthly_bill = 3;</code>
   *
   * @return Whether the monthlyBill field is set.
   */
  boolean hasMonthlyBill();

  /**
   *
   *
   * <pre>
   * The monthly electric bill this analysis assumes.
   * </pre>
   *
   * <code>.google.type.Money monthly_bill = 3;</code>
   *
   * @return The monthlyBill.
   */
  com.google.type.Money getMonthlyBill();

  /**
   *
   *
   * <pre>
   * The monthly electric bill this analysis assumes.
   * </pre>
   *
   * <code>.google.type.Money monthly_bill = 3;</code>
   */
  com.google.type.MoneyOrBuilder getMonthlyBillOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether this is the bill size selected to be the default bill for the
   * area this building is in. Exactly one `FinancialAnalysis` in
   * `BuildingSolarPotential` should have `default_bill` set.
   * </pre>
   *
   * <code>bool default_bill = 4;</code>
   *
   * @return The defaultBill.
   */
  boolean getDefaultBill();

  /**
   *
   *
   * <pre>
   * How much electricity the house uses in an average month, based on the
   * bill size and the local electricity rates.
   * </pre>
   *
   * <code>float average_kwh_per_month = 5;</code>
   *
   * @return The averageKwhPerMonth.
   */
  float getAverageKwhPerMonth();

  /**
   *
   *
   * <pre>
   * Index in [solar_panel_configs]
   * [google.maps.solar.v1.SolarPotential.solar_panel_configs]
   * of the optimum solar layout for this bill size. This can be -1
   * indicating that there is no layout. In this case, the remaining
   * submessages will be omitted.
   * </pre>
   *
   * <code>optional int32 panel_config_index = 6;</code>
   *
   * @return Whether the panelConfigIndex field is set.
   */
  boolean hasPanelConfigIndex();

  /**
   *
   *
   * <pre>
   * Index in [solar_panel_configs]
   * [google.maps.solar.v1.SolarPotential.solar_panel_configs]
   * of the optimum solar layout for this bill size. This can be -1
   * indicating that there is no layout. In this case, the remaining
   * submessages will be omitted.
   * </pre>
   *
   * <code>optional int32 panel_config_index = 6;</code>
   *
   * @return The panelConfigIndex.
   */
  int getPanelConfigIndex();

  /**
   *
   *
   * <pre>
   * Financial information that applies regardless of the financing method
   * used.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancialDetails financial_details = 7;</code>
   *
   * @return Whether the financialDetails field is set.
   */
  boolean hasFinancialDetails();

  /**
   *
   *
   * <pre>
   * Financial information that applies regardless of the financing method
   * used.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancialDetails financial_details = 7;</code>
   *
   * @return The financialDetails.
   */
  com.google.maps.solar.v1.FinancialDetails getFinancialDetails();

  /**
   *
   *
   * <pre>
   * Financial information that applies regardless of the financing method
   * used.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancialDetails financial_details = 7;</code>
   */
  com.google.maps.solar.v1.FinancialDetailsOrBuilder getFinancialDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Cost and benefit of leasing the solar panels.
   * </pre>
   *
   * <code>.google.maps.solar.v1.LeasingSavings leasing_savings = 8;</code>
   *
   * @return Whether the leasingSavings field is set.
   */
  boolean hasLeasingSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of leasing the solar panels.
   * </pre>
   *
   * <code>.google.maps.solar.v1.LeasingSavings leasing_savings = 8;</code>
   *
   * @return The leasingSavings.
   */
  com.google.maps.solar.v1.LeasingSavings getLeasingSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of leasing the solar panels.
   * </pre>
   *
   * <code>.google.maps.solar.v1.LeasingSavings leasing_savings = 8;</code>
   */
  com.google.maps.solar.v1.LeasingSavingsOrBuilder getLeasingSavingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels with cash.
   * </pre>
   *
   * <code>.google.maps.solar.v1.CashPurchaseSavings cash_purchase_savings = 9;</code>
   *
   * @return Whether the cashPurchaseSavings field is set.
   */
  boolean hasCashPurchaseSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels with cash.
   * </pre>
   *
   * <code>.google.maps.solar.v1.CashPurchaseSavings cash_purchase_savings = 9;</code>
   *
   * @return The cashPurchaseSavings.
   */
  com.google.maps.solar.v1.CashPurchaseSavings getCashPurchaseSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels with cash.
   * </pre>
   *
   * <code>.google.maps.solar.v1.CashPurchaseSavings cash_purchase_savings = 9;</code>
   */
  com.google.maps.solar.v1.CashPurchaseSavingsOrBuilder getCashPurchaseSavingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels by financing the purchase.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancedPurchaseSavings financed_purchase_savings = 10;</code>
   *
   * @return Whether the financedPurchaseSavings field is set.
   */
  boolean hasFinancedPurchaseSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels by financing the purchase.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancedPurchaseSavings financed_purchase_savings = 10;</code>
   *
   * @return The financedPurchaseSavings.
   */
  com.google.maps.solar.v1.FinancedPurchaseSavings getFinancedPurchaseSavings();

  /**
   *
   *
   * <pre>
   * Cost and benefit of buying the solar panels by financing the purchase.
   * </pre>
   *
   * <code>.google.maps.solar.v1.FinancedPurchaseSavings financed_purchase_savings = 10;</code>
   */
  com.google.maps.solar.v1.FinancedPurchaseSavingsOrBuilder getFinancedPurchaseSavingsOrBuilder();
}
