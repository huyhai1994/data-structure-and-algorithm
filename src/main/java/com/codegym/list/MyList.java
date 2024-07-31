/**
 * This interface represents a list of elements of type E. It extends the Iterable interface,
 * allowing for iteration over the elements in the list.
 *
 * @param <E> the type of elements in this list
 */
public interface MyList<E> extends Iterable<E> {

    /**
     * Appends the specified element to the end of this list.
     *
     * @param e the element to be appended to this list
     */
    public void add(E e);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     *
     * @param index the index at which the specified element is to be inserted
     * @param e     the element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt; size())
     */
    public void add(int index, E e);

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    public void clear();

    /**
     * Returns true if this list contains the specified element.
     *
     * @param e the element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(E e);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt;= size())
     */
    public E get(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param e the element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
     */
    public int indexOf(E e);

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty();

    /**
     * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     *
     * @param e the element to search for
     * @return the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
     */
    public int lastIndexOf(E e);

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     *
     * @param e the element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    public boolean remove(E e);

    /**
     * Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt;= size())
     */
    public E remove(int index);

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index the index of the element to replace
     * @param e     the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index &lt; 0 || index &gt;= size())
     */
    public Object set(int index, E e);

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size();
}