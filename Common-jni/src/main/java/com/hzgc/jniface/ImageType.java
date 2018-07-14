package com.hzgc.jniface;

public enum ImageType {
    JPG("jpg"),
    PNG("png");

    private final String type;
    private ImageType(String type) {
        this.type = type;
    }
}
