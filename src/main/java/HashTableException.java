package main.java;

/**
 * Custom parent Exception class for the HashTable class.
 */
public class HashTableException extends Exception {

    public HashTableException(){}

    public HashTableException(String message){
        super(message);
    }
}
