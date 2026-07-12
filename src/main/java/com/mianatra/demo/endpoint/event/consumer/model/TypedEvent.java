package com.mianatra.demo.endpoint.event.consumer.model;

import com.mianatra.demo.PojaGenerated;
import com.mianatra.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
