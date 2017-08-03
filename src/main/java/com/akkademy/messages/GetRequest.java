package com.akkademy.messages;

import java.io.Serializable;

/**
 * @author Andrei Markov
 */
public class GetRequest implements Serializable {
    public final String key;

    public GetRequest(String key) {
        this.key = key;
    }
}