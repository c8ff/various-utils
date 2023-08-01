package dev.seeight.util.func;

@FunctionalInterface
public interface FloatFunction<T> {
	float apply(T t);
}
