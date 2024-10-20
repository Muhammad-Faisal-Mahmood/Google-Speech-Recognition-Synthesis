/*
 * Decompiled with CFR 0.152.
 */
final class pr
extends pn {
    final ps c;

    public pr(ps ps2) {
        this.c = ps2;
    }

    @Override
    protected final String b() {
        po po2 = (po)this.c.a.get();
        if (po2 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder stringBuilder = new StringBuilder("tag=[");
        stringBuilder.append(po2.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

