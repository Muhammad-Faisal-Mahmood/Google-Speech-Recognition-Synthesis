/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class jcv {
    private ArrayList a = new ArrayList();
    private volatile iui b = iui.d;

    public final void a(iui object) {
        a.s(object, "newState");
        if (this.b != object && this.b != iui.e) {
            this.b = object;
            if (!this.a.isEmpty()) {
                object = this.a;
                this.a = new ArrayList();
                if (object.size() > 0) {
                    object = (jjj)object.get(0);
                    throw null;
                }
            }
        }
    }
}

