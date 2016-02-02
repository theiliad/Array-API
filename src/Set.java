/*	Student Information
 *	-------------------	
 *	Student Name: 		Eliad Moosavi
 *	Student Number: 	001319311
 *	Course Code:		CS/SE 2XB3	
 *	Lab Section: 		03
 * 	
 *	I attest that the following code being submitted is my own individual work.
*/

import java.util.*; // Import library

public class Set { // Class initialization
	
	private ArrayList<String> stringArray = new ArrayList<String>();
	// Private ArrayList to enable encapsulation
	
	public Set (ArrayList<String> inputArray) { // Constructor, taking in an ArrayList
		stringArray = inputArray;
		// Setting that passed ArrayList to our private variable
	}
	
	public Set () { // Destructor
	}
	
	public Set Union(Set secondSet) { // Public method, taking in another Set to compare and process
		
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		ArrayList<String> unionOfBoth = new ArrayList<String>();
		// New ArrayList to hold the final values
		
		for (int i=0; i < 10; i++) {
			if (firstArray.size() > i) {
				if (unionOfBoth.contains(firstArray.get(i)) == false && firstArray.get(i).equals("emptyElement") == false) {
					unionOfBoth.add(firstArray.get(i));
					// If our final ArrayList does not already contain the element, and the item is not an empty string
					// (Does not contain the phrase "emptyElement"), then add it to our final ArrayList
				}
				else if (unionOfBoth.contains(firstArray.get(i)) == false && firstArray.get(i).equals("emptyElement")) {
					unionOfBoth.add("");
					// If our final ArrayList does not already contain the element, but the item is an empty string
					// (Does contain the phrase "emptyElement"), then add an empty string to our final ArrayList
				}
			}
			
			if (secondArray.size() > i) {
				if (unionOfBoth.contains(secondArray.get(i)) == false && secondArray.get(i).equals("emptyElement") == false) {
					unionOfBoth.add(secondArray.get(i));
					// If our final ArrayList does not already contain the element, and the item is not an empty string
					// (Does not contain the phrase "emptyElement"), then add it to our final ArrayList
				}
				else if (unionOfBoth.contains(secondArray.get(i)) == false && secondArray.get(i).equals("emptyElement")) {
					unionOfBoth.add("");
					// If our final ArrayList does not already contain the element, but the item is an empty string
					// (Does contain the phrase "emptyElement"), then add an empty string to our final ArrayList
				}
			}
		}
		
		Set unionReturn = new Set(unionOfBoth); // Initiate a Set object from out final ArrayList
		
		return unionReturn; // Return the final Set Object
	}
	
	public Set Intersection(Set secondSet) { // Public method, taking in another Set to compare and process
			
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		ArrayList<String> intersectionOfBoth = new ArrayList<String>();
		// New ArrayList to hold the final values
		
		for (int i=0; i < firstArray.size(); i++) {
			if (secondArray.contains(firstArray.get(i)) && intersectionOfBoth.contains(firstArray.get(i)) == false) {
				intersectionOfBoth.add(firstArray.get(i));
				// If our second array contains that same element from our first array, and the final ArrayList
				// does not already contain that element, then add it to our final ArrayList
			}
		}
				
		Set intersectionReturn = new Set(intersectionOfBoth); // Initiate a Set object from our final ArrayList
		
		return intersectionReturn; // Return our Set Object
	}
	
	public Set Difference(Set secondSet) { // Public method, taking in another Set to compare and process
		
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		ArrayList<String> differenceOfBoth = new ArrayList<String>();
		// New ArrayList to hold the final values
		
		for (int i=0; i < firstArray.size(); i++) {
			if (secondArray.contains(firstArray.get(i)) == false && differenceOfBoth.contains(firstArray.get(i)) == false &&  firstArray.get(i).equals("emptyElement") == false) {
				differenceOfBoth.add(firstArray.get(i));
				// If our second array does not contain that same element as our first array, our final ArrayList does not already contain the element, and the element is not
				// an empty string (A string containing the phrase "emptyElement"), then add the element to our final ArrayList
			}
			
			if (secondArray.contains(firstArray.get(i)) == false && differenceOfBoth.contains(firstArray.get(i)) == false &&  firstArray.get(i).equals("emptyElement")) {
				differenceOfBoth.add("");
				// If our second array does not contain that same element as our first array, our final ArrayList does not already contain the element, and the element is
				// an empty string (A string containing the phrase "emptyElement"), then add an empty string to our final ArrayList
			}
		}
				
		Set differenceReturn = new Set(differenceOfBoth); // Initiate a Set object from our final ArrayList
		
		return differenceReturn; // Return the final Set Object
	}
	
