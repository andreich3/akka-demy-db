package com.akkademy.messages;

import java.io.Serializable;

/**
 * @author Andrei Markov
 */
public class KeyNotFoundException extends Exception implements Serializable {
    public final String key;

    public KeyNotFoundException(String key) {
        this.key = key;
    }
}