import Exception.WrongLoginException;
import Exception.WrongPasswordException;
public class Main {
    private static final String VALID_OK = "^[a-zA-Z0-9_]+$";

    public static void main(String[] args) {
        check("login","password","pas_sword");
    }

        private static boolean check(String login, String password, String confirmPassword) {
            boolean valeddOk = true;
            try {
                checkLogin(login);
                checkPassword(password, confirmPassword);
            } catch (WrongLoginException e) {
                System.out.println("Ошибка в введенном логине, " + e.getMessage());
                valeddOk = false;
            } catch (WrongPasswordException e) {
                System.out.println("Ошибка в введенном пароле, " + e.getMessage());
                valeddOk = false;
            }
            return valeddOk;
        }


        private static void checkLogin(String login) throws WrongLoginException {
            if (!login.matches(VALID_OK)) {
                throw new WrongLoginException("логин должен содержать в себе" +
                        " только латинские буквы, цифры и знак подчеркивания");
            } else if (login.length( )> 20){
                throw new WrongLoginException("логин должен быть равен или меньше 20 символов");
            }

        }
        private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
            if (!password.matches(VALID_OK)) {
                throw new WrongPasswordException("пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
            } else if (password.length( )> 20){
                throw new WrongPasswordException("пароль должен быть равен или меньше 20 символов");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("пароли должны совпадать");


            }


        }

    }



