package chain.sql;

import it.unitn.disi.smatch.SMatchException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SPSMMatcherTest {

    private SPSMMatcher matcher;

    @Before
    public void setUp()
    {
        Set<String> targetExample = new HashSet<>();
        targetExample.add("name");
        targetExample.add("lastname");
        targetExample.add("middlename");
        targetExample.add("username");
        targetExample.add("kettle");

        matcher = new SPSMMatcher(targetExample);
    }

    @Test
    public void match() throws SMatchException, SPSMMatchingException {
        String sourceExample = "surname";

        assertEquals("lastname", matcher.match(sourceExample));
    }

    @Test(expected = SPSMMatchingException.class)
    public void matchThrowSPSMMatchingExceptionTooMany() throws SMatchException, SPSMMatchingException{
        matcher.match("name");
    }

    @Test(expected = SPSMMatchingException.class)
    public void matchThrowSPSMMatchingExceptionNone() throws SMatchException, SPSMMatchingException{
        matcher.match("france");
    }

}