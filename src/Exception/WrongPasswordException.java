package Exception;

public class WrongPasswordException {
    public  WrongPasswordException extends Exception{
        WrongPasswordException(String messenge){
            super(messenge);
        }
    }
}
