package org.esa.beam.diversity.mph_chl;

import org.esa.beam.framework.datamodel.RasterDataNode;
import org.esa.beam.framework.gpf.pointop.WritableSample;

class TestSample implements WritableSample {

    private boolean boolValue;
    private double doubleValue;
    private int intValue;

    @Override
    public RasterDataNode getNode() {
        return null;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public int getDataType() {
        return 0;
    }

    @Override
    public boolean getBit(int i) {
        return false;
    }

    @Override
    public boolean getBoolean() {
        return boolValue;
    }

    public void set(boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public int getInt() {
        return intValue;
    }

    @Override
    public float getFloat() {
        return 0;
    }

    @Override
    public double getDouble() {
        return doubleValue;
    }

    @Override
    public void set(int i, boolean b) {
    }

    @Override
    public void set(int i) {
        intValue = i;
    }

    @Override
    public void set(float v) {
    }

    @Override
    public void set(double v) {
        doubleValue = v;
    }
}
