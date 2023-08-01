package dev.seeight.util.func;

@FunctionalInterface
public interface DoubleFunction<T> {
	double apply(T t);
}
