/*
 * various-utils
 * Copyright (C) 2024 c8ff
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.seeight.util;

import dev.seeight.util.func.BooleanFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static void push(float[] array, float value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static void push(float[] array, float value, int index) {
		float previous = value;
		for (int i = index; i < array.length; i++) {
			float temp = previous;
			previous = array[i];
			array[i] = temp;
		}
	}

	/**
	 * Pushes a value to the array from index 0.
	 */
	public static void push(double[] array, double value) {
		push(array, value, 0);
	}

	/**
	 * Pushes a value to the array from the specified index.
	 */
	public static void push(double[] array, double value, int index) {
		double previous = value;
		for (int i = index; i < array.length; i++) {
			double temp = previous;
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

	public static int[] intRange(int start, int end) {
		if (start > end) {
			throw new IllegalArgumentException("start cannot be bigger than end.");
		}

		if (start == end) {
			return new int[] { start };
		}

		int[] r = new int[end - start];
		for (int i = 0, l = start; i < r.length; i++, l++) {
			r[i] = l;
		}
		return r;
	}

	public static <T> List<T> copyOfFiltered(List<T> original, Predicate<T> predicate) {
		if (original.isEmpty()) return original;

		var newList = new ArrayList<T>(original.size());

		for (T t : original) {
			if (predicate.test(t)) {
				newList.add(t);
			}
		}

		return newList;
	}

	/**
	 * Converts a list of elements into another type using a transformer.
	 * @param original The original method
	 * @param transformer Converts an instance of type {@link A} into an instance of type {@link B}. If this function returns null, the value will be not added.
	 */
	public static <A, B> List<B> adapt(List<A> original, Transformer<A, B> transformer) {
		if (original.isEmpty()) return new ArrayList<>();
		var newList = new ArrayList<B>(original.size());
		for (A a : original) {
			B b = transformer.transform(a);
			if (b == null) continue;
			newList.add(b);
		}
		return newList;
	}

	/**
	 * Converts a list of elements into another array using a transformer.
	 * @param original The original method
	 * @param transformer Converts an instance of type {@link A} into an instance of type {@link B}. If this function returns null, the value will be not added.
	 */
	@SuppressWarnings("unchecked")
	public static <A, B> B[] adaptArray(List<A> original, B[] dest, Transformer<A, B> transformer) {
		if (original.isEmpty()) return dest;
		if (dest.length < original.size()) {
			dest = (B[]) Arrays.copyOf(dest, original.size(), dest.getClass());
		}

		int i = 0;
		for (A t : original) {
			B b = transformer.transform(t);
			if (b == null) continue;
			dest[i++] = b;
		}

		if (i >= original.size()) return dest;
		return (B[]) Arrays.copyOf(dest, i, dest.getClass());
	}

	public interface Transformer<A, B> {
		@Nullable B transform(A a);
	}

	public static <T> T findFirst(T[] arr, @NotNull Predicate<T> predicate, @Nullable T defaultValue) {
		for (T t : arr)
			if (predicate.test(t)) return t;

		return defaultValue;
	}

	public static <T> T findFirst(List<T> arr, @NotNull Predicate<T> predicate, @Nullable T defaultValue) {
		for (T t : arr)
			if (predicate.test(t)) return t;

		return defaultValue;
	}

	public static <A, B> @Nullable B findFirstTransformed(A[] arr, @NotNull Function<A, B> predicate) {
		for (A a : arr) {
			B b = predicate.apply(a);
			if (b != null) {
				return b;
			}
		}
		return null;
	}

	public static <A, B> @Nullable B findFirstTransformed(List<A> arr, @NotNull Function<A, B> predicate) {
		for (A a : arr) {
			B b = predicate.apply(a);
			if (b != null) {
				return b;
			}
		}
		return null;
	}
}
