/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/peeking-iterator/
 */
 
// Java Iterator interface reference:
 // https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
   private boolean hasPeeked=false;
	 private Integer element=null;
	 private Iterator <Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!hasPeeked){
            element=iterator.next();
            hasPeeked=true;
            return element;
        }
        else
        return element;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!hasPeeked){
	        return iterator.next();
	    }
	    else{
	        hasPeeked=false;
	        return element;
	    }
	}

	@Override
	public boolean hasNext() {
	    return hasPeeked || iterator.hasNext();
	}
}
