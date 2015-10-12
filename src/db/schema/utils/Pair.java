/**
 * 
 */
package db.schema.utils;

public class Pair<A, B> {
	public A first;

	public B second;

	public Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return "(" + first.toString() + "," + second.toString() + ")";
	}
}