package no.hiof.olawp.oblig3;

public class Production {
    private String title;
    private int runtime;
    private String description;

    public Production(String title, int runtime, String description) {
        this.title = title;
        this.runtime = runtime;
        this.description = description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
