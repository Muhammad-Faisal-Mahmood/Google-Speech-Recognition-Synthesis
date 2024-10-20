/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.window.OnBackInvokedDispatcher
 */
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

public final class aax
implements abc {
    final Object a;
    final Object b;
    private final int c;

    public aax(abb abb2, awf awf2, int n2) {
        this.c = n2;
        this.a = abb2;
        this.b = awf2;
    }

    public /* synthetic */ aax(nf nf2, mr mr2, int n2) {
        this.c = n2;
        this.b = nf2;
        this.a = mr2;
    }

    @Override
    public final void a(abe object, aaz object2) {
        if (this.c != 0) {
            if (object2 == aaz.ON_CREATE) {
                object2 = this.a;
                object = this.b;
                object2 = a$$ExternalSyntheticApiModelOutline0.m((Activity)object2);
                jse.d(object2, "activity.getOnBackInvokedDispatcher()");
                ((nf)object).c((OnBackInvokedDispatcher)object2);
            }
            return;
        }
        if (object2 == aaz.ON_START) {
            ((abb)this.a).c(this);
            ((awf)this.b).c(aaw.class);
        }
    }
}

