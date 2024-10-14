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

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	 *
	 * @param throwable The throwable object to throw sneakily.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Throwable> void sneakyThrow(@NotNull Throwable throwable) throws T {
		throw (T) (throwable);
	}

	/**
	 * An inverted version of {@link Comparator#comparingInt(ToIntFunction)}. From biggest to smallest.
	 *
	 * @param keyExtractor The supplier of the comparing integers.
	 * @return A comparator that compares two values using the {@code keyExtractor} parameter.
	 */
	public static <T> @NotNull Comparator<T> comparingIntReverse(@NotNull ToIntFunction<? super T> keyExtractor) {
		Objects.requireNonNull(keyExtractor);
		return (Comparator<T> & Serializable)
				(c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c2), keyExtractor.applyAsInt(c1));
	}

	/**
	 * Returns an input stream of a resource.<p>
	 * Example usage:
	 * <pre>MiscUtil.resource(new Foo(), "/assets/bar.png");</pre>
	 *
	 * @param instance Any object
	 * @param resourceName The resource name
	 * @return The {@link InputStream} of the corresponding resource.
	 * @throws FileNotFoundException If {@link Class#getResourceAsStream(String)} returns null.
	 */
	public static @NotNull InputStream resource(@NotNull Object instance, @NotNull String resourceName) throws FileNotFoundException {
		InputStream resourceAsStream = instance.getClass().getResourceAsStream(resourceName);

		if (resourceAsStream == null) {
			throw new FileNotFoundException(resourceName);
		}

		return resourceAsStream;
	}

	@Contract("_, _ -> new")
	public static @NotNull InputStreamReader resourceReader(Object instance, String resourceName) throws FileNotFoundException {
		return new InputStreamReader(resource(instance, resourceName));
	}
}
