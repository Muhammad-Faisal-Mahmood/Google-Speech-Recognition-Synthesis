/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

public final class deo
implements ddp {
    public final Map a;
    public gzx b = den.o;
    public byte[] c;
    public boolean d;

    public deo(Map map) {
        this.a = map;
    }

    @Override
    public final void close() {
        if (!this.d) {
            Iterator iterator = this.a.entrySet().iterator();
            while (iterator.hasNext()) {
                ((del)iterator.next().getValue()).close();
            }
        }
        this.d = true;
    }
}

