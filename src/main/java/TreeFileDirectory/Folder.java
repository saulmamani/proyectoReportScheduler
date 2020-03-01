package TreeFileDirectory;

import Searches.Rule;

import java.text.ParseException;
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

    public void show() {
        int cantTabs = files.get(0).location.split("/").length;

        System.out.printf("%s|_%s/\n", formarTabs(cantTabs-3), this.name);
        for(BaseFile file : files){
            file.show();
        }
    }

    @Override
    public void buscar(Rule rule) {
        for(BaseFile file : files){
            file.buscar(rule);
        }
    }
}
