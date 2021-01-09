
package com.griesba.brewery.model.events;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.griesba.brewery.model.BeerOrderDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beerOrderDto"
})
public class ValidateBeerOrderRequest implements Serializable
{

    @JsonProperty("beerOrderDto")
    private BeerOrderDto beerOrderDto;

    @JsonProperty("beerOrderDto")
    public BeerOrderDto getBeerOrderDto() {
        return beerOrderDto;
    }

    @JsonProperty("beerOrderDto")
    public void setBeerOrderDto(BeerOrderDto beerOrderDto) {
        this.beerOrderDto = beerOrderDto;
    }

    public static class ValidateBeerOrderRequestBuilder<T extends ValidateBeerOrderRequest >{

        protected T instance;

        @SuppressWarnings("unchecked")
        public ValidateBeerOrderRequestBuilder() {
            // Skip initialization when called from subclass
            if (this.getClass().equals(ValidateBeerOrderRequest.ValidateBeerOrderRequestBuilder.class)) {
                this.instance = ((T) new ValidateBeerOrderRequest());
            }
        }

        public T build() {
            T result;
            result = this.instance;
            this.instance = null;
            return result;
        }

        public ValidateBeerOrderRequest.ValidateBeerOrderRequestBuilder withBeerOrderDto(BeerOrderDto beerOrderDto) {
            ((ValidateBeerOrderRequest) this.instance).beerOrderDto = beerOrderDto;
            return this;
        }

    }

}
