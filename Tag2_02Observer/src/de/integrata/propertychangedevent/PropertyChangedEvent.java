package de.integrata.propertychangedevent;

public record PropertyChangedEvent(Object source, String propertyname, Object oldValue, Object newValue) {


}
