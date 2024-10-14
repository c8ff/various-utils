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

/**
 * @author C8FF
 */
public class MathUtil {
	public static int clamp(int value, int min, int max) {
		return Math.max(Math.min(value, max), min);
	}

	public static float clamp(float value, float min, float max) {
		return Math.max(Math.min(value, max), min);
	}

	public static long clamp(long value, long min, long max) {
		return Math.max(Math.min(value, max), min);
	}

	public static double clamp(double value, double min, double max) {
		return Math.max(Math.min(value, max), min);
	}

	public static int wrap(int value, int min, int max) {
		if (value > max) {
			return min;
		} else if (value < min) {
			return max;
		}

		return value;
	}

	public static float wrap(float value, float min, float max) {
		if (value > max) {
			return min;
		} else if (value < min) {
			return max;
		}

		return value;
	}

	public static double wrap(double value, double min, double max) {
		if (value > max) {
			return min;
		} else if (value < min) {
			return max;
		}

		return value;
	}

	public static long wrap(long value, long min, long max) {
		if (value > max) {
			return min;
		} else if (value < min) {
			return max;
		}

		return value;
	}

	public static int getRandomInt(int min, int max) {
		return (int) (Math.random() * (max - min - 1) + min);
	}

	public static int getRandomInt(int min, int max, double random) {
		return (int) (random * (max - min - 1) + min);
	}

	public static float getRandomFloat(float min, float max) {
		return (float) (Math.random() * (max - min - 1) + min);
	}

	public static float getRandomFloat(float min, float max, double random) {
		return (float) (random * (max - min - 1) + min);
	}

	public static double getRandomDouble(double min, double max) {
		return Math.random() * (max - min - 1) + min;
	}

	public static double getRandomDouble(double min, double max, double random) {
		return random * (max - min - 1) + min;
	}

	// From: https://stackoverflow.com/a/51099524
	public static int digitsOf(int n) {
		if (n >= 0) {
			if (n < 10) return 1;
			if (n < 100) return 2;
			if (n < 1000) return 3;
			if (n < 10000) return 4;
			if (n < 100000) return 5;
			if (n < 1000000) return 6;
			if (n < 10000000) return 7;
			if (n < 100000000) return 8;
			if (n < 1000000000) return 9;
			return 10;
		} else {
			if (n > -10) return 2;
			if (n > -100) return 3;
			if (n > -1000) return 4;
			if (n > -10000) return 5;
			if (n > -100000) return 6;
			if (n > -1000000) return 7;
			if (n > -10000000) return 8;
			if (n > -100000000) return 9;
			if (n > -1000000000) return 10;
			return 11;
		}
	}
}