	public Set Product(Set secondSet) { // Public method, taking in another Set to compare and process
		
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		ArrayList<String> productOfBoth = new ArrayList<String>();
		// New ArrayList to hold the final values
		
		for (int i=0; i < firstArray.size(); i++) {
			for (int j=0; j < secondArray.size(); j++) {
				if (firstArray.get(i).equals("emptyElement") == false && secondArray.get(j).equals("emptyElement") == false) {
					productOfBoth.add(firstArray.get(i)+secondArray.get(j));
					// If the both indices of our first and second array we are calling are not empty strings (Strings containing
					// the phrase "emptyElement"), then add both items concatinated together
				}
			}
		}
		
		Set productReturn = new Set(productOfBoth); // Initiate a Set object from our final ArrayList
		
		return productReturn; // Return the final Set Object
		
	}
	
	public boolean isEqual(Set secondSet) { // Public method, taking in another Set to compare and process
		
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		
		for (int i=0; i < firstArray.size(); i++) {
			if (secondArray.contains(firstArray.get(i)) == false) return false;
			// If our second array does not contain that same element as our first array, return false
		}
		
		for (int i=0; i < secondArray.size(); i++) {
			if (firstArray.contains(secondArray.get(i)) == false) return false;
			// If our first array does not contain that same element as our second array, return false
		}
		
		return true;
	}
	
	public boolean isSubset(Set secondSet) { // Public method, taking in another Set to compare and process
		
		ArrayList<String> firstArray = noDuplicates(stringArray);
		// Taking out duplications out of our sets by calling the noDuplicates private function
		ArrayList<String> secondArray = noDuplicates(secondSet.returnArray());
		
		
		for (int i=0; i < firstArray.size(); i++) {
			if (secondArray.contains(firstArray.get(i)) == false) return false;
			// If our second array does not contain even one element that our first array does, return false
		}
		
		return true;
	}
	
	public int getCount() { // Public method taking in only the our private ArrayList
		return stringArray.size();
	}
	
	public int getCardinality() { // Public method taking in only the our private ArrayList
		return noDuplicates(stringArray).size();
	}
	
	public String toString() { // Public method taking in only the our private ArrayList
		String temp = "{"; // String declaration
		
		for(int i=0; i < stringArray.size(); i++) {
			if (stringArray.get(i).equals("emptyElement") == false) {
			// If the element is not an empty string (a string that contains the phrase "emptyElement")
				if (i < stringArray.size()-1) temp += stringArray.get(i) + ", "; // If the last item, do add commas in between
				else temp += stringArray.get(i); // If the last item, only add the string and not a comma
			}
			
			if (stringArray.get(i).equals("emptyElement")) {
			// If the element is an empty string (a string that contains the phrase "emptyElement")
				if (i < stringArray.size()-1) temp += ", "; // If the last item, then do not add a comma
			}
		}
		
		temp += "}"; // Concatenate to string
		
		return temp; // Return the final string
	}
	
	ArrayList<String> returnArray() { // Public method taking in only the our private ArrayList
		return stringArray; // Return just the array and not the Set object
	}
	
	private ArrayList<String> noDuplicates (ArrayList<String> haystack) { // Private function
		ArrayList<String> temp = new ArrayList<String>(); // ArrayList variable declaration
		
		for (int i=0; i < haystack.size(); i++) { // For every element in our passed in ArrayList
			if (temp.contains(haystack.get(i)) == false) { // If it already exists in our final ArrayList, do not add it
				temp.add(haystack.get(i)); // If it does not, then add
			}
		}
		
		return temp; // Return the final ArrayList
	}

}
