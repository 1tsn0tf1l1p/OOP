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

        sb.append(this.getPosiljalac());
        sb.append("\n");

        if(this instanceof KombinovanaPoruka) {
            sb.append("\t");
           sb.append(((KombinovanaPoruka) this).getSadrzina());
            sb.append("\n");
        }

        if(this instanceof TekstualnaPoruka) {
            sb.append("\t");
            sb.append(((TekstualnaPoruka) this).getTekst());
            sb.append("\n");
        }

        if(this instanceof EmojiPoruka) {
            sb.append("\t");
            sb.append(((EmojiPoruka) this).getEmoji());
            sb.append("\n");
        }

        return sb.toString();
    }
}
