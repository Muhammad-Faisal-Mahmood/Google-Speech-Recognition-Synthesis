/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hcc {
    public Object a;
    public Object b;

    public hcc() {
        this.a = null;
        this.b = Collections.emptyList();
    }

    public hcc(byte[] byArray) {
    }

    public final IllegalArgumentException a(boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder("expected one element but was: <");
        stringBuilder.append(this.a);
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            stringBuilder.append(", ");
            stringBuilder.append(e2);
        }
        if (bl2) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final void b(Object object) {
        fxf.K(object);
        if (this.a == null) {
            this.a = object;
            return;
        }
        if (this.b.isEmpty()) {
            ArrayList<Object> arrayList;
            this.b = arrayList = new ArrayList<Object>(4);
            arrayList.add(object);
            return;
        }
        if (this.b.size() < 4) {
            this.b.add(object);
            return;
        }
        throw this.a(true);
    }

    public final void c(List list) {
        OutputStream outputStream = (OutputStream)fvd.P(list);
        if (outputStream instanceof fqd) {
            this.a = (fqd)outputStream;
            this.b = (OutputStream)list.get(0);
        }
    }

    public final void d() {
        if (this.a != null) {
            ((OutputStream)this.b).flush();
            ((fqd)this.a).a.getFD().sync();
            return;
        }
        throw new fqb("Cannot sync underlying stream");
    }
}

