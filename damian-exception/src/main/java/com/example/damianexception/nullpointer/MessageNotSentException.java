package com.example.damianexception.nullpointer;

public class MessageNotSentException extends  Exception {

    public MessageNotSentException(final String message) {
        super(message);
    }

}
