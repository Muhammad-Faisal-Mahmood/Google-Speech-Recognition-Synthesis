/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;

final class guc
extends gsm {
    final cxt g;

    public guc(guf guf2, CharSequence charSequence, cxt cxt2) {
        this.g = cxt2;
        super(guf2, charSequence);
    }

    @Override
    public final int a(int n2) {
        return ((Matcher)this.g.a).end();
    }

    @Override
    public final int b(int n2) {
        if (((Matcher)this.g.a).find(n2)) {
            return ((Matcher)this.g.a).start();
        }
        return -1;
    }
}

