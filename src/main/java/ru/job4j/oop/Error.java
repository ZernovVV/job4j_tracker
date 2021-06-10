package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("report : " + active + " " + status + " " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error2 = new Error(true, 1, "work in progress");
        Error error3 = new Error(false, 20, "denied");
        error.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
