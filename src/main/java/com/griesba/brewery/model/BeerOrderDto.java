
package com.griesba.brewery.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customerId",
    "customerRef",
    "beerOrderLines",
    "orderStatus",
    "version",
    "orderStatusCallbackUrl",
    "creationDate",
    "lastModificationDate"
})
public class BeerOrderDto implements Serializable
{

    @JsonProperty("id")
    private UUID id;
    @JsonProperty("customerId")
    private UUID customerId;
    @JsonProperty("customerRef")
    private String customerRef;
    @JsonProperty("beerOrderLines")
    private List<BeerOrderLineDto> beerOrderLines = new ArrayList<BeerOrderLineDto>();
    @JsonProperty("orderStatus")
    private String orderStatus;
    @JsonProperty("version")
    private Long version;
    @JsonProperty("orderStatusCallbackUrl")
    private String orderStatusCallbackUrl;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    @JsonProperty("creationDate")
    private OffsetDateTime creationDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    @JsonProperty("lastModificationDate")
    private OffsetDateTime lastModificationDate;

    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    @JsonProperty("customerId")
    public UUID getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("customerRef")
    public String getCustomerRef() {
        return customerRef;
    }

    @JsonProperty("customerRef")
    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    @JsonProperty("beerOrderLines")
    public List<BeerOrderLineDto> getBeerOrderLines() {
        return beerOrderLines;
    }

    @JsonProperty("beerOrderLines")
    public void setBeerOrderLines(List<BeerOrderLineDto> beerOrderLines) {
        this.beerOrderLines = beerOrderLines;
    }

    @JsonProperty("orderStatus")
    public String getOrderStatus() {
        return orderStatus;
    }

    @JsonProperty("orderStatus")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @JsonProperty("version")
    public Long getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Long version) {
        this.version = version;
    }

    @JsonProperty("orderStatusCallbackUrl")
    public String getOrderStatusCallbackUrl() {
        return orderStatusCallbackUrl;
    }

    @JsonProperty("orderStatusCallbackUrl")
    public void setOrderStatusCallbackUrl(String orderStatusCallbackUrl) {
        this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    }

    @JsonProperty("creationDate")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("lastModificationDate")
    public OffsetDateTime getLastModificationDate() {
        return lastModificationDate;
    }

    @JsonProperty("lastModificationDate")
    public void setLastModificationDate(OffsetDateTime lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public static class BeerOrderDtoBuilder<T extends BeerOrderDto >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public BeerOrderDtoBuilder() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(BeerOrderDto.BeerOrderDtoBuilder.class)) {
                this.instance = ((T) new BeerOrderDto());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withId(UUID id) {
            ((BeerOrderDto) this.instance).id = id;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withCustomerId(UUID customerId) {
            ((BeerOrderDto) this.instance).customerId = customerId;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withCustomerRef(String customerRef) {
            ((BeerOrderDto) this.instance).customerRef = customerRef;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withBeerOrderLines(List<BeerOrderLineDto> beerOrderLines) {
            ((BeerOrderDto) this.instance).beerOrderLines = beerOrderLines;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withOrderStatus(String orderStatus) {
            ((BeerOrderDto) this.instance).orderStatus = orderStatus;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withVersion(Long version) {
            ((BeerOrderDto) this.instance).version = version;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withOrderStatusCallbackUrl(String orderStatusCallbackUrl) {
            ((BeerOrderDto) this.instance).orderStatusCallbackUrl = orderStatusCallbackUrl;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withCreationDate(OffsetDateTime creationDate) {
            ((BeerOrderDto) this.instance).creationDate = creationDate;
            return this;
        }

        public BeerOrderDto.BeerOrderDtoBuilder withLastModificationDate(OffsetDateTime lastModificationDate) {
            ((BeerOrderDto) this.instance).lastModificationDate = lastModificationDate;
            return this;
        }

    }

}
