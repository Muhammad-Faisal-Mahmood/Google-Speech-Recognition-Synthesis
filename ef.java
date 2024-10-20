/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window$Callback
 */
import android.view.Menu;
import android.view.Window;

public final class ef
implements gd {
    final Object a;
    private final int b;

    public ef(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(fs object, boolean bl2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                gd gd2;
                if (object instanceof gl) {
                    ((fs)object).a().i(false);
                }
                if ((gd2 = ((fi)this.a).e) != null) {
                    gd2.a((fs)object, bl2);
                }
                return;
            }
            ((eg)this.a).z((fs)object);
            return;
        }
        fs fs2 = ((fs)object).a();
        Object object2 = fs2 != object ? fs2 : object;
        if ((object2 = ((eg)this.a).u((Menu)object2)) != null) {
            if (fs2 != object) {
                object = this.a;
                n2 = ((ee)object2).a;
                ((eg)object).y(n2, (ee)object2, fs2);
                ((eg)this.a).A((ee)object2, true);
                return;
            }
            ((eg)this.a).A((ee)object2, bl2);
        }
    }

    @Override
    public final boolean b(fs fs2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = this.a;
                if (fs2 != ((gy)object).c) {
                    Object object2 = ((gl)fs2).l;
                    object2 = ((fi)object).e;
                    if (object2 != null) {
                        return object2.b(fs2);
                    }
                }
                return false;
            }
            Window.Callback callback = ((eg)this.a).w();
            if (callback != null) {
                callback.onMenuOpened(108, (Menu)fs2);
            }
            return true;
        }
        if (fs2 == fs2.a()) {
            eg eg2 = (eg)this.a;
            if (eg2.y && (eg2 = eg2.w()) != null && !((eg)this.a).F) {
                eg2.onMenuOpened(108, fs2);
            }
        }
        return true;
    }
}

