package chain.sql;

/**
 * ChainDataSourceException
 *
 * Custom exception class for unifying errors that may occur
 * in the data connection and analysis lifecycle for CHAIn
 *
 */

public class ChainDataSourceException extends Exception {
    /**
     * ChainDataSourceException
     *
     * Constructor method for tailored exception relating
     * to interfacing with data sources.
     *
     * @param message descriptive error message
     * @param cause the original exception
     */
    public ChainDataSourceException(String message, Throwable cause) {
        super(message, cause);
    }
}
