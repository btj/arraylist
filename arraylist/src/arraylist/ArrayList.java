package arraylist;

import java.util.Arrays;

/**
 * Each instance of this class stores a list of integers.
 */
public class ArrayList {
	
	/**
	 * @invar The size is nonnegative and not greater than the length of elements.
	 *     | 0 <= size && size <= elements.length
	 */
	private int[] elements = new int[10];
	private int size;
	
	public int[] getElements() {
		return Arrays.copyOf(elements, size);
	}
	
	/**
	 * Initializes this {@code ArrayList} object so that it stores an empty list of elements.
	 * 
	 * @post This object has no elements
	 *     | getElements().length == 0
	 */
	public ArrayList() {}
	
	/**
	 * Adds the given value to the end of the list stored by this object.
	 * 
	 * <p><b>Performance:</b> This method has worst-case time complexity linear in the number of elements in the list.
	 * However, its <i>amortized</i> time complexity is constant: adding N elements takes time linear in N.
	 * 
	 * @post The number of elements stored by this object is one greater than the old number of elements stored by this object.
	 *     | getElements().length == old(getElements()).length + 1
	 * @post This object's elements are its old elements with the given value added to the end.
	 *     | Arrays.equals(getElements(), 0, old(getElements()).length, old(getElements()), 0, old(getElements()).length)
	 *     | && getElements()[old(getElements()).length] == element
	 */
	public void add(int element) {
		if (size < elements.length) {
			elements[size] = element;
			size++;
		} else {
			int[] newElements = new int[elements.length * 2];
			for (int i = 0; i < elements.length; i++)
				newElements[i] = elements[i];
			newElements[elements.length] = element;
			elements = newElements;
			size++;
		}
	}

}
