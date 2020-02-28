public class File extends BaseFile {
    private String extension;
    private double size;

    public File(String name, String extension, double size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    protected void add(BaseFile file) {
        return;
    }

    protected double getSize() {
        return size;
    }

    protected void show() {
        int cantTabs = this.location.split("/").length - 1;
        String tabs = formarTabs(cantTabs);
        System.out.printf("%s|_%-30s.%s \t MB %-10.2f %s\n", tabs, this.name, this.extension, this.size, this.location);
    }

    private String formarTabs(int cantTabs) {
        StringBuilder tabs = new StringBuilder("\t");
        for (int i = 0; i < cantTabs; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }
}
