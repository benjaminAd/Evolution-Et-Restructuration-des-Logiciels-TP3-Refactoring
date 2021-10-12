package extract.onebyone;

interface IQueueAvecPriorite {

	boolean add(Object o);

	boolean isEmpty();

	Object peek();

	Object poll();

	Object comparator();

}