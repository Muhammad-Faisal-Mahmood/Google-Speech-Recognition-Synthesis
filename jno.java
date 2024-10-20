/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

final class jno
extends jnk {
    private final AtomicInteger j = new AtomicInteger(new Random().nextInt());
    private iwf k = new ivy(iwb.a);

    public jno(ivz ivz2) {
        super(ivz2);
    }

    private final iwf i(Collection object) {
        ArrayList<iwf> arrayList = new ArrayList<iwf>();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((jni)object.next()).c);
        }
        return new jnn(arrayList, this.j);
    }

    private final void j(iui iui2, iwf iwf2) {
        if (iui2 == this.i && iwf2.equals(this.k)) {
            return;
        }
        this.f.f(iui2, iwf2);
        this.i = iui2;
        this.k = iwf2;
    }

    @Override
    protected final jni f(Object object) {
        return new jnm(this, object, (ivx)this.h);
    }

    @Override
    protected final void h() {
        Object object = new ArrayList<Object>();
        for (Object object2 : this.g()) {
            if (((jni)object2).b != iui.b) continue;
            object.add(object2);
        }
        if (object.isEmpty()) {
            Object object2;
            object2 = this.g().iterator();
            while (object2.hasNext()) {
                Object object3 = ((jni)object2.next()).b;
                object = iui.a;
                if (object3 != object && object3 != iui.d) continue;
                this.j((iui)((Object)object), new ivy(iwb.a));
                return;
            }
            this.j(iui.c, this.i(this.g()));
            return;
        }
        this.j(iui.b, this.i((Collection)object));
    }
}

