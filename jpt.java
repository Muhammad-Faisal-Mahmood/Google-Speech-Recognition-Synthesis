/*
 * Decompiled with CFR 0.152.
 */
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

final class jpt
implements Externalizable {
    private static final long serialVersionUID = 0L;
    private Map a;

    public jpt() {
        this(jpb.a);
    }

    public jpt(Map map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        jse.e(objectInput, "input");
        int n2 = objectInput.readByte();
        if (n2 == 0) {
            int n3 = objectInput.readInt();
            if (n3 >= 0) {
                jpp jpp2 = new jpp(n3);
                for (n2 = 0; n2 < n3; ++n2) {
                    jpp2.put(objectInput.readObject(), objectInput.readObject());
                }
                this.a = jpp2.e();
                return;
            }
            throw new InvalidObjectException(a.ah(n3, "Illegal size value: ", "."));
        }
        throw new InvalidObjectException(a.af(n2, "Unsupported flags value: "));
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        jse.e(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}

