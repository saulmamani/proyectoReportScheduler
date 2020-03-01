package TreeFileDirectory;

import People.SendEmail;
import Searches.Rule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class File extends BaseFile {
    private String extension;
    private double size;
    private Date created;
    private Date opened;
    private Date modified;

    public File(String name, String extension, double size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.created = RandomDate.nextDate();
        this.opened = RandomDate.nextDate();
        this.modified = RandomDate.nextDate();
    }

    public File() {
    }

    public void add(BaseFile file) {
        return;
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public void buscar(Rule rule) {
        SendEmail email = new SendEmail(this);
        String value = rule.getValue();

        if (rule.getOperator().equals("=")) {
            switch (rule.getAttribute()) {
                case "extension":
                    if (this.extension.equals(value)) {
                        email.send();
                    }
                    break;
                case "name":
                    if (this.name.equals(value)) {
                        email.send();
                    }
                    break;
                case "created":
                    if (this.created.equals(this.getDate(value))) {
                        email.send();
                    }
                    break;
                case "opened":
                    if (this.opened.equals(this.getDate(value))) {
                        email.send();
                    }
                    break;
                case "modified":
                    if (this.modified.equals(this.getDate(value))) {
                        email.send();
                    }
                    break;
            }
        } else if (rule.getOperator().equals("contains")) {
            if (this.name.toLowerCase().contains(value.toLowerCase())) {
                email.send();
            }
        } else if (rule.getOperator().equals("<")) {
            switch (rule.getAttribute()) {
                case "created":
                    if (this.created.compareTo(this.getDate(value)) < 0) {
                        email.send();
                    }
                    break;
                case "opened":
                    if (this.opened.compareTo(this.getDate(value)) < 0) {
                        email.send();
                    }
                    break;
                case "modified":
                    if (this.modified.compareTo(this.getDate(value)) < 0) {
                        email.send();
                    }
                    break;
            }
        }else if (rule.getOperator().equals(">")) {
            switch (rule.getAttribute()) {
                case "created":
                    if (this.created.compareTo(this.getDate(value)) > 0) {
                        email.send();
                    }
                    break;
                case "opened":
                    if (this.opened.compareTo(this.getDate(value)) > 0) {
                        email.send();
                    }
                    break;
                case "modified":
                    if (this.modified.compareTo(this.getDate(value)) > 0) {
                        email.send();
                    }
                    break;
            }
        }
    }

    private Date getDate(String value) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatoFecha.setLenient(false);
            return formatoFecha.parse(value);
        }
        catch (ParseException ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        int cantTabs = this.location.split("/").length;
        return String.format("%s|_%-25s.%s \t MB %-10.2f %s \t %s %s %s",
                formarTabs(cantTabs - 2), this.name, this.extension, this.size, this.location,
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(this.created),
                new SimpleDateFormat("HH:mm:ss").format(this.opened),
                new SimpleDateFormat("HH:mm:ss").format(this.modified));
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}
