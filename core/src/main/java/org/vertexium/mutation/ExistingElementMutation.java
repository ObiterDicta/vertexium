package org.vertexium.mutation;

import org.vertexium.Element;
import org.vertexium.Property;
import org.vertexium.Visibility;

public interface ExistingElementMutation<T extends Element> extends ElementMutation<T> {
    /**
     * Alters the visibility of a property.
     *
     * @param property   The property to mutate.
     * @param visibility The new visibility.
     */
    ExistingElementMutation<T> alterPropertyVisibility(Property property, Visibility visibility);

    /**
     * Alters the visibility of a property.
     *
     * @param key        The key of a multivalued property.
     * @param name       The name of the property to alter the visibility of.
     * @param visibility The new visibility.
     */
    ExistingElementMutation<T> alterPropertyVisibility(String key, String name, Visibility visibility);

    /**
     * Alters the visibility of a property.
     *
     * @param name       The name of the property to alter the visibility of.
     * @param visibility The new visibility.
     */
    ExistingElementMutation<T> alterPropertyVisibility(String name, Visibility visibility);

    /**
     * Alters the visibility of the element (vertex or edge).
     *
     * @param visibility The new visibility.
     */
    ExistingElementMutation<T> alterElementVisibility(Visibility visibility);

    /**
     * Permanently deletes all default properties with that name irregardless of visibility.
     *
     * @param name the property name to delete.
     */
    ExistingElementMutation<T> deleteProperties(String name);

    /**
     * Permanently deletes all properties with this key and name irregardless of visibility.
     *
     * @param key  the key of the property to delete.
     * @param name the name of the property to delete.
     */
    ExistingElementMutation<T> deleteProperties(String key, String name);

    /**
     * Soft deletes all default properties with that name irregardless of visibility.
     *
     * @param name the property name to delete.
     */
    ExistingElementMutation<T> softDeleteProperties(String name);

    /**
     * Soft deletes all properties with this key and name irregardless of visibility.
     *
     * @param key  the key of the property to delete.
     * @param name the name of the property to delete.
     */
    ExistingElementMutation<T> softDeleteProperties(String key, String name);

    /**
     * Gets the element this mutation is affecting.
     *
     * @return The element.
     */
    T getElement();
}
