import java.util.Date;

public abstract class BaseFile {
    protected String name;
    protected String location;

    protected abstract void add(BaseFile file);
    protected abstract double getSize();
    protected abstract void show();

    protected String formarTabs(int cantTabs) {
        StringBuilder tabs = new StringBuilder("");
        for (int i = 0; i < cantTabs; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }
}
