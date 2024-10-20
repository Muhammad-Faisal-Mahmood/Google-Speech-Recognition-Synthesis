/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class gyb
extends gwy {
    private static final long serialVersionUID = 0L;
    transient int c;

    public gyb() {
        super(new gyp(null));
        fvd.al(3, "expectedValuesPerKey");
        this.c = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        int n2 = objectInputStream.readInt();
        this.l(new gyp());
        hhk.x(this, objectInputStream, n2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hhk.y(this, objectOutputStream);
    }
}

