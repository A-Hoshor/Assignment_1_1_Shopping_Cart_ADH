/**
 * An interface that describes the operations of a shopping cart of items.
 * @author user
 *
 */
public interface ShoppingCartADT<T> {
	
	/**
	 * Gets current number of entries in this bag
	 * @return Integer number of items currently in the bag
	 */
	public int getCurrentSize();
	
	/**Checks if bag is empty
	 *@returns True if bag is empty, false if not.
	 */
	public boolean isEmpty();
	
	/**Adds new item to this bag.
	 * @parameter anItem Object to be added as new Item.
	 * @return True if addition successful, false if not.
	 * 
	 */
	public boolean add(T newItem);
	
	/**Removes one unspecified item from this shopping cart if possible.
	 * @return the removed item if successful, or null
	 */
	public T remove();
	
	/**Removes one occurrence of a given item from this shopping cart, if possible
	 * @param anItem The item to be removed
	 * @return True if removal successful, false if not.
	 */
	public boolean remove(T anItem);
	
	/**Removes all items from shopping cart.
	 * 
	 */
	public void clear();
	
	/**Counts the number of a given item that appears in shopping cart.
	 * @param anItem The item to be counted.
	 * @return Number of times anItem appears in shopping cart.
	 */
	public int getFrequencyOf(T anItem);
	
	/**Tests whether this shopping cart contains a given entry.
	 * @parameter anItem the item to find.
	 * @return True if shopping cart contains anItem, or false if not
	 */
	public boolean contains(T anItem);
	
	/**Retrieves all items in shopping cart.
	 * @return new array of all items in shopping cart
	 * Note: Will return empty array if nothing in shopping cart.
	 */
	public T[] toArray();
	
	/** Adds all prices of items in shopping cart.
	 * @return double of all prices in shopping cart, will return zero if nothing in shopping cart.
	 */
	public double getTotalPrice();
	
	/**Applies percentage off coupon to all Items in shopping cart.
	 * @param discount integer that specifies percentage off total
	 * @returns new price with coupon
	 */
	public double applyCoupon(int discount);

}//end ShoppingBag interface