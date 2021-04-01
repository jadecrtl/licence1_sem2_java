public class Toboggan {
    private FileToboggan file;
    public Toboggan (int n) {
        this.setFile(new FileToboggan(n));
    }
    public FileToboggan getFile() {
        return file;
    }
    public void setFile(FileToboggan file) {
        this.file = file;
    }
    public int jouer(){
        int nbTours = 0;
        if (file == null){
            return nbTours;
        }
        while (file.getCourant() != null) {
            file.unTour();
            nbTours++;
        }
        return nbTours;
    }
}
