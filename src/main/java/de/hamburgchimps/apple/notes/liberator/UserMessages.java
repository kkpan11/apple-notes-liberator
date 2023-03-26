package de.hamburgchimps.apple.notes.liberator;

public class UserMessages {
    public static final String NOTES_DATABASE_DOES_NOT_EXIST_AT_SPECIFIED_PATH = "No file exists at given path (%s), please check the file path you specified or leave this option out to attempt automatic resolution of the notes database.";
    public static final String CANT_AUTOMATICALLY_FIND_NOTES_DATABASE = "Cannot automatically find notes database, you will have to manually provide the file path via the -f (--file) option.";
    public static final String CANT_COPY_NOTES_DATABASE = String.format("Cannot copy notes database, do you have read and execute permissions for %s?", Constants.NOTE_STORE_PATH);
    public static final String TABLE_PARSE_ERROR_CANT_FIND_ROOT = "Failed to parse table: unable to find root table";
    public static final String TABLE_PARSE_ERROR_CANT_PARSE_PROTO = "Failed to parse table: see stacktrace starting on next line for more information";
}
