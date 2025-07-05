package io.quarkusdroneshop.barista.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.quarkusdroneshop.domain.Item;

@RegisterForReflection
public class EightySixEvent implements Event {

        Item item;

        EventType eventType = EventType.EIGHTY_SIX;

        public EightySixEvent() {
        }

        public EightySixEvent(Item item) {
            this.item = item;
        }

        @Override
        public EventType getEventType() {
                return this.eventType;
        }
}
