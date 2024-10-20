/*
 * Decompiled with CFR 0.152.
 */
public final class jwu
extends kbi
implements jwe {
    @Override
    public final jwu bt() {
        return this;
    }

    @Override
    public final boolean bv() {
        return true;
    }

    public final String c(String object) {
        StringBuilder stringBuilder = new StringBuilder("List{");
        stringBuilder.append((String)object);
        stringBuilder.append("}[");
        object = this.f();
        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        object = (kbk)object;
        boolean bl2 = true;
        while (!jse.i(object, this)) {
            boolean bl3 = bl2;
            if (object instanceof jwl) {
                if (!bl2) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(object);
                bl3 = false;
            }
            object = ((kbk)object).h();
            bl2 = bl3;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public final String toString() {
        String string = jve.a ? this.c("Active") : super.toString();
        return string;
    }
}

