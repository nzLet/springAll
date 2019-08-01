package org.nz.springall_start_demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {
    @Value("${org.nz.blog.name}")
    private String name;
    @Value("${org.nz.blog.title}")
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
