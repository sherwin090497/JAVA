public interface MyList<E> {

    public boolean add(E e);
    public boolean add(int index, E e);
    public void clear();
    public boolean contains(E e);
    public E get(int index);
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOf(E e);
    public E remove(int index);
    public void trimToSize();
    public int size();
}