package com.github.assisstion.ModulePack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An iterator that iterates over a Tuple
 *
 * @author Markus Feng
 *
 * @param <T> the type of the Tuple to iterate
 */
public class TupleIterator<T> implements Iterator<T>{

	protected Tuple<T> iterable;
	protected int index = 0;
	protected int size = 0;

	/**
	 * Creates a TupleIterator with the given Tuple
	 * @param tuple the Tuple to iterate over
	 */
	public TupleIterator(Tuple<T> tuple){
		iterable = tuple;
		size = tuple.getSize();
	}

	@Override
	public boolean hasNext(){
		return index < size;
	}

	@Override
	public T next(){
		if(!hasNext()){
			throw new NoSuchElementException("No element exists");
		}
		return iterable.getValueAt(index++);
	}

}
