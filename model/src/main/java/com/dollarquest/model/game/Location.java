package com.dollarquest.model.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by eric on 6/22/16.
 */
public class Location {

	private String name;

	private String description;

	private Collection<Item> items;

	private Set<Location> destinations;

	public Collection<Item> removeItems() {
		final Collection<Item> itemsToTake = new ArrayList<Item>(items);
		items.clear();
		return itemsToTake;
	}

	public void leave() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public Set<Location> getDestinations() {
		return destinations;
	}

	public void setDestinations(Set<Location> destinations) {
		this.destinations = destinations;
	}
}
