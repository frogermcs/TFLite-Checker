package com.frogermcs.imageclassificationtester.configs;

public class MnistConfig extends ModelConfig {
    @Override
    public String getModelFilename() {
        return "mnist.tflite";
    }

    @Override
    public String getLabelsFilename() {
        return "labels_mnist.txt";
    }

    @Override
    public int getInputWidth() {
        return 28;
    }

    @Override
    public int getInputHeight() {
        return 28;
    }

    @Override
    public int getInputSize() {
        return getInputWidth() * getInputHeight() * getChannelsCount() * FLOAT_BYTES_COUNT;
    }

    @Override
    public int getChannelsCount() {
        return 1;
    }

    @Override
    public float getMean() {
        return 0;
    }

    @Override
    public float getStd() {
        return 255.f;
    }

    @Override
    public boolean isQuantized() {
        return false;
    }
}
