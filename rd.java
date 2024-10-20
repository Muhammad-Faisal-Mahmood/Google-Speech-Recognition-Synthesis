/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Canvas
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public class rd
extends View {
    public int[] c = new int[32];
    public int d;
    protected final Context e;
    public String f;
    public final HashMap g = new HashMap();
    public qk h;

    public rd(Context context) {
        super(context);
        this.e = context;
        this.c();
    }

    private final void b(int n2) {
        if (n2 == this.getId()) {
            return;
        }
        int n3 = this.d;
        int[] nArray = this.c;
        int n4 = nArray.length;
        if (n3 + 1 > n4) {
            this.c = Arrays.copyOf(nArray, n4 + n4);
        }
        nArray = this.c;
        n4 = this.d;
        nArray[n4] = n2;
        this.d = n4 + 1;
    }

    public void a(qg qg2, boolean bl2) {
    }

    protected void c() {
    }

    public final int d(ConstraintLayout constraintLayout, String string) {
        Resources resources;
        if (string != null && (resources = this.e.getResources()) != null) {
            int n2 = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                String string2;
                View view = constraintLayout.getChildAt(i2);
                if (view.getId() == -1) continue;
                try {
                    string2 = resources.getResourceEntryName(view.getId());
                }
                catch (Resources.NotFoundException notFoundException) {
                    string2 = null;
                }
                if (!string.equals(string2)) continue;
                return view.getId();
            }
        }
        return 0;
    }

    public final void e(int[] nArray) {
        this.f = null;
        this.d = 0;
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            this.b(nArray[i2]);
        }
    }

    public final void f() {
        ViewGroup.LayoutParams layoutParams;
        if (this.h != null && (layoutParams = this.getLayoutParams()) instanceof rf) {
            ((rf)layoutParams).av = this.h;
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    protected final void onMeasure(int n2, int n3) {
        this.setMeasuredDimension(0, 0);
    }

    public final void setTag(int n2, Object object) {
        super.setTag(n2, object);
        if (object == null) {
            this.b(n2);
        }
    }
}

