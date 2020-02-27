import java.util.Date;

public abstract class BaseFile {
    protected String name;
    protected String location;

    protected abstract void add(BaseFile file);
    protected abstract double getSize();
    protected abstract void show();
}
