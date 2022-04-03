package Lesson4;

class PhoneRecordAdd{
    String surname;
    String phoneNumber;

    public PhoneRecordAdd(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return surname +" :  " + phoneNumber;
    }
}