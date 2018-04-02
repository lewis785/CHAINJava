package chain.sql;

/**
 * Class to represent exceptions raised by the WordNet matching step
 */
public class WordNetMatchingException extends Exception {
    public WordNetMatchingException(String error) {
        super(error);
    }
}
