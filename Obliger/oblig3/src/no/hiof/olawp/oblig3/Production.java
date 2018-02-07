package no.hiof.olawp.oblig3;

public class Production {
    private String title;
    private int runtime;

    public Production(String title, int runtime) {
        this.title = title;
        this.runtime = runtime;
    }

    public Production(String title) {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }


}
