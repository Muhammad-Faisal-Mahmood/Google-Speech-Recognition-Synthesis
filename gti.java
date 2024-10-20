/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class gti
extends gtk {
    final gtk a;

    public gti(gtk gtk2, gtk gtk3) {
        this.a = gtk2;
        super(gtk3);
    }

    @Override
    public final void b(Appendable appendable, Iterator iterator) {
        Object e2;
        a.s(iterator, "parts");
        while (iterator.hasNext()) {
            e2 = iterator.next();
            if (e2 == null) continue;
            appendable.append(this.a.a(e2));
            break;
        }
        while (iterator.hasNext()) {
            e2 = iterator.next();
            if (e2 == null) continue;
            appendable.append(this.a.c);
            appendable.append(this.a.a(e2));
        }
    }
}

