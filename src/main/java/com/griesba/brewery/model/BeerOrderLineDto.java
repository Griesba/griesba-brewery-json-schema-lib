
package com.griesba.brewery.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "beerId",
    "beerName",
    "version",
    "style",
    "upc",
    "orderQuantity",
    "creationDate",
    "lastModificationDate"
})
public class BeerOrderLineDto implements Serializable
{

    @JsonProperty("id")
    private UUID id;
    @JsonProperty("beerId")
    private UUID beerId;
    @JsonProperty("beerName")
    private String beerName;
    @JsonProperty("version")
    private Long version;
    @JsonProperty("style")
    private String style;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("orderQuantity")
    private Integer orderQuantity;
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

    @JsonProperty("beerId")
    public UUID getBeerId() {
        return beerId;
    }

    @JsonProperty("beerId")
    public void setBeerId(UUID beerId) {
        this.beerId = beerId;
    }

    @JsonProperty("beerName")
    public String getBeerName() {
        return beerName;
    }

    @JsonProperty("beerName")
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    @JsonProperty("version")
    public Long getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Long version) {
        this.version = version;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("orderQuantity")
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    @JsonProperty("orderQuantity")
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
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

    public static class BeerOrderLineDtoBuilder<T extends BeerOrderLineDto >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public BeerOrderLineDtoBuilder() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(BeerOrderLineDto.BeerOrderLineDtoBuilder.class)) {
                this.instance = ((T) new BeerOrderLineDto());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withId(UUID id) {
            ((BeerOrderLineDto) this.instance).id = id;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withBeerId(UUID beerId) {
            ((BeerOrderLineDto) this.instance).beerId = beerId;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withBeerName(String beerName) {
            ((BeerOrderLineDto) this.instance).beerName = beerName;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withVersion(Long version) {
            ((BeerOrderLineDto) this.instance).version = version;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withStyle(String style) {
            ((BeerOrderLineDto) this.instance).style = style;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withUpc(String upc) {
            ((BeerOrderLineDto) this.instance).upc = upc;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withOrderQuantity(Integer orderQuantity) {
            ((BeerOrderLineDto) this.instance).orderQuantity = orderQuantity;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withCreationDate(OffsetDateTime creationDate) {
            ((BeerOrderLineDto) this.instance).creationDate = creationDate;
            return this;
        }

        public BeerOrderLineDto.BeerOrderLineDtoBuilder withLastModificationDate(OffsetDateTime lastModificationDate) {
            ((BeerOrderLineDto) this.instance).lastModificationDate = lastModificationDate;
            return this;
        }

    }

}
