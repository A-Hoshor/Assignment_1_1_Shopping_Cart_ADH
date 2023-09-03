/**
   A class that creates an Item Object.
   @author Alyssa Hoshor
*/
public class Item {
	public String name;
	public double price;
	public double barcode;
	public int quantity;
	
	//Constructors
	
	/** Creates an item using specified parameters.
	 * @param name The item name to be entered
	 * @param price The price of item to be entered
	 * @param barcode The barcode of item to be entered
	 * @param quantity The amount of items to be entered*/
	public Item(String name, double price, double barcode, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.barcode = barcode;
		this.quantity = quantity;
	}//end preferred argument constructor

	/** Creates an item using with price,barcode and quantity set to zero and the name set to "".
	 */
	public Item() {
		super();
		this.name="";
		this.price=0;
		this.barcode=0;
		this.quantity=0;
	}//end empty argument constructor
	
	//Getters and Setters

	/** Gets the name of this item.
    @return  the String name of this item. */
	public String getName() {
		return name;
	}//end getName

	/** Set's the String name of this item. */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/** Gets the price of this item.
    @return  The price of this item. */
	public double getPrice() {
		return price;
	}//end getPrice

	/** Sets price for this item. */
	public void setPrice(double price) {
		this.price = price;
	}//end setPrice

	/** Gets barcode for this item
	 * @return this barcode*/
	public double getBarcode() {
		return barcode;
	}//end getBarcode
	
	/** Sets the barcode for the item. */
	public void setBarcode(double barcode) {
		this.barcode = barcode;
	}//end setBarcode

	/** Gets quantity of items.
    @return  the integer quantity of items. */
	public int getQuantity() {
		return quantity;
	}//end getQuantity

	/** Sets quantity of this item. */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//end setQuantity

	/** Creates string of variables of item.
    @return  string of variables */
	@Override
	public String toString() {
		return "\nItem Name:" + name + "\nPrice=" + price + "\nBarcode=" + barcode + "\nQuantity=" + quantity + "\n";
	}//end toString
	
}//end class
