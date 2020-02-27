public class MainReporScheduler {
    public static void main(String[] args){
        //Documento raiz llamado saul
        BaseFile base = new Folder("base", "/");
        base.add(new File("bethoven", "mp4", 50));
        base.add(new File("informe", "odt", 29));
        base.add(new File("foto", "png", 5));

        //carpeta /base/music
        BaseFile music = new Folder("music", "/base/music");
        music.add(new File("Soy Revelde - Jeanette", "mp3", 5));
        music.add(new File("Fue amor - T con T", "mp3", 4));

        //carpeta /base/music/romantica
        BaseFile cumbias = new Folder("cumbias", "/base/music/cumbias");
        cumbias.add(new File("Lizton de tu pelo - Angeles azules", "mp3", 7));

        music.add(cumbias);
        base.add(music);

        //carpeta /base/documents
        BaseFile documents = new Folder("documents", "/base/documents");
        documents.add(new File("practica_1", "odt", 1.5));
        documents.add(new File("Patrones de diseño", "pdf", 5.2));

        //capeta /base/documents/programs
        BaseFile programs = new Folder("programs", "/base/documents/programs");
        programs.add(new File("quebrados", "cpp", 1.8));
        programs.add(new File("facade_pattern", "java", 0.3));

        documents.add(programs);
        base.add(documents);

        base.show();
    }
}
