/*
 * Decompiled with CFR 0.152.
 */
public abstract class jwl
extends kbk
implements jvq,
jwe {
    public jwp b;

    public abstract void a(Throwable var1);

    public abstract boolean b();

    @Override
    public final jwu bt() {
        return null;
    }

    @Override
    public final void bu() {
        block5: {
            Object object;
            Object object2 = this.e();
            while ((object = ((jwp)object2).B()) instanceof jwl) {
                if (object == this && !((jwp)object2).d.d(object, jwq.g)) continue;
                break block5;
            }
            if (object instanceof jwe && ((jwe)object).bt() != null) {
                kbk kbk2;
                Object object3;
                do {
                    if ((object3 = this.f()) instanceof kbo) {
                        object2 = ((kbo)object3).a;
                        return;
                    }
                    if (object3 == this) {
                        object2 = (kbk)object3;
                        return;
                    }
                    jse.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    kbk2 = (kbk)object3;
                    object2 = object = (kbo)kbk2.e.a;
                    if (object != null) continue;
                    object2 = new kbo(kbk2);
                    kbk2.e.b(object2);
                } while (!this.c.d(object3, object2));
                kbk2.g();
            }
        }
    }

    @Override
    public final boolean bv() {
        return true;
    }

    public final jwp e() {
        jwp jwp2 = this.b;
        if (jwp2 != null) {
            return jwp2;
        }
        jse.h("job");
        return null;
    }

    @Override
    public final String toString() {
        String string = jvf.a(this);
        String string2 = jvf.b(this);
        String string3 = jvf.b(this.e());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("@");
        stringBuilder.append(string2);
        stringBuilder.append("[job@");
        stringBuilder.append(string3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

