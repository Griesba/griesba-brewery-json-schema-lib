
package com.griesba.brewery.model.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class BrewBeerEvent
    extends BeerEvent
{


    public static class BrewBeerEventBuilder<T extends BrewBeerEvent >
        extends BeerEvent.BeerEventBuilder
    {


        @SuppressWarnings("unchecked")
        public BrewBeerEventBuilder() {
            super();
            // Skip initialization when called from subclass
            if (this.getClass().equals(BrewBeerEvent.BrewBeerEventBuilder.class)) {
                this.instance = ((T) new BrewBeerEvent());
            }
        }

        @Override
        public T build() {
            return ((T) super.build());
        }

    }

}
