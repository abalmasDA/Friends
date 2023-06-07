/**
 * Використовуючи Intelij IDEA, створити клас Friends.
 * За допомогою методів ArrayList додати масив імена друзів. Вивести список друзів, після вивести список друзів,
 * відсортувавши в алфавітному порядку.
 */
public class Main {
    public static void main(String[] args) {

        Friends friends = new Friends();
        friends.addingElementToList("Dmytro");
        friends.addingElementToList("Liza");
        friends.addingElementToList("Alex");
        friends.addingElementToList("Ivan");
        friends.addingElementToList("Victoria");
        friends.printList();
        friends.sortListByAlphabeticalOrder();
        friends.printList();

    }
}
