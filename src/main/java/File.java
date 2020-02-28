import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

    protected void add(BaseFile file) {
        return;
    }

    protected double getSize() {
        return size;
    }

    protected void show() {
        int cantTabs = this.location.split("/").length;

        System.out.printf("%s|_%-25s.%s \t MB %-10.2f %s \t %s %s %s\n",
                formarTabs(cantTabs-2), this.name, this.extension, this.size, this.location,
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(this.created),
                new SimpleDateFormat("HH:mm:ss").format(this.opened),
                new SimpleDateFormat("HH:mm:ss").format(this.modified));
    }
}
