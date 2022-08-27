package api.identification;

public class IncomeClass {
    private String idNumber;
    private String incomeLevel;

    public IncomeClass(String idNumber, String incomeLevel) {
        this.idNumber = idNumber;
        this.incomeLevel = incomeLevel;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /*
    @param String incomeLevel - "1" return (poor)
                              - "2" return (lower middle class)
                              - "3" return (upper middle class)
                              - "4" return (affluent)
     */
    public String getIncomeLevel() {
        if(incomeLevel == "1"){
            return "poor";
        }
        if(incomeLevel == "2"){
            return "lower-middle";
        }
        if(incomeLevel == "3"){
            return "upper-middle";
        }
        return "affluent";
    }

    public void setIncomeLevel(String incomeLevel) {
        this.incomeLevel = incomeLevel;
    }
}
