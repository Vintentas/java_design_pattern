package Patterns.Behavioral.Iterator;

/*
Итератор — это поведенческий паттерн, позволяющий последовательно обходить сложную коллекцию,
без раскрытия деталей её реализации.

В примере простой итератор - MyIterator обходит простую коллекцию - myCollection и выводит ee значения.
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