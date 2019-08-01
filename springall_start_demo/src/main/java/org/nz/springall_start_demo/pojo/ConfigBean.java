package org.nz.springall_start_demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "org.nz.blog")
public class ConfigBean {
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BlogProperties{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

}
