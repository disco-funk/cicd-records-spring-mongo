package com.philhudson.recordsspringmongo.model;

import org.springframework.data.annotation.Id;

import static java.lang.String.*;

public class FormatType {

    @Id
    public String id;
    public String description;

    public FormatType() {
    }

    public FormatType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return format("FormatType[id=%s, description='%s', lastName='%s']", id, description);
    }
}