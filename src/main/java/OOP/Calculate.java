package OOP;

public class Calculate {
    private static int countClass;

    public Calculate(){
        countClass++;
    }

    public static int getCountClass(){
        return countClass;
    }
}
