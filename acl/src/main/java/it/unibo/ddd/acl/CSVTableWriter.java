package it.unibo.ddd.acl;

import java.io.File;
import java.io.IOException;

public interface CSVTableWriter {
    public void write(Table table, File file) throws IOException;

    public static CSVTableWriter apacheCommons(char separator, char quote) {
        return null; // TODO: put implementation here
    };

    public static CSVTableWriter openCSV(char separator, char quote) {
        return null; // TODO: put implementation here
    };
}
