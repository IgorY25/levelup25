package less6;

import java.io.Serializable;

public class GenericClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T obT;
    private V obV;
    private K obK;

    public GenericClass(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public void setObT(T obT) {
        this.obT = obT;
    }

    public void setObV(V obV) {
        this.obV = obV;
    }

    public void setObK(K obK) {
        this.obK = obK;
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }
}
