
public class Main {
    private static final String LOGIN_OK="^[a-z A-Z,0-9_]+$";
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private static boolean chek(String login,String password, String confirmPassword){

    };
    private static void chekLogin(String login){
        if (!login.matches(LOGIN_OK)){
            throw  new WrongLoginException("Параметр должен содержать в себе только " +
                    "латинские буквы, цифры и знак подчеркивания");
        }
    }

}