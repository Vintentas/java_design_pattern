package Patterns.Behavioral;

/*
Итератор — это поведенческий паттерн, позволяющий последовательно обходить сложную коллекцию, без раскрытия деталей её реализации.
 */

public class Iterator {
    public static void main(String[] args) {
        String [] elements = {"elem1", "elem2", "elem3", "elem4", "elem5", "elem6", "elem7"};
        MyCollection<String> myCollection = new MyCollection<String>(elements);
        MyIterator myIterator = myCollection.getIterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.Next());
        }
    }
}

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


interface AbstractIterator <T> {
    boolean hasNext();
    T Next();
}

interface AbstractCollection <T> {
    AbstractIterator getIterator();
}