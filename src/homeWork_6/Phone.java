package homeWork_6;

public class Phone {
    private int id;
    private String lastName;
    private String firsName;
    private String middleName;
    private String phoneNumber;
    private String creditCard;
    private String debit;
    private String credit;
    private int timeTalk;
    private int overTalk;
    private int internetTraffic;

    public Phone(int id, String lastName, String firsName, String middleName, String phoneNumber,
                 String creditCard, String debit, String credit, int timeTalk, int overTalk,int internetTraffic) {
        this.id = id;
        this.lastName = lastName;
        this.firsName = firsName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.creditCard = creditCard;
        this.debit = debit;
        this.credit = credit;
        this.timeTalk = timeTalk;
        this.overTalk = overTalk;
        this.internetTraffic = internetTraffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setTimeTalk(int timeTalk) {
        this.timeTalk = timeTalk;
    }
    public void setOverTalk(int overTalk) {
        this.overTalk = overTalk;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getDebit() {
        return debit;
    }

    public String getCredit() {
        return credit;
    }

    public int getTimeTalk() {
        return timeTalk;
    }
    public int getOverTalk() {
        return overTalk;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firsName='" + firsName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", debit='" + debit + '\'' +
                ", credit='" + credit + '\'' +
                ", timeTalk='" + timeTalk + '\'' +
                ", overTalk='" + overTalk + '\'' +
                ", internetTraffic='" + internetTraffic + '\'' +
                '}';
    }
}
