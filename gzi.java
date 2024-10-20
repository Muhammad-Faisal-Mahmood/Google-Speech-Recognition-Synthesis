/*
 * Decompiled with CFR 0.152.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class gzi
extends gya {
    private static final long serialVersionUID = 0L;
    transient int c = 2;

    public gzi() {
        super(new gyp(null));
        fxf.q(true);
        this.c = 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 2;
        int n2 = objectInputStream.readInt();
        this.l(new gyp(null));
        hhk.x(this, objectInputStream, n2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        hhk.y(this, objectOutputStream);
    }
}

