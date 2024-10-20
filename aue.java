/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class aue {
    public final aum a;
    public final String[] b;
    public final avc c;
    public final Map d;
    public final ReentrantLock e;
    public final jqz f;
    public final jqz g;
    public auc h;
    public final Object i;
    public we j;
    private final Map k;
    private final Map l;

    public aue(aum object, Map map, Map map2, String ... stringArray) {
        this.a = object;
        this.k = map;
        this.l = map2;
        this.b = stringArray;
        this.c = object = new avc((aum)object, map, map2, stringArray, new eia((Object)this, 1, null));
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new aud(2);
        this.g = new aud(0);
        jse.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new Object();
        ((avc)object).d = new mq(this, 7);
    }

    public final Object a(jqb object) {
        if ((!this.a.o() || this.a.q()) && (object = this.c.e((jqb)object)) == jqh.a) {
            return object;
        }
        return jon.a;
    }
}

