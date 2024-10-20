/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.android.car.ui.toolbar.TabLayout;
import java.util.function.Consumer;

public final class bnh
implements View.OnClickListener {
    public final TabLayout a;
    public final int b;

    public /* synthetic */ bnh(TabLayout tabLayout, int n2) {
        this.a = tabLayout;
        this.b = n2;
    }

    public final void onClick(View object) {
        object = this.a;
        int n2 = this.b;
        int n3 = ((TabLayout)((Object)object)).b.size();
        if (n2 < n3) {
            n3 = ((TabLayout)((Object)object)).c;
            if (n2 != n3) {
                ((TabLayout)((Object)object)).c = n2;
                ((TabLayout)((Object)object)).a(n3);
                ((TabLayout)((Object)object)).a(n2);
                object = (bng)((TabLayout)((Object)object)).b.get(n2);
                Object object2 = ((bng)object).d;
                if (object2 != null) {
                    ag$$ExternalSyntheticApiModelOutline1.m((Consumer)object2, object);
                }
            }
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Tab position is invalid: "));
    }
}

