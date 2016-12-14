package eu.senuna.challenge;

import java.util.ArrayList;

/**
 * Created by senuna on 14.12.16.
 */
public interface ISavable {
    ArrayList<String> write();
    void read(ArrayList<String> savedValues);
}
