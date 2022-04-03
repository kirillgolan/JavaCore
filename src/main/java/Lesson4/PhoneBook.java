package Lesson4;

import java.util.*;

class PhoneBook<T extends PhoneRecordAdd> extends ArrayList {

    public PhoneBook(){
        super();
    }

    public void add(String surname, String phoneNumber){
        this.add(new PhoneRecordAdd(surname, phoneNumber));
    }

    public ArrayList get(String surname){
        ArrayList<T> res = new ArrayList<>();
        for (int i=0; i<this.size(); i++){
            T record = (T) this.get(i);
            if (surname.equals(record.surname)){
                res.add(record);
            }
        }
        return res;
    }

}