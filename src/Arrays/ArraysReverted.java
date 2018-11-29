package Arrays;

//Complete the method in this class. It returns a string with the elements of the array
//in reverse order separated by a space. If the array looks like this [1, 2 ,3 ,4], your
//output will look like this:
//4 3 2 1 

public class ArraysReverted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysReverted test = new ArraysReverted();
		System.out.println(test.inReverse(new int[] { 1, 2, 3, 4 }));
		System.out.println(test.inReverseFor(new int[] { 1, 2, 3, 4 }));

	}

	/**
	 * Returns a string with the elements of the array in reverse order separated by
	 * a space
	 * 
	 * @param values the array to reverse
	 * @return the string containing the elements in reverse order
	 */

	//Con el for each
	public String inReverse(int[] values) {

		String message = "";
		for (int current : values) { // finish the loop header
			// TODO: concatenate the elements to message in reverse order
			// int num = values[values.length - current];
			
			message = current + " " + message;
		}
		return message;
	}

	// Lo mismo pero hecho con un for normal
	public String inReverseFor(int[] values) {

		String message = "";
		for (int i = values.length - 1; i >= 0; i--) { // finish the loop header
			// TODO: concatenate the elements to message in reverse order

			message += (values[i] + " ");
		}
		return message;
	}

}
