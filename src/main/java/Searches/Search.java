package Searches;

import People.SendEmail;
import TreeFileDirectory.File;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Search {
    protected  File file;
    protected  Rule rule;
    protected  SendEmail email;

    public Search(File file, Rule rule) {
        this.file = file;
        this.rule = rule;
        email = SendEmail.getInstance(file);
    }

    public abstract void search();

    protected Date getDate(String value) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            format.setLenient(false);
            return format.parse(value);
        }
        catch (ParseException ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
