package TreeFileDirectory;

import java.text.ParseException;

public abstract class BaseFile {
    protected String name;
    protected String location;

    public abstract void add(BaseFile file);
    public abstract void show();
    public abstract void buscar(String regla) throws ParseException;

    protected String formarTabs(int cantTabs) {
        StringBuilder tabs = new StringBuilder("");
        for (int i = 0; i < cantTabs; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }
}
