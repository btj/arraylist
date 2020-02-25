package arraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class ArrayListTest {
	
	static boolean equals(int[] array1, int[] array2) {
		return array1.length == array2.length && IntStream.range(0, array1.length).allMatch(i -> array1[i] == array2[i]);
	}

	@Test
	void test() {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		assert equals(new int[] {10, 20}, list.getElements());
	}

}
