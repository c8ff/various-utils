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
}
