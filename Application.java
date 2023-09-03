/**
   A class that tests the Item and Shopping Cart class.
   @author Alyssa Hoshor
*/
public class Application {
	

	public static void main(String[] args) {
		
		/**Testing of Item class methods.
		 */
		System.out.println("***************\n");
		System.out.println("Item Class Tests\n");
		System.out.println("***************\n\n");
		
		/**Testing of Item class Getter and Setter methods.
		 */
		Item a = new Item();
		Item b = new Item("Banana", 0.79, 43621, 25);
		Item c = new Item("Apple", 1.23, 34156, 30);
		a.setBarcode(123446);
		a.setName("Chicken");
		a.setPrice(8.99);
		a.setQuantity(37);
		System.out.println("Getter and Setter Item Tests.\n");
		System.out.println("The barcode of an apple is " + a.getBarcode());
		System.out.println("The name of Item b is " + b.getName());
		System.out.println("The price of an apple is " + c.getPrice());
		System.out.println("The quantity of bananas are " + b.getQuantity());
		
		/**Testing of Item class toString method.
		 */
		System.out.println("\ntoString method test: " + b.toString());
		System.out.println(c.toString());
		
		
		/**Testing of ShoppingCart class methods.
		 */
		ShoppingCart sc = new ShoppingCart("Bob");
		System.out.println("\n\n***************\n");
		System.out.println("Shopping Cart Class Tests\n");
		System.out.println("***************\n\n");
		
		/**Testing of ShoppingCart class isEmpty method.
		 */
		System.out.println("Is the Bob Shopping Cart empty? " + sc.isEmpty());
		sc.add(a);
		sc.add(b);
		sc.add(a);
		sc.add(c);
		sc.add(a);
		System.out.println("Is the Bob Shopping Cart empty after we added items? " + sc.isEmpty());
		
		/**Testing of ShoppingCart add and remove methods
		 * by looking after the size of the shoppping cart before and 
		 * after the method has been run.
		 */
		System.out.println("\nAdd and Remove Method Testing.\n");
		System.out.println("Number of items in cart: " + sc.getCurrentSize());
		System.out.println("Test add Method: " + sc.add(a));
		System.out.println("Number of items in cart: " + sc.getCurrentSize());
		System.out.println("Test remove Method:\n" + sc.remove());
		System.out.println("Number of items in cart: " + sc.getCurrentSize());
		System.out.println("Test remove(Item) Method: " + sc.remove(a));
		System.out.println("Number of items in cart: " + sc.getCurrentSize());

		/**Testing of ShoppingCart contains and getFrequencyOf methods.
		 */
		System.out.println("\nTest Contains and getFrequencyOf Method Testing.\n");
		System.out.println("What is the frequency of Item a? " + sc.getFrequencyOf(a));
		System.out.println("Does the shopping cart contain Item a? " + sc.contains(a));
		
		/**Testing of ShoppingCart getTotalPrice, applyCoupon, and toString, and clear methods.
		 */
		System.out.println("\nTest getTotalPrice, applyCoupon, and toString methods. ");
		System.out.println("Total Price Test: "+ sc.getTotalPrice());
		System.out.println("Test applyCoupon Method: " + sc.applyCoupon(20));
		System.out.println(sc.toString());
		sc.clear();
		System.out.println("Is the shopping cart now empty? " + sc.isEmpty());
		
	
		

	}//end main

}//end class
