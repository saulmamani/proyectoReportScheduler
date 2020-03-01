package Searches;

import People.SendEmail;
import TreeFileDirectory.File;

public class Equals extends Search {

    public Equals(File file, Rule rule) {
        super(file, rule);
    }

    public void search() {
        String value  = rule.getValue();

        switch (rule.getAttribute()) {
            case "extension":
                if (file.getExtension().equals(value)) {
                    email.send();
                }
                break;
            case "name":
                if (file.getName().equals(value)) {
                    email.send();
                }
                break;
            case "created":
                if (file.getCreated().equals(this.getDate(value))) {
                    email.send();
                }
                break;
            case "opened":
                if (file.getOpened().equals(this.getDate(value))) {
                    email.send();
                }
                break;
            case "modified":
                if (file.getModified().equals(this.getDate(value))) {
                    email.send();
                }
                break;
        }
    }
}
