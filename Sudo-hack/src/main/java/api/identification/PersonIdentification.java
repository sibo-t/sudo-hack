package api.identification;

public class PersonIdentification {
    private final String NAME;
    private final String SURNAME;
    private final String ID;
    private Integer age;

    public PersonIdentification(String NAME, String SURNAME, String ID, Integer age) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.ID = ID;
        this.age = age;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public String getID() {
        return ID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
