package demo1;

import java.io.IOException;

  /**
 * Signals that the csv file is determined to be
 * corrupted.
 * <p>
 * This Exception is thrown to indicate that the format of the csv file being
 * opened does not match the expected format of the method that is reinflating
 * the CSV to objects.
 * <p>
 * For example: csv file has the incorrect number of comma separated values in a
 * particular line item.
 * <p> PS - RICH WAS HERE!!!! ;-P
 * 
 * @author Rich Smith - Zen of Programming
 */
public class CorruptedFileException extends IOException {
    public CorruptedFileException() {
        super();
    }

    /**
     * Constructor 
     * 
     * @see #CorruptedFileException
     * 
     * @param message - additional information String the the programmer can set
     *                before throwing Exception
     */
    public CorruptedFileException(String message) {
        super(message);
    }

}
