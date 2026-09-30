package ru.otus.java.homework;

public class AppArrayDataException extends NumberFormatException{
    public AppArrayDataException(String message, String eMessage) {
        super(message + eMessage.substring(18));
    }
}
