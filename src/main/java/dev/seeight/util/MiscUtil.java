package dev.seeight.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.ToIntFunction;

/**
 * Miscellaneous utilities.
 */
public class MiscUtil {
	/**
	 * Throws an exception as-is, without wrapping it in a {@link RuntimeException}
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
		throw (T) (throwable);
	}

	/**
	 * An inverted version of {@link Comparator#comparingInt(ToIntFunction)}. From biggest to smallest.
	 */
	public static <T> Comparator<T> comparingIntReverse(ToIntFunction<? super T> keyExtractor) {
		Objects.requireNonNull(keyExtractor);
		return (Comparator<T> & Serializable)
				(c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c2), keyExtractor.applyAsInt(c1));
	}
}
