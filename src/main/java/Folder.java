import java.util.ArrayList;
import java.util.List;

public class Folder extends BaseFile {
    private List<BaseFile> files = new ArrayList<BaseFile>();

    public Folder(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void add(BaseFile file){
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

        System.out.println("/" + this.name);
        for(BaseFile file : files){
            file.show();
        }
        System.out.printf("Total: %.2f\n", this.getSize());
    }
}
