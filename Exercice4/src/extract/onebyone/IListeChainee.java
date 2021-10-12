package extract.onebyone;

interface IListeChainee {

	boolean add(Object o);

	boolean isEmpty();

	Object get(int i);

	Object peek();

	Object poll();

}