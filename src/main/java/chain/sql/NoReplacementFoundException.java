package chain.sql;

/**
 * Exception used to handle case were no replacement can be
 * found using WordNet
 */
class NoReplacementFoundException extends Exception {

    /**
     * Informs user what name could not be replaced
     * @param itemName Name for which replacement could not be found
     */
    NoReplacementFoundException(String itemName) {
        super("No replacement name found for: " + itemName);
    }
}
