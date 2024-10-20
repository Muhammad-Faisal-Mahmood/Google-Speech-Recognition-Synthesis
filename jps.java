/*
 * Decompiled with CFR 0.152.
 */
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

public final class jps
implements Externalizable {
    private static final long serialVersionUID = 0L;
    private Collection a;
    private final int b;

    public jps() {
        this(jpa.a, 0);
    }

    public jps(Collection collection, int n2) {
        this.a = collection;
        this.b = n2;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override
    public final void readExternal(ObjectInput object) {
        jse.e(object, "input");
        byte by2 = object.readByte();
        if ((by2 & 0xFFFFFFFE) == 0) {
            int n2 = object.readInt();
            if (n2 >= 0) {
                int n3;
                int n4 = 0;
                if ((by2 & 1) != 0) {
                    jpu jpu2 = new jpu(new jpp(n2));
                    for (n3 = n4; n3 < n2; ++n3) {
                        jpu2.add(object.readObject());
                    }
                    object = jjj.C(jpu2);
                } else {
                    jpk jpk2 = new jpk(n2);
                    for (n3 = 0; n3 < n2; ++n3) {
                        jpk2.add(object.readObject());
                    }
                    object = jns.c(jpk2);
                }
                this.a = object;
                return;
            }
            throw new InvalidObjectException(a.ah(n2, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.ah(by2, "Unsupported flags value: ", "."));
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        jse.e(objectOutput, "output");
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            objectOutput.writeObject(iterator.next());
        }
    }
}

