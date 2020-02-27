import java.util.Date;

public class File extends BaseFile {
    private String extension;
    private double size;

    public File(String name, String extension, double size, String location) {
        this.name = name;
        this.extension = extension;
        this.location = location;
        this.size = size;
    }

    protected void add(BaseFile file) {
        return;
    }

    protected double getSize() {
        return size;
    }

    protected void show() {
        System.out.printf("\t|_%-30s.%s \t MB %-10.2f %s\n", this.name, this.extension, this.size, this.location);
    }
}
