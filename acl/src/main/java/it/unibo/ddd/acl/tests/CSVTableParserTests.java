package it.unibo.ddd.acl.tests;

import it.unibo.ddd.acl.CSVTableParser;

public abstract class CSVTableParserTests {

    protected CSVTableParser parser;

    protected abstract CSVTableParser makeParser();
    
    @BeforeEach
    private void setup() {
        parser = makeParser();
    }

}
