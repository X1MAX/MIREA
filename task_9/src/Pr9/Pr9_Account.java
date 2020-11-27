package Pr9;

public class Account {
    private String INN;
    private String name;

    public Account(String INN, String name) {
        this.INN = INN;
        this.name = name;
    }
    public String getINN() {
        return INN;
    }

    public String getName() {
        return name;
    }
    public void CheckINN(String inn) throws Verification {
        if(inn.length() != 10)
            throw new Verification(this);
    }

    public static void Check(Account acc){
        try {
            acc.CheckINN(acc.getINN());
            System.out.println("ИНН: " + acc.getName() + " - действителен");
        } catch (Verification e) {
            System.out.println(e.getMessage());;
        }
    }
}