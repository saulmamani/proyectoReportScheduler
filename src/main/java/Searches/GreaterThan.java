package Searches;

import TreeFileDirectory.File;

public class GreaterThan extends Search {
    public GreaterThan(File file, Rule rule) {
        super(file, rule);
    }

    @Override
    public void search() {
        String value = rule.getValue();

        switch (rule.getAttribute()) {
            case "created":
                if (file.getCreated().compareTo(this.getDate(value)) > 0) {
                    email.send();
                }
                break;
            case "opened":
                if (file.getOpened().compareTo(this.getDate(value)) > 0) {
                    email.send();
                }
                break;
            case "modified":
                if (file.getModified().compareTo(this.getDate(value)) > 0) {
                    email.send();
                }
                break;
        }
    }
}
