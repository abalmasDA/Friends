import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Friends {
    private ArrayList<String> listOfFriends = new ArrayList<>();

    public void addingElementToList(String nameFriend) {
        listOfFriends.add(listOfFriends.size(), nameFriend);
    }


    public void printList() {
        System.out.println(listOfFriends);

    }


    public void sortListByAlphabeticalOrder() {
        Collections.sort(listOfFriends);
    }


}
