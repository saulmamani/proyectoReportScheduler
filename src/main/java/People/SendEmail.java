package People;

import TreeFileDirectory.File;

public class SendEmail {
    File file;
    private static SendEmail instance;

    public static SendEmail getInstance(File file)
    {
        if(instance == null)
            return new SendEmail(file);
        return instance;
    }

    private SendEmail(File file) {
        this.file = file;
    }

    public void send() {
        System.out.println(file.getName() + "." + file.getExtension());
    }
}
