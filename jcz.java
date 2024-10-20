/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

final class jcz
extends jcw {
    final jdc a;

    public jcz(jdd jdd2, jdc jdc2) {
        this.a = jdc2;
        super(jdd2.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        Object object = new ArrayList();
        while (true) {
            List list;
            jdc jdc2 = this.a;
            synchronized (jdc2) {
                if (jdc2.b.isEmpty()) {
                    jdc2.b = null;
                    jdc2.a = true;
                    return;
                }
                list = jdc2.b;
                jdc2.b = object;
            }
            object = list.iterator();
            while (object.hasNext()) {
                ((Runnable)object.next()).run();
            }
            list.clear();
            object = list;
        }
    }
}

