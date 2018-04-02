package chain.core;

import chain.sql.ChainDataSourceException;

/**
 * Interface for chain process
 *
 * This provides a function for getting the repaired Query
 *
 * Results sets and execution are in a different interface as no unified result set is
 * implemented yet
 *
 */
public interface ChainDataSource {

    String getRepairedQuery(String s) throws ChainDataSourceException;
}
