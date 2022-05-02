package tech.getarrays.dashboardmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Dashboard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String url;
    private String color;
    private String icon;

    public Dashboard() {}

    public Dashboard(String name, String url, String color, String icon) {
        this.name = name;
        this.url = url;
        this.color = color;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + url + '\'' +
                ", color='" + color + '\''+
                ", icon='" + icon + '\''+
                '}';
    }

    public void setDashboardCode(String string) {
    }
}
