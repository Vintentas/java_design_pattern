package Patterns.Behavioral.Iterator;

class MyIterator <T> implements AbstractIterator {
    private T [] elements;
    private int count;

    MyIterator (T[] elements) {
        this.elements = elements;
        count = -1;
    }

    @Override
    public boolean hasNext() {
        try {
            if (elements[count+1] != null) {
                return true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        return false;
    }

    @Override
    public T Next() {
        return elements[++count];
    }
}
