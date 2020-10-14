
public class MyVector<E> extends MyAbstractList<E> implements MyList<E> {
    private int initialCapacity = 10;
    private E[] data = (E[]) new Object[initialCapacity];

    private int capacityIncrement = size*2+5;

    public MyVector() {

    }

    public MyVector(int size) {
        initialCapacity = size;
        data = (E[]) new Object[size];
    }

    public MyVector(int size, int incrementCapacity) {
        initialCapacity = size;
        this.capacityIncrement = incrementCapacity;
        data = (E[]) new Object[size];
    }

    public boolean add(E e) {
        return add(size, e);
    }

    public boolean add(int index, E e) {
        checkCapacity();

        // Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        // Insert new element to data[index]
        data[index] = e;

        // Increase size by 1
        size++;
        return true;
    }

    private void checkCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[getIncrement()]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int getIncrement() {
        capacityIncrement= size * 2+5;
        return capacityIncrement;
    }

    /** Clear the list */
    public void clear() {
        data = (E[]) new Object[initialCapacity];
        size = 0;
    }

    /** Return true if this list contains the element */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;

        return false;
    }

    /** Return the element from this list at the specified index */
    public E get(int index) {
        return data[index];
    }

    /**
     * Return the index of the first matching element in this list. Return -1 if no
     * match.
     */
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return i;

        return -1;
    }

    /**
     * Return the index of the last matching element in this list Return -1 if no
     * match.
     */
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--)
            if (e.equals(data[i]))
                return i;

        return -1;
    }

    public E remove(int index) {
        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;

        return e;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1)
                result.append(", ");
        }

        return result.toString() + "]";
    }

    public void trimToSize() {
        if (size != data.length) { // If size == capacity, no need to trim
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public String getID() {
        return "Program 5, Sherwin Labadan";
    }

    public int getCapacity() {
        return data.length;
    }
}