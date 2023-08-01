package dev.seeight.util.func;

@FunctionalInterface
public interface BiSupplier<T, D> {
	D get(T t);
}
