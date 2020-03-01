package People;

import TreeFileDirectory.File;

public class SendEmail {
    File file;

    public SendEmail(File file) {
        this.file = file;
    }

    public void send() {
        System.out.println(file.getName() + "." + file.getExtension());
    }
}
