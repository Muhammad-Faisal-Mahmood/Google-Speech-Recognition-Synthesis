/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 */
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import com.android.car.ui.recyclerview.DefaultScrollBar;

public final class bmw
implements View.OnFocusChangeListener {
    public final ViewGroup a;
    private final int b;

    public /* synthetic */ bmw(ViewGroup viewGroup, int n2) {
        this.b = n2;
        this.a = viewGroup;
    }

    public final void onFocusChange(View object, boolean bl2) {
        if (this.b != 0) {
            object = ((blp)this.a).c;
            if (object != null) {
                ((DefaultScrollBar)object).setHighlightThumb(bl2);
            }
            return;
        }
        if (!bl2) {
            ViewGroup viewGroup = this.a;
            object = object.getWindowToken();
            ((bna)viewGroup).h.hideSoftInputFromWindow((IBinder)object, 0);
        }
    }
}

