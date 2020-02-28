import java.util.ArrayList;
import java.util.List;

public class Folder extends BaseFile {
    private List<BaseFile> files = new ArrayList<BaseFile>();

    public Folder(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void add(BaseFile file){
        file.location = this.location;
        this.files.add(file);
    }

    public double getSize() {
        double total = 0;
        for(BaseFile file : files)
        {
            total += file.getSize();
        }
        return total;
    }

    protected void show() {
        int cantTabs = files.get(0).location.split("/").length;
        String tabs = formarTabs(cantTabs-3);

        System.out.printf("%s|_%s/\n", tabs, this.name);
        for(BaseFile file : files){
            file.show();
        }
    }
}
