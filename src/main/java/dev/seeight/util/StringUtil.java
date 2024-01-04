package dev.seeight.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringUtil {
	public static int numberToCharacters(int num, int start, char[] chars) {
		if (num == 0) {
			chars[start] = '0';
			return 1;
		}

		boolean negative = num < 0;

		int charsLength = MathUtil.digitsOf(num);

		// define '-' at the start of the chars, and invert num if it's negative (if I don't it breaks badly lol)
		int n;
		if (negative) {
			chars[start] = '-';
			n = -num;
		} else {
			n = num;
		}

		// append digits to the array
		int i = start + charsLength;
		while (n > 0) {
			int r = n % 10;
			chars[--i] = (char) ('0' + r);
			n = n / 10;
		}

		return charsLength;
	}

	public static char[] numberToCharacters(int num) {
		if (num == 0) {
			return new char[] { '0' };
		}

		boolean negative = num < 0;

		int charsLength = MathUtil.digitsOf(num);
		char[] c = new char[charsLength];

		// define '-' at the start of the chars, and invert num if it's negative (if I don't it breaks badly lol)
		int n;
		if (negative) {
			c[0] = '-';
			n = -num;
		} else {
			n = num;
		}

		// append digits to the array
		int i = c.length;
		while (n > 0) {
			int r = n % 10;
			c[--i] = (char) ('0' + r);
			n = n / 10;
		}

		return c;
	}

	public static @NotNull String exclude(@NotNull String string, char character) {
		StringBuilder output = new StringBuilder();

		for (char c : string.toCharArray()) {
			if (c != character) {
				output.append(c);
			}
		}

		return output.toString();
	}

	@SafeVarargs
	public static <T> @NotNull String join(String delimiter, T... array) {
		if (delimiter == null) {
			throw new NullPointerException("Delimiter is null.");
		}
		if (array == null) {
			throw new NullPointerException("List is null.");
		}

		StringJoiner joiner = new StringJoiner(delimiter);
		for (T value : array) {
			joiner.add(String.valueOf(value));
		}

		return joiner.toString();
	}

	public static <T> @NotNull String join(String delimiter, ArrayList<T> list) {
		if (delimiter == null) {
			throw new NullPointerException("Delimiter is null.");
		}
		if (list == null) {
			throw new NullPointerException("List is null.");
		}

		StringJoiner joiner = new StringJoiner(delimiter);
		for (T value : list) {
			joiner.add(String.valueOf(value));
		}

		return joiner.toString();
	}

	public static @Range(from = 0, to = Integer.MAX_VALUE) int count(@NotNull String string, char character) {
		return count(string.toCharArray(), character);
	}

	public static @Range(from = 0, to = Integer.MAX_VALUE) int count(char @NotNull [] string, char character) {
		int count = 0;

		for (char c : string) {
			if (c == character) {
				count++;
			}
		}

		return count;
	}

	public static @NotNull String substringFromIndexOf(@NotNull String string, @NotNull String matchString) {
		int indexOf = string.indexOf(matchString);

		if (indexOf >= 0) {
			return string.substring(indexOf + 1);
		}

		return string;
	}

	public static @NotNull String substringToIndexOf(@NotNull String string, @NotNull String matchString) {
		int indexOf = string.indexOf(matchString);

		if (indexOf >= 0) {
			return string.substring(0, indexOf);
		}

		return string;
	}

	public static @NotNull String substringFromLastIndexOf(@NotNull String string, @NotNull String matchString) {
		int lastIndexOf = string.lastIndexOf(matchString);

		if (lastIndexOf >= 0) {
			return string.substring(lastIndexOf + 1);
		}

		return string;
	}

	public static @NotNull String substringToLastIndexOf(@NotNull String string, @NotNull String matchString) {
		int lastIndexOf = string.lastIndexOf(matchString);

		if (lastIndexOf >= 0) {
			return string.substring(0, lastIndexOf);
		}

		return string;
	}

	public static int[] parseInt(String... strings) {
		int[] integers = new int[strings.length];

		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			integers[i] = Integer.parseInt(string);
		}

		return integers;
	}

	public static boolean isOnlyDigits(@NotNull String string) {
		return isOnlyDigits(string.toCharArray());
	}

	@Contract(pure = true)
	public static boolean isOnlyDigits(char @NotNull [] chars) {
		for (char c : chars) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;
	}
}
