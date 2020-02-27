public class MainReporScheduler {
    public static void main(String[] args){
        //Documento raiz llamado saul
        BaseFile base = new Folder("base", "/");
        base.add(new File("bethoven", "mp4", 50, "/"));
        base.add(new File("informe", "odt", 29, "/"));
        base.add(new File("foto", "png", 5, "/"));

        //carpeta /base/music
        BaseFile music = new Folder("music", "/base/music");
        music.add(new File("Soy Revelde - Jeanette", "mp3", 5,  "/base/music"));
        music.add(new File("Fue amor - T con T", "mp3", 4,  "/base/music"));
        base.add(music);

        //carpeta /base/documents
        BaseFile documents = new Folder("documents", "/base/documents");
        documents.add(new File("practica_1", "odt", 1.5,  "/base/documents"));
        documents.add(new File("Patrones de diseño", "pdf", 5.2,  "/base/documents"));

        //capeta /base/documents/programs
        BaseFile programs = new Folder("programs", "/base/documents/programs");
        programs.add(new File("quebrados", "cpp", 1.8,  "/base/documents/programs"));
        programs.add(new File("facade_pattern", "java", 0.3,  "/base/documents/programs"));

        documents.add(programs);
        base.add(documents);






        base.show();
    }
}
