import java.util.ArrayList;
import java.util.List;

public class ТелефонныйСправочник {

    private final List<String> surnameList = new ArrayList<>();
    private final List<String> phoneList = new ArrayList<>();

    public void add(String surname, String phone) {
        this.surnameList.add(surname);
        this.phoneList.add(phone);
    }

    public void get(String surname) {

        for (int i = 0; i < surnameList.size(); i++) {
            if (this.surnameList.get(i).equals(surname)) {
                System.out.println(this.phoneList.get(i));
            }
        }

    }


}
