/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import com.android.car.ui.baselayout.Insets;

public final class bjv
implements bju {
    public bju a;
    public Insets b = new Insets();
    private final Activity c;
    private final View d;

    public bjv(Activity activity, View view) {
        this.c = activity;
        this.d = view;
    }

    @Override
    public final void a(Insets insets) {
        if (!this.b.equals(insets)) {
            boolean bl2;
            this.b = insets;
            Object object = this.a;
            if (object != null) {
                object.a(insets);
                return;
            }
            object = this.c;
            if (object instanceof bju) {
                object.a(insets);
                bl2 = true;
            } else {
                bl2 = false;
            }
            object = this.c;
            boolean bl3 = bl2;
            if (object instanceof bh) {
                object = ((bh)object).bb().h().iterator();
                while (true) {
                    bl3 = bl2;
                    if (!object.hasNext()) break;
                    be be2 = (be)object.next();
                    if (!(be2 instanceof bju)) continue;
                    ((bju)((Object)be2)).a(insets);
                    bl2 = true;
                }
            }
            if (!bl3) {
                this.d.setPadding(insets.getLeft(), insets.getTop(), insets.getRight(), insets.getBottom());
            }
        }
    }
}

