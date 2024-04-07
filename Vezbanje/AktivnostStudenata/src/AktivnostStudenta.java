public abstract class AktivnostStudenta implements Uslovljeno, Comparable<AktivnostStudenta>{

    private int godina;
    private int mesec;
    private int dan;

    public AktivnostStudenta(int godina, int mesec, int dan) {
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
    }

    public abstract int getGodinaStudija();

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    @Override
    public int compareTo(AktivnostStudenta o) {

        if(this.getGodina() > o.getGodina()) {
            return 1;
        }
        else if(this.getGodina() < o.getGodina()) {
            return -1;
        }
        else if((this.getGodina() == o.getGodina()) && this.getMesec() > o.getMesec()) {
            return 1;
        }
        else if((this.getGodina() == o.getGodina()) && this.getMesec() < o.getMesec()) {
            return -1;
        }
        else if(((this.getGodina() == o.getGodina()) && this.getMesec() == o.getMesec()) && this.getDan() > o.getDan()) {
            return 1;
        }
        else if(((this.getGodina() == o.getGodina()) && this.getMesec() == o.getMesec()) && this.getDan() < o.getDan()) {
            return -1;
        }
        else{
            return 0;
        }


    }
}
