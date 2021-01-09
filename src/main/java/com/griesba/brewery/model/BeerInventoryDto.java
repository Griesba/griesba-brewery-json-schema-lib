
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
    "name",
    "upc",
    "quantityOnHand",
    "creationDate",
    "lastModificationDate"
})
public class BeerInventoryDto implements Serializable
{

    @JsonProperty("id")
    private UUID id;
    @JsonProperty("beerId")
    private UUID beerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("quantityOnHand")
    private Integer quantityOnHand;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("quantityOnHand")
    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    @JsonProperty("quantityOnHand")
    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
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

    public static class BeerInventoryDtoBuilder<T extends BeerInventoryDto >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public BeerInventoryDtoBuilder() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(BeerInventoryDto.BeerInventoryDtoBuilder.class)) {
                this.instance = ((T) new BeerInventoryDto());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withId(UUID id) {
            ((BeerInventoryDto) this.instance).id = id;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withBeerId(UUID beerId) {
            ((BeerInventoryDto) this.instance).beerId = beerId;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withName(String name) {
            ((BeerInventoryDto) this.instance).name = name;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withUpc(String upc) {
            ((BeerInventoryDto) this.instance).upc = upc;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withQuantityOnHand(Integer quantityOnHand) {
            ((BeerInventoryDto) this.instance).quantityOnHand = quantityOnHand;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withCreationDate(OffsetDateTime creationDate) {
            ((BeerInventoryDto) this.instance).creationDate = creationDate;
            return this;
        }

        public BeerInventoryDto.BeerInventoryDtoBuilder withLastModificationDate(OffsetDateTime lastModificationDate) {
            ((BeerInventoryDto) this.instance).lastModificationDate = lastModificationDate;
            return this;
        }

    }

}
