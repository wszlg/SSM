package ssm.po;

public class Control {
    private Integer id;

    private String name;

    private String identifiler;

    private Integer open;

    private Integer display;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentifiler() {
        return identifiler;
    }

    public void setIdentifiler(String identifiler) {
        this.identifiler = identifiler == null ? null : identifiler.trim();
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }
}