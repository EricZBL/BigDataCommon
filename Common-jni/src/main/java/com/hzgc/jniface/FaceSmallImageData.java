package com.hzgc.jniface;

public class FaceSmallImageData extends ImageData {
    //人脸信息
    private FaceAttribute faceAttribute;

    public FaceAttribute getFaceAttribute() { return faceAttribute; }

    public void setFaceAttribute(FaceAttribute faceAttribute) { this.faceAttribute = faceAttribute; }
}
