package arraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class ArrayListTest {
	
	@Test
	void test() {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		assert Arrays.equals(new int[] {10, 20}, list.getElements());
	}

}
