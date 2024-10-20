/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.List;

public final class ful
extends wt {
    private final View b;
    private int c;
    private int d;
    private final int[] e = new int[2];

    public ful(View view) {
        this.b = view;
    }

    @Override
    public final void a() {
        this.b.setTranslationY(0.0f);
    }

    @Override
    public final void b(List object) {
        object = object.iterator();
        while (object.hasNext()) {
            ilo ilo2 = (ilo)object.next();
            if ((ilo2.f() & 8) == 0) continue;
            int n2 = this.d;
            int n3 = Math.round(ilo2.e() * (float)(-n2));
            this.b.setTranslationY((float)(n2 + n3));
            break;
        }
    }

    @Override
    public final void c(ilo ilo2) {
        this.b.getLocationOnScreen(this.e);
        this.c = this.e[1];
    }

    @Override
    public final void d(ilo ilo2, ws ws2) {
        this.b.getLocationOnScreen(this.e);
        int n2 = this.e[1];
        this.d = n2 = this.c - n2;
        this.b.setTranslationY((float)n2);
    }
}

