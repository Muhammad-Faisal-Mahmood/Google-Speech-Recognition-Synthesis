/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;

public final class buq
implements View.OnClickListener {
    public final but a;
    public final int b;
    public final bvj c;
    private final int d;

    public /* synthetic */ buq(but but2, int n2, bvj bvj2, int n3) {
        this.d = n3;
        this.a = but2;
        this.b = n2;
        this.c = bvj2;
    }

    public final void onClick(View object) {
        if (this.d != 0) {
            int n2 = this.b;
            but but2 = this.a;
            but2.b = n2;
            object = this.c;
            but2.a.F(((bvj)object).c);
            String string = ((bvj)object).b.toString();
            but2.c.e(string, ((bvj)object).c);
            but2.a(blf.e(((bvj)object).a, ((bvj)object).b));
            return;
        }
        int n3 = this.b;
        object = this.a;
        ((but)object).b = n3;
        bvj bvj2 = this.c;
        String string = bvj2.b.toString();
        ((but)object).c.e(string, bvj2.c);
        ((but)object).a(blf.e(bvj2.a, bvj2.b));
    }
}

