/**
   A class that implements a ResizeableArray to hold Items.
   @author Alyssa Hoshor
*/
public class ShoppingCart {
	
	public String name;
	public int items;
	public double totalPrice;
	ResizableArrayBag<Item> arraybag = new ResizableArrayBag<Item>();
	
	//Constructors
	/**
	 * Creates new shopping cart.
	 */
	public ShoppingCart() {
		this.name="";
		this.items=0;
		this.totalPrice=0;
	}//end empty argument constructor

	/**
	 * Creates new shopping cart with specified parameters.
	 * @param String name for name of shopping cart.
	 */
	public ShoppingCart(String name) {
		this.name=name;
		this.items=0;
		this.totalPrice=0;
	}//end preferred argument constructor
	
	/**
	 * Gets current number of entries in this bag
	 * @return Integer number of items currently in the bag
	 */
	public int getCurrentSize() {
		return this.arraybag.getCurrentSize();
	}//end getCurrentSize
	
	/**Checks if bag is empty
	 *@returns True if bag is empty, false if not.
	 */
	public boolean isEmpty() {
		return this.arraybag.isEmpty();
	}//end isEmpty
	
	/**Adds new item to this bag.
	 * @parameter anItem Object to be added as new Item.
	 * @return True if addition successful, false if not.
	 * 
	 */
	public boolean add(Item newItem) {
		return this.arraybag.add(newItem);
	}//end add
	
	/**Removes one unspecified item from this shopping cart if possible.
	 * @return the removed item if successful, or null
	 */
	public Object remove() {
		return this.arraybag.remove();
	}//end remove
	
	/**Removes one occurrence of a given item from this shopping cart, if possible
	 * @param anItem The item to be removed
	 * @return True if removal successful, false if not.
	 */
	public boolean remove(Item anItem) {
		return this.arraybag.remove(anItem);
		}//end remove
	/**Removes all items from shopping cart.
	 * 
	 */
	public void clear() {
		this.arraybag.clear();
	}//end clear
	
	/**Counts the number of a given item that appears in shopping cart.
	 * @param anItem The item to be counted.
	 * @return Number of times anItem appears in shopping cart.
	 */
	public int getFrequencyOf(Item anItem) {
		return this.arraybag.getFrequencyOf(anItem);
	}//end getFrequencyOf
	
	/**Tests whether this shopping cart contains a given entry.
	 * @parameter anItem the item to find.
	 * @return True if shopping cart contains anItem, or false if not
	 */
	public boolean contains(Item anItem) {
		return this.arraybag.contains(anItem);
	}//end contains
	
	/**Retrieves all items in shopping cart.
	 * @return new array of all items in shopping cart
	 * Note: Will return empty array if nothing in shopping cart.
	 */
	public Item[] toArray() {
		return  this.arraybag.toArray();
	}//end toArray
	
	/** Adds all prices of items in shopping cart.
	 * @param Item 
	 * @return double of all prices in shopping cart, will return zero if nothing in shopping cart.
	 */
	public double getTotalPrice() {
	    double price=0;
	    	for (int index = 0; index < this.arraybag.getCurrentSize(); index++)
	        {
	    		Item a=new Item();
	    		a=arraybag.getObject(index);
	    		price += a.getPrice();
	        } // end for
	    	return Math.round(price * 100)/100.0;
	}//end getTotalPrice
	
	/**Applies percentage off coupon to all Items in shopping cart.
	 * @param discount integer that specifies percentage off total
	 * @returns new price with coupon
	 */
	public double applyCoupon(int discount) {
		double d = discount;
		double price= (this.getTotalPrice()) - (this.getTotalPrice()) * (d/100);
		return Math.round(price * 100)/100.0;
	}//end applyCoupon
	
	/**Gets name of shopping cart.
	 * @returns Shopping Cart name.
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**Sets name of shopping cart based on String parameter.
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**Creates a string with variable information
	 * @returns toString
	 */
	public String toString() {
		return "\nShopping Cart Name: " + this.name + "\n" + this.arraybag.toString();
	}//end toString

}//end shoppingCart class
