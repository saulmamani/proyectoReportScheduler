package Searches;

import People.SendEmail;
import TreeFileDirectory.File;

public class Constains extends Search {

    public Constains(File file, Rule rule) {
        super(file, rule);
    }

    @Override
    public void search() {
        String value  = rule.getValue();

        if (file.getName().toLowerCase().contains(value.toLowerCase())) {
            email.send();
        }
    }
}
