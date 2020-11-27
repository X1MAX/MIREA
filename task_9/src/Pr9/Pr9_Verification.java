package Pr9;

public class Verification extends Exception
{
    public Verification(Account client) {
        super("ИНН: " + client.getName() + " - недействителен");
    }

    public String toString(Account client) {
        return ("ИНН: " + client.getName() + " - недействителен");
    }
}