package yichang;

public class _02MyException extends Exception {

    private String error;

    public _02MyException(String err){
        this.error = err;
    }

    @Override
    public String toString() {
        System.out.println("@@@");
        return "MyException{" +
                "error='" + error + '\'' +
                '}';
    }
}
