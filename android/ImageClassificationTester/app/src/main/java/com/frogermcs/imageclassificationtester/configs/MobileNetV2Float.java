package com.frogermcs.imageclassificationtester.configs;

public class MobileNetV2Float extends ModelConfig {

    @Override
    public String getModelFilename() {
        return "mobilenet_v2_1.0_224.tflite";
    }

    @Override
    public String getLabelsFilename() {
        return "labels_mobilenet.txt";
    }

    @Override
    public int getInputWidth() {
        return 224;
    }

    @Override
    public int getInputHeight() {
        return 224;
    }

    @Override
    public int getInputSize() {
        return getInputWidth() * getInputHeight() * getChannelsCount() * FLOAT_BYTES_COUNT;
    }

    @Override
    public int getChannelsCount() {
        return 3;
    }

    @Override
    public float getStd() {
        return 128.f;
    }

    @Override
    public float getMean() {
        return 128.f;
    }

    @Override
    public boolean isQuantized() {
        return false;
    }
}
