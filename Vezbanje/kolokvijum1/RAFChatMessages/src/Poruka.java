public abstract class Poruka {

    private String posiljalac;

    public Poruka(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    protected abstract String formirajSadrzinu();

    public String formirajIspis() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.getPosiljalac()).append("\n\n");

        sb.append(this.formirajSadrzinu()).append("\n");


        return sb.toString();
    }
}
