package TreeFileDirectory;

import Searches.*;

import java.text.SimpleDateFormat;
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

    public void add(BaseFile file) {
        return;
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public void buscar(Rule rule) {
        Search search;
        if (rule.getOperator().equals("=")) {
            search = new Equals(this, rule);
        } else if (rule.getOperator().equals("contains")) {
            search = new Constains(this, rule);
        } else if (rule.getOperator().equals("<")) {
            search = new SmallerThan(this, rule);
        }else {
            search = new GreaterThan(this, rule);
        }

        search.search();
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

    public Date getCreated() {
        return created;
    }

    public Date getOpened() {
        return opened;
    }

    public Date getModified() {
        return modified;
    }
}
