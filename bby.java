/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class bby {
    public UUID a;
    public bhd b;
    public final Set c;
    private final Class d;

    public bby(Class serializable) {
        this.d = serializable;
        Object object = UUID.randomUUID();
        jse.d(object, "randomUUID()");
        this.a = object;
        object = this.a.toString();
        jse.d(object, "id.toString()");
        String string = serializable.getName();
        jse.d(string, "workerClass.name");
        jse.e(object, "id");
        jse.e(string, "workerClassName_");
        this.b = new bhd((String)object, null, string, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0L, 0, 0, null, 0xFFFFFA);
        object = serializable.getName();
        jse.d(object, "workerClass.name");
        serializable = new LinkedHashSet(jjj.E(1));
        jns.ae(new String[]{object}, (Collection)((Object)serializable));
        this.c = serializable;
    }

    public abstract bmu a();

    public final void b(baq baq2) {
        jse.e(baq2, "constraints");
        this.b.k = baq2;
    }

    public final void c(long l2, TimeUnit timeUnit) {
        this.b.h = timeUnit.toMillis(l2);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.b.h) {
            return;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final void d(bas bas2) {
        jse.e(bas2, "inputData");
        this.b.f = bas2;
    }

    public final bmu e() {
        Object object;
        bmu bmu2 = this.a();
        Object object2 = this.b.k;
        boolean bl2 = ((baq)object2).b() || ((baq)object2).f || ((baq)object2).d || ((baq)object2).e;
        Object object3 = this.b;
        if (((bhd)object3).r) {
            if (!bl2) {
                if (((bhd)object3).h > 0L) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
        }
        if (((bhd)object3).y == null) {
            String string = ((bhd)object3).d;
            object2 = new String[]{"."};
            jse.e(string, "<this>");
            object = object2[0];
            if (object.length() == 0) {
                object2 = new jtq(jse.Q(string, (String[])object2));
                object = new ArrayList(jns.B((Iterable)object2));
                Iterator iterator = object2.iterator();
                while (true) {
                    object2 = object;
                    if (iterator.hasNext()) {
                        object.add(jse.y(string, (jsw)iterator.next()));
                        continue;
                    }
                    break;
                }
            } else {
                object2 = jse.U(string, (String)object);
            }
            object2 = object2.size() == 1 ? (String)object2.get(0) : (String)jns.m((List)object2);
            object = object2;
            if (((String)object2).length() > 127) {
                object = jse.D((String)object2, 127);
            }
            ((bhd)object3).y = object;
        }
        object2 = UUID.randomUUID();
        jse.d(object2, "randomUUID()");
        jse.e(object2, "id");
        this.a = object2;
        object3 = ((UUID)object2).toString();
        jse.d(object3, "id.toString()");
        object2 = this.b;
        jse.e(object3, "newId");
        jse.e(object2, "other");
        object = ((bhd)object2).d;
        this.b = new bhd((String)object3, ((bhd)object2).c, (String)object, ((bhd)object2).e, new bas(((bhd)object2).f), new bas(((bhd)object2).g), ((bhd)object2).h, ((bhd)object2).i, ((bhd)object2).j, new baq(((bhd)object2).k), ((bhd)object2).l, ((bhd)object2).m, ((bhd)object2).n, ((bhd)object2).o, ((bhd)object2).p, ((bhd)object2).q, ((bhd)object2).r, ((bhd)object2).s, ((bhd)object2).t, ((bhd)object2).v, ((bhd)object2).w, ((bhd)object2).x, ((bhd)object2).y, 524288);
        return bmu2;
    }
}

