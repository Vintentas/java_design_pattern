package Patterns.Behavioral.Iterator;

class MyCollection <T> implements AbstractCollection <T> {
    private T [] elements;

    MyCollection (T[] elements) {
        this.elements = elements;
    }

    @Override
    public MyIterator getIterator() {
        return new MyIterator<T>(elements);
    }
}
