/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.14.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.ob.domain.yapilymodels;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T14:42:32.575816279Z[Europe/London]")
public class Transaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_BOOKING_DATE_TIME = "bookingDateTime";
  @SerializedName(SERIALIZED_NAME_BOOKING_DATE_TIME)
  private OffsetDateTime bookingDateTime;

  public static final String SERIALIZED_NAME_VALUE_DATE_TIME = "valueDateTime";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE_TIME)
  private OffsetDateTime valueDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStatusEnum status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private Amount grossAmount;

  public static final String SERIALIZED_NAME_CURRENCY_EXCHANGE = "currencyExchange";
  @SerializedName(SERIALIZED_NAME_CURRENCY_EXCHANGE)
  private CurrencyExchange currencyExchange;

  public static final String SERIALIZED_NAME_CHARGE_DETAILS = "chargeDetails";
  @SerializedName(SERIALIZED_NAME_CHARGE_DETAILS)
  private TransactionChargeDetails chargeDetails;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_STATEMENT_REFERENCES = "statementReferences";
  @SerializedName(SERIALIZED_NAME_STATEMENT_REFERENCES)
  private List<StatementReference> statementReferences = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSACTION_INFORMATION = "transactionInformation";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_INFORMATION)
  private List<String> transactionInformation = null;

  public static final String SERIALIZED_NAME_ADDRESS_DETAILS = "addressDetails";
  @SerializedName(SERIALIZED_NAME_ADDRESS_DETAILS)
  private AddressDetails addressDetails;

  public static final String SERIALIZED_NAME_ISO_BANK_TRANSACTION_CODE = "isoBankTransactionCode";
  @SerializedName(SERIALIZED_NAME_ISO_BANK_TRANSACTION_CODE)
  private IsoBankTransactionCode isoBankTransactionCode;

  public static final String SERIALIZED_NAME_PROPRIETARY_BANK_TRANSACTION_CODE = "proprietaryBankTransactionCode";
  @SerializedName(SERIALIZED_NAME_PROPRIETARY_BANK_TRANSACTION_CODE)
  private ProprietaryBankTransactionCode proprietaryBankTransactionCode;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private TransactionBalance balance;

  public static final String SERIALIZED_NAME_PAYEE_DETAILS = "payeeDetails";
  @SerializedName(SERIALIZED_NAME_PAYEE_DETAILS)
  private Payee payeeDetails;

  public static final String SERIALIZED_NAME_PAYER_DETAILS = "payerDetails";
  @SerializedName(SERIALIZED_NAME_PAYER_DETAILS)
  private Payer payerDetails;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private Merchant merchant;

  public static final String SERIALIZED_NAME_ENRICHMENT = "enrichment";
  @SerializedName(SERIALIZED_NAME_ENRICHMENT)
  private Enrichment enrichment;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "supplementaryData";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private Object supplementaryData;

  public static final String SERIALIZED_NAME_TRANSACTION_MUTABILITY = "transactionMutability";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_MUTABILITY)
  private String transactionMutability;

  public Transaction() { 
  }

  public Transaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transaction date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Transaction bookingDateTime(OffsetDateTime bookingDateTime) {
    
    this.bookingDateTime = bookingDateTime;
    return this;
  }

   /**
   * Get bookingDateTime
   * @return bookingDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }


  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }


  public Transaction valueDateTime(OffsetDateTime valueDateTime) {
    
    this.valueDateTime = valueDateTime;
    return this;
  }

   /**
   * Get valueDateTime
   * @return valueDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }


  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }


  public Transaction status(TransactionStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionStatusEnum getStatus() {
    return status;
  }


  public void setStatus(TransactionStatusEnum status) {
    this.status = status;
  }


  public Transaction amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public Transaction currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Transaction transactionAmount(Amount transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getTransactionAmount() {
    return transactionAmount;
  }


  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public Transaction grossAmount(Amount grossAmount) {
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * Get grossAmount
   * @return grossAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(Amount grossAmount) {
    this.grossAmount = grossAmount;
  }


  public Transaction currencyExchange(CurrencyExchange currencyExchange) {
    
    this.currencyExchange = currencyExchange;
    return this;
  }

   /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CurrencyExchange getCurrencyExchange() {
    return currencyExchange;
  }


  public void setCurrencyExchange(CurrencyExchange currencyExchange) {
    this.currencyExchange = currencyExchange;
  }


  public Transaction chargeDetails(TransactionChargeDetails chargeDetails) {
    
    this.chargeDetails = chargeDetails;
    return this;
  }

   /**
   * Get chargeDetails
   * @return chargeDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionChargeDetails getChargeDetails() {
    return chargeDetails;
  }


  public void setChargeDetails(TransactionChargeDetails chargeDetails) {
    this.chargeDetails = chargeDetails;
  }


  public Transaction reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Transaction statementReferences(List<StatementReference> statementReferences) {
    
    this.statementReferences = statementReferences;
    return this;
  }

  public Transaction addStatementReferencesItem(StatementReference statementReferencesItem) {
    if (this.statementReferences == null) {
      this.statementReferences = new ArrayList<StatementReference>();
    }
    this.statementReferences.add(statementReferencesItem);
    return this;
  }

   /**
   * Get statementReferences
   * @return statementReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StatementReference> getStatementReferences() {
    return statementReferences;
  }


  public void setStatementReferences(List<StatementReference> statementReferences) {
    this.statementReferences = statementReferences;
  }


  public Transaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transaction transactionInformation(List<String> transactionInformation) {
    
    this.transactionInformation = transactionInformation;
    return this;
  }

  public Transaction addTransactionInformationItem(String transactionInformationItem) {
    if (this.transactionInformation == null) {
      this.transactionInformation = new ArrayList<String>();
    }
    this.transactionInformation.add(transactionInformationItem);
    return this;
  }

   /**
   * Get transactionInformation
   * @return transactionInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTransactionInformation() {
    return transactionInformation;
  }


  public void setTransactionInformation(List<String> transactionInformation) {
    this.transactionInformation = transactionInformation;
  }


  public Transaction addressDetails(AddressDetails addressDetails) {
    
    this.addressDetails = addressDetails;
    return this;
  }

   /**
   * Get addressDetails
   * @return addressDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressDetails getAddressDetails() {
    return addressDetails;
  }


  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }


  public Transaction isoBankTransactionCode(IsoBankTransactionCode isoBankTransactionCode) {
    
    this.isoBankTransactionCode = isoBankTransactionCode;
    return this;
  }

   /**
   * Get isoBankTransactionCode
   * @return isoBankTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IsoBankTransactionCode getIsoBankTransactionCode() {
    return isoBankTransactionCode;
  }


  public void setIsoBankTransactionCode(IsoBankTransactionCode isoBankTransactionCode) {
    this.isoBankTransactionCode = isoBankTransactionCode;
  }


  public Transaction proprietaryBankTransactionCode(ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

   /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }


  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }


  public Transaction balance(TransactionBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionBalance getBalance() {
    return balance;
  }


  public void setBalance(TransactionBalance balance) {
    this.balance = balance;
  }


  public Transaction payeeDetails(Payee payeeDetails) {
    
    this.payeeDetails = payeeDetails;
    return this;
  }

   /**
   * Get payeeDetails
   * @return payeeDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Payee getPayeeDetails() {
    return payeeDetails;
  }


  public void setPayeeDetails(Payee payeeDetails) {
    this.payeeDetails = payeeDetails;
  }


  public Transaction payerDetails(Payer payerDetails) {
    
    this.payerDetails = payerDetails;
    return this;
  }

   /**
   * Get payerDetails
   * @return payerDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Payer getPayerDetails() {
    return payerDetails;
  }


  public void setPayerDetails(Payer payerDetails) {
    this.payerDetails = payerDetails;
  }


  public Transaction merchant(Merchant merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Merchant getMerchant() {
    return merchant;
  }


  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }


  public Transaction enrichment(Enrichment enrichment) {
    
    this.enrichment = enrichment;
    return this;
  }

   /**
   * Get enrichment
   * @return enrichment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Enrichment getEnrichment() {
    return enrichment;
  }


  public void setEnrichment(Enrichment enrichment) {
    this.enrichment = enrichment;
  }


  public Transaction supplementaryData(Object supplementaryData) {
    
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSupplementaryData() {
    return supplementaryData;
  }


  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  public Transaction transactionMutability(String transactionMutability) {
    
    this.transactionMutability = transactionMutability;
    return this;
  }

   /**
   * __Optional__. Specifies the Mutability of the Transaction record.&lt;ul&gt;&lt;li&gt;A transaction with a &#x60;Status&#x60; of &#x60;Pending&#x60; is mutable.&lt;/li&gt;&lt;li&gt;A transaction with a &#x60;Status&#x60; of &#x60;Booked&#x60; where the &#x60;TransactionMutability&#x60; flag is not specified is not guaranteed to be immutable (although in most instances it will be).&lt;/li&gt;&lt;li&gt;A transaction with a &#x60;Status&#x60; of &#x60;Booked&#x60; with the &#x60;TransactionMutability&#x60; flag set to &#x60;Immutable&#x60; is immutable.&lt;/li&gt;&lt;li&gt;A transaction with a &#x60;Status&#x60; of &#x60;Booked&#x60; with the &#x60;TransactionMutability&#x60; flag set to &#x60;Mutable&#x60; is mutable.&lt;/li&gt;&lt;/ul&gt;
   * @return transactionMutability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mutable", value = "__Optional__. Specifies the Mutability of the Transaction record.<ul><li>A transaction with a `Status` of `Pending` is mutable.</li><li>A transaction with a `Status` of `Booked` where the `TransactionMutability` flag is not specified is not guaranteed to be immutable (although in most instances it will be).</li><li>A transaction with a `Status` of `Booked` with the `TransactionMutability` flag set to `Immutable` is immutable.</li><li>A transaction with a `Status` of `Booked` with the `TransactionMutability` flag set to `Mutable` is mutable.</li></ul>")

  public String getTransactionMutability() {
    return transactionMutability;
  }


  public void setTransactionMutability(String transactionMutability) {
    this.transactionMutability = transactionMutability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.bookingDateTime, transaction.bookingDateTime) &&
        Objects.equals(this.valueDateTime, transaction.valueDateTime) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.transactionAmount, transaction.transactionAmount) &&
        Objects.equals(this.grossAmount, transaction.grossAmount) &&
        Objects.equals(this.currencyExchange, transaction.currencyExchange) &&
        Objects.equals(this.chargeDetails, transaction.chargeDetails) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.statementReferences, transaction.statementReferences) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.transactionInformation, transaction.transactionInformation) &&
        Objects.equals(this.addressDetails, transaction.addressDetails) &&
        Objects.equals(this.isoBankTransactionCode, transaction.isoBankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, transaction.proprietaryBankTransactionCode) &&
        Objects.equals(this.balance, transaction.balance) &&
        Objects.equals(this.payeeDetails, transaction.payeeDetails) &&
        Objects.equals(this.payerDetails, transaction.payerDetails) &&
        Objects.equals(this.merchant, transaction.merchant) &&
        Objects.equals(this.enrichment, transaction.enrichment) &&
        Objects.equals(this.supplementaryData, transaction.supplementaryData) &&
        Objects.equals(this.transactionMutability, transaction.transactionMutability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, bookingDateTime, valueDateTime, status, amount, currency, transactionAmount, grossAmount, currencyExchange, chargeDetails, reference, statementReferences, description, transactionInformation, addressDetails, isoBankTransactionCode, proprietaryBankTransactionCode, balance, payeeDetails, payerDetails, merchant, enrichment, supplementaryData, transactionMutability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    chargeDetails: ").append(toIndentedString(chargeDetails)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    statementReferences: ").append(toIndentedString(statementReferences)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    isoBankTransactionCode: ").append(toIndentedString(isoBankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    payeeDetails: ").append(toIndentedString(payeeDetails)).append("\n");
    sb.append("    payerDetails: ").append(toIndentedString(payerDetails)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    enrichment: ").append(toIndentedString(enrichment)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

