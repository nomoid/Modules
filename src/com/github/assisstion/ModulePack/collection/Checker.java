package com.github.assisstion.ModulePack.collection;

import java.util.function.Function;

public interface Checker<T>{
	Function<T, Boolean> getChecker();
	default boolean check(T t){
		return getChecker().apply(t);
	}
}
