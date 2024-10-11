package it.unibo.ddd.acl;

import java.io.File;
import java.io.IOException;

public interface CSVTableParser {

    public Table parse(File file) throws IOException;

    public static CSVTableParser apacheCommons(char separator, char quote) {
        return null; // TODO: put implementation here
    };

    public static CSVTableParser openCSV(char separator, char quote) {
        return null; // TODO: put implementation here
    };

}
