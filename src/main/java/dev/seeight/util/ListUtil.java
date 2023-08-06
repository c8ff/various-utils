package dev.seeight.util;

import dev.seeight.util.func.BooleanFunction;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class ListUtil {
	public static <A, B> boolean contains(ArrayList<A> list, Function<A, B> type, B value) {
		for (A a : list) {
			if (value.equals(type.apply(a))) {
				return true;
			}
		}

		return false;
	}

	public static <T> void addAll(List<T> originList, List<T> targetList, BooleanFunction<T> filter) {
		for (T t : originList) {
			if (filter.apply(t)) {
				targetList.add(t);
			}
		}
	}

	public static <T> boolean contains(T[] array, T value) {
		if (value == null || array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			T it = array[i];
			if (value.equals(it)) {
				return true;
			}
		}

		return false;
	}

	public static boolean contains(int[] array, int value) {
		if (array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			int it = array[i];
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	public static boolean contains(float[] array, float value) {
		if (array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			float it = array[i];
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	public static boolean contains(long[] array, long value) {
		if (array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			long it = array[i];
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	public static boolean contains(byte[] array, byte value) {
		if (array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			long it = array[i];
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	public static boolean contains(char[] array, char value) {
		if (array == null) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			char it = array[i];
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	public static <T> boolean contains(List<T> list, T value) {
		if (value == null || list == null) {
			return false;
		}

		for (int i = 0; i < list.size(); i++) {
			T it = list.get(i);
			if (value == it) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Pushes a value to the list from index 0. This method does not change the list size.
	 */
	public static <T> void push(List<T> list, T value) {
		push(list, value, 0);
	}

	/**
	 * Pushes a value to the list from the specified index. This method does not change the list size.
	 */
	public static <T> void push(List<T> list, T value, int index) {
		T previous = value;
		for (int i = index; i < list.size(); i++) {
			T temp = previous;
			previous = list.get(i);
			list.set(i, temp);
		}
	}

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static <T> void push(T[] array, T value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static <T> void push(T[] array, T value, int index) {
		T previous = value;
		for (int i = index; i < array.length; i++) {
			T temp = previous;
			previous = array[i];
			array[i] = temp;
		}
	}

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static void push(int[] array, int value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static void push(int[] array, int value, int index) {
		int previous = value;
		for (int i = index; i < array.length; i++) {
			int temp = previous;
			previous = array[i];
			array[i] = temp;
		}
	}

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static void push(char[] array, char value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static void push(char[] array, char value, int index) {
		char previous = value;
		for (int i = index; i < array.length; i++) {
			char temp = previous;
			previous = array[i];
			array[i] = temp;
		}
	}

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static void push(long[] array, long value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static void push(long[] array, long value, int index) {
		long previous = value;
		for (int i = index; i < array.length; i++) {
			long temp = previous;
			previous = array[i];
			array[i] = temp;
		}
	}

	public static <T> int indexOf(List<T> array, T value) {
		if (value == null || array == null) {
			return -1;
		}

		for (int i = 0; i < array.size(); i++) {
			T it = array.get(i);
			if (value.equals(it)) {
				return i;
			}
		}

		return -1;
	}

	public static <T> int indexOf(T[] array, T value) {
		if (value == null || array == null) {
			return -1;
		}

		for (int i = 0; i < array.length; i++) {
			T it = array[i];
			if (value.equals(it)) {
				return i;
			}
		}

		return -1;
	}

	public static int indexOf(int[] array, int value) {
		if (array == null) {
			return -1;
		}

		for (int i = 0; i < array.length; i++) {
			int it = array[i];
			if (value == it) {
				return i;
			}
		}

		return -1;
	}

	public static <T> int lastIndexOf(List<T> array, T value) {
		if (array == null) {
			return -1;
		}

		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i) == value) {
				return i;
			}
		}

		return -1;
	}

	public static <T> int lastIndexOf(T[] array, T value) {
		if (array == null) {
			return -1;
		}

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == value) {
				return i;
			}
		}

		return -1;
	}

	public static <T> @Nullable T getLast(T[] array) {
		return getLastOrDefault(array, null);
	}

	public static <T> @Nullable T getLastOrDefault(T[] array, @Nullable T defaultValue) {
		if (array.length == 0) {
			return defaultValue;
		}

		return array[array.length - 1];
	}

	public static <T> @Nullable T getFirst(T[] array) {
		return getFirstOrDefault(array, null);
	}

	public static <T> @Nullable T getFirstOrDefault(T[] array, T defaultValue) {
		if (array.length == 0) {
			return defaultValue;
		}

		return array[0];
	}

	public static <T> @Nullable T getOrDefault(T[] array, int index, T defaultValue) {
		if (index >= array.length) {
			return defaultValue;
		}

		return array[index];
	}
}
