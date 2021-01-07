
package com.griesba.brewery.model.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class NewInventoryEvent
    extends BeerEvent
{


    public static class NewInventoryEventBuilder<T extends NewInventoryEvent >
        extends BeerEvent.BeerEventBuilder
    {


        @SuppressWarnings("unchecked")
        public NewInventoryEventBuilder() {
            super();
            // Skip initialization when called from subclass
            if (this.getClass().equals(NewInventoryEvent.NewInventoryEventBuilder.class)) {
                this.instance = ((T) new NewInventoryEvent());
            }
        }

        @Override
        public T build() {
            return ((T) super.build());
        }

    }

}
