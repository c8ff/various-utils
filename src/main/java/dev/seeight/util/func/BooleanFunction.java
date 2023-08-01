package dev.seeight.util.func;

@FunctionalInterface
public interface BooleanFunction<T> {
	boolean apply(T t);
}