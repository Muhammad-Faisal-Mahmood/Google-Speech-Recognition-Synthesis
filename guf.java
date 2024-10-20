/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class guf {
    public final gsy a;
    public final boolean b;
    private final gue c;

    private guf(gue gue2) {
        this(gue2, false, gsv.a);
    }

    private guf(gue gue2, boolean bl2, gsy gsy2) {
        this.c = gue2;
        this.b = bl2;
        this.a = gsy2;
    }

    public static guf b(char c2) {
        return new guf(new gub(new gsr(c2), 1));
    }

    public static guf c(String string) {
        boolean bl2 = string.length() != 0;
        fxf.r(bl2, "The separator may not be the empty string.");
        if (string.length() == 1) {
            return guf.b(string.charAt(0));
        }
        return new guf(new gub(string, 0));
    }

    public static guf h() {
        gtg gtg2 = new gtg(Pattern.compile("[\\s-]"));
        fxf.v(((Matcher)((gsz)gtg2).a((CharSequence)"").a).matches() ^ true, "The pattern may not match the empty string: %s", gtg2);
        return new guf(new gub(gtg2, 2));
    }

    public final guf a() {
        gsy gsy2 = this.a;
        return new guf(this.c, true, gsy2);
    }

    public final guf d() {
        gsy gsy2 = gsx.c;
        fxf.K(gsy2);
        return new guf(this.c, this.b, gsy2);
    }

    public final Iterable e(CharSequence charSequence) {
        fxf.K(charSequence);
        return new gud(this, charSequence);
    }

    public final Iterator f(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public final List g(CharSequence object) {
        fxf.K(object);
        object = this.f((CharSequence)object);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (object.hasNext()) {
            arrayList.add((String)object.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}

