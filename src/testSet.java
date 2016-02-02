/*	Student Information
 *	-------------------	
 *	Student Name: 		Eliad Moosavi
 *	Student Number: 	001319311
 *	Course Code:		CS/SE 2XB3	
 *	Lab Section: 		03
 * 	
 *	I attest that the following code being submitted is my own individual work.
*/

import java.io.File; // Import various libraries
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testSet { // Class initialization
	
	private static ArrayList<ArrayList<ArrayList<String>>> haystack = new ArrayList<ArrayList<ArrayList<String>>>();
	// private 3D Array initialization to enable encapsulation
	
	public testSet (ArrayList<ArrayList<ArrayList<String>>> input3dArray) {
	// Class constructor initialization, passing in our 3D array
		
		haystack = input3dArray;
		// Letting our passed in array equal to our private array
	}
	
	public static void testUnion() { // public method initialization taking in our object with no return
		writeToFile("Entering testUnion...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) { // for every item in our passed in array
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			ArrayList<String> unionResult = (setOne.Union(setTwo)).returnArray();
			// Creating a new ArrayList to store the array our Union method returns from the Set class for our two Set Objects
															
			if(haystack.get(i).get(2).toString().replace("emptyElement", "").equals(unionResult.toString())) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(2).toString().replace("emptyElement", "").equals(unionResult.toString()) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestUnion complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testIntersection() { // public method initialization taking in our object with no return
		writeToFile("Entering testIntersection...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) {
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			ArrayList<String> intersectionResult = (setOne.Intersection(setTwo)).returnArray();
			// Creating a new ArrayList to store the array our Intersection method returns from the Set class for our two Set Objects
			
			if(haystack.get(i).get(3).toString().equals(intersectionResult.toString())) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(3).toString().equals(intersectionResult.toString()) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestIntersection complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testDifference() { // public method initialization taking in our object with no return
		writeToFile("Entering testDifference...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) {
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			ArrayList<String> differenceResult = (setOne.Difference(setTwo)).returnArray();
			// Creating a new ArrayList to store the array our Difference method returns from the Set class for our two Set Objects
									
			if(haystack.get(i).get(4).toString().replace("emptyElement", "").equals(differenceResult.toString())) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(4).toString().replace("emptyElement", "").equals(differenceResult.toString()) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestDifference complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testProduct() { // public method initialization taking in our object with no return
		writeToFile("Entering testProduct...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) {
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			ArrayList<String> productResult = (setOne.Product(setTwo)).returnArray();
			// Creating a new ArrayList to store the array our Product method returns from the Set class for our two Set Objects
						
			if(haystack.get(i).get(5).toString().equals(productResult.toString())) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(5).toString().equals(productResult.toString()) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestProduct complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testIsEqual() { // public method initialization taking in our object with no return
		writeToFile("Entering testIsEqual...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) {
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			boolean isEqualResult = setOne.isEqual(setTwo);
			// Creating a new boolean to store the boolean value our isEqual method returns from the Set class for our two Set Objects
			
			if(haystack.get(i).get(6).get(0).equals(Boolean.toString(isEqualResult))) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(6).get(0).equals(Boolean.toString(isEqualResult)) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestIsEqual complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testIsSubset() { // public method initialization taking in our object with no return
		writeToFile("Entering testIsSubset...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) { // for every item in our passed in array to the object in our class
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			Set setTwo = new Set(haystack.get(i).get(1));
			// Create set object, taking in our second set from the test case
			
			boolean isSubsetResult = setOne.isSubset(setTwo);
			// Creating a new boolean to store the boolean value our isSubset method returns from the Set class for our two Set Objects
			
			if(haystack.get(i).get(7).get(0).equals(Boolean.toString(isSubsetResult))) {
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(7).get(0).equals(Boolean.toString(isSubsetResult)) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestIsSubset complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testGetCount() { // public method initialization taking in our object with no return
		writeToFile("Entering testGetCount...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) { // for every item in our passed in array to the object in our class
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			int getCountResult = setOne.getCount();
			// Creating a new integer to store the number our getCount method returns from the Set class for our Set Object
						
			if(haystack.get(i).get(8).get(0).equals(Integer.toString(getCountResult))) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(8).get(0).equals(Integer.toString(getCountResult)) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestGetCount complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testGetCardinality() { // public method initialization taking in our object with no return
		writeToFile("Entering testGetCardinality...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) { // for every item in our array passed into our object in our class
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			int getCardinalityResult = setOne.getCardinality();
			// Creating a new integer to store the number our getCardinality method returns from the Set class for our Set Object
			
			if(haystack.get(i).get(9).get(0).equals(Integer.toString(getCardinalityResult))) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (haystack.get(i).get(9).get(0).equals(Integer.toString(getCardinalityResult)) == false) { // If the result retrieved is NOT what we expected
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestGetCardinality complete.\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static void testToString() { // public method initialization taking in our object with no return
		writeToFile("Entering testToString...\n"); // Calling the writeToFile which writes a string to the file and also prints it on the screen
		
		for (int i=0; i < haystack.size(); i++) {
			Set setOne = new Set(haystack.get(i).get(0));
			// Create set object, taking in our first set from the test case
			
			String toStringResult = setOne.toString();
			// call the toString method from our Set class for the setOne object we created and storing the result in a variable
			
			String filteredInput = haystack.get(i).get(10).toString().replace("[", "").replace("]", "").replace("emptyElement", "");
			// 
			
			if(filteredInput.equals(toStringResult)) { // If the result retrieved is the same as the expected result in our input.txt
				writeToFile("Test case " + (i+1) + " Passed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
			else if (filteredInput.equals(toStringResult) == false) {
				writeToFile("Test case " + (i+1) + " Failed."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
			}
		}
		
		writeToFile("\ntestToString complete."); // Calling the writeToFile which writes a string to the file and also prints it on the screen
	}
	
	public static ArrayList<String> readFile(String filePath) throws FileNotFoundException {
		// Public function, taking in a string and throwing a file not found exception
		
		Scanner fileContents = new Scanner(new File(filePath)); // Initiating a new Scanner object
		ArrayList<String> finalArray = new ArrayList<String>(); // Creating an ArrayList to hold all lines of our file
		
		while (fileContents.hasNextLine()){ // While there are more lines to go
			finalArray.add(fileContents.nextLine()); // Add the line to our array
		}	
		
		fileContents.close(); // Close the file
		
		return finalArray; // Return the final ArrayList
	}
	
	public static void writeToFile(String result) { // Public function taking in a string
		System.out.println(result); // Print to screen
		
		try{ // Try doing this
			FileWriter f = new FileWriter("output.txt", true); // Open a FileWriter session, with append mode on
			f.write(result + "\n"); // Write our passed in string to file, making a new line after
			f.close(); // Close file
		}
		
		catch(Exception e){ // Catch exception and pass it to the variable e
			e.printStackTrace(); 
		}
	}

	public static void main(String[] args) throws FileNotFoundException { // Public main function throwing a file not found exception
		
		ArrayList<String> fileLines = readFile("input.txt"); // Get the ArrayList of all lines of our textfile from the readFile function and store into our ArrayList variable
				
		ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>(); // Initializing a 2D Array
		
		for (int i=0; i < fileLines.size(); i++) { // For each line of our input.txt file
			ArrayList<String> temporary = new ArrayList<String>(Arrays.asList(fileLines.get(i).split("-*-")));
			items.add(temporary);
			
			// Distinguish all elements that have "-*-" in between, create an array with each as an element, and add to the items ArrayList
		}
				
		ArrayList<ArrayList<ArrayList<String>>> parsedInput = new ArrayList<ArrayList<ArrayList<String>>>();
		// Initializing a 3D array to hold the final values
		
		for (int i = 0; i < items.size(); i++) { // For each line of our text file
			ArrayList<ArrayList<String>> innerLayer = new ArrayList<ArrayList<String>> ();
			// Create a temporary 2D array
			
			for (int j = 0; j < items.get(i).size(); j++) { // For each array inside of each line
				if (items.get(i).get(j).equals("*") == false && items.get(i).get(j).equals("[null]") == false) {
				// If the array is not equal to * or [null] (A supposed empty string)
					
					String itemWithoutBrackets = items.get(i).get(j);
					// Pass that string content of the array to itemWithoutBrackets to be processed into an actual array later
					
					if(items.get(i).get(j).equals("[,]") == false) {
						itemWithoutBrackets = (items.get(i).get(j).replace("[", "")).replace("]", "").replaceAll("\\s+","");
						// If our future array is not equal to an array with two empty strings, then reformat it by taking out the square brackets,
						// And removing all whitespace
					}
					else if (items.get(i).get(j).equals("[,]")) {
						// If our future array is equal to an array with two empty strings, then reformat it to "emptyElement,emptyElement"
						itemWithoutBrackets = "emptyElement,emptyElement";
					}
					if(itemWithoutBrackets.charAt(0) == ',') { // If the very first letter of the string we are processing into an array
						// Is a comma, then replace the comma with "emptyElement,"
						itemWithoutBrackets = "emptyElement," + itemWithoutBrackets.substring(1);
					}
					if(itemWithoutBrackets.charAt(itemWithoutBrackets.length()-1) == ',') {
						// If the very last letter of the string we are processing into an array is s a comma, then append "emptyElement"
						itemWithoutBrackets = itemWithoutBrackets + "emptyElement";
					}
					if(itemWithoutBrackets.contains(",,")) { // If the string contains ",,"
						itemWithoutBrackets = itemWithoutBrackets.replace(",,", ",emptyElement,");
						// Reformat to distinguish the empty strings
					}
					ArrayList<String> temp = new ArrayList<String>(Arrays.asList(itemWithoutBrackets.split(",")));
					
					// Turn the string into an ArrayList, taking elements separated by commas as separate elements of the ArrayList
										
					innerLayer.add(temp);
					// Add the ArrayList to our temporary 2D Array
				}
				
				if (items.get(i).get(j).equals("[null]")) { // If the string we are trying to process as an array is a supposed empty array
					ArrayList<String> temp = new ArrayList<String>(Arrays.asList());
					// Create an empty ArrayList
					
					innerLayer.add(temp);
					// Add the ArrayList to our temporary 2D Array
				}
				
			}
			
			parsedInput.add(innerLayer);
			// Add our 2D array as an element of our final 3D Array
			
		}
		
		testSet newTestSet = new testSet(parsedInput); // Initiating a testSet object taking in our 3dArray
		
		File fileToDelete = new File("output.txt"); // Load our output.txt
		fileToDelete.delete(); // Delete to have new results written to it
		
		newTestSet.testUnion(); // Calling various methods from out testSet on our testSet object
		newTestSet.testIntersection();
		newTestSet.testDifference();
		newTestSet.testProduct();
		newTestSet.testIsEqual();
		newTestSet.testIsSubset();
		newTestSet.testGetCount();
		newTestSet.testGetCardinality();
		newTestSet.testToString();
	}

}
