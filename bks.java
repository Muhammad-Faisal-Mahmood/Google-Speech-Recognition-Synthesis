/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

final class bks
implements kq {
    final bku a;

    public bks(bku bku2) {
        this.a = bku2;
    }

    @Override
    public final void a(View view) {
        bku bku2 = this.a;
        if (bku2.ag == null) {
            bku2.ag = view.getParent();
        }
        if (this.a.d.getChildLayoutPosition(view) == this.a.ah) {
            view.requestFocus();
        }
    }

    @Override
    public final void b() {
    }
}

