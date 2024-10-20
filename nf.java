/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.window.OnBackInvokedDispatcher
 */
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public final class nf {
    public final joy a;
    public my b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public nf() {
        this(null);
    }

    public nf(Runnable object) {
        this.c = object;
        this.a = new joy();
        if (Build.VERSION.SDK_INT >= 33) {
            object = Build.VERSION.SDK_INT >= 34 ? new nb(new mz(this, 0), new mz(this, 2), new mq(this, 3), new mq(this, 4)) : new na(new mq(this, 5), 0);
            this.d = object;
        }
    }

    private final void e(boolean bl2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (bl2) {
                if (!this.f) {
                    a$$ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                    this.f = true;
                    return;
                }
            } else if (this.f) {
                a$$ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void a() {
        Object object;
        Object object2 = object = this.b;
        if (object == null) {
            block3: {
                object2 = this.a;
                object = object2.listIterator(((joy)object2).a);
                while (object.hasPrevious()) {
                    object2 = object.previous();
                    if (!((my)object2).b) continue;
                    break block3;
                }
                object2 = null;
            }
            object2 = (my)object2;
        }
        this.b = null;
        if (object2 != null) {
            ((my)object2).a();
        }
    }

    public final void b() {
        Object object;
        Object object2 = object = this.b;
        if (object == null) {
            block4: {
                object2 = this.a;
                object = object2.listIterator(((joy)object2).a);
                while (object.hasPrevious()) {
                    object2 = object.previous();
                    if (!((my)object2).b) continue;
                    break block4;
                }
                object2 = null;
            }
            object2 = (my)object2;
        }
        this.b = null;
        if (object2 != null) {
            ((my)object2).b();
            return;
        }
        object2 = this.c;
        if (object2 != null) {
            object2.run();
        }
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        jse.e(onBackInvokedDispatcher, "invoker");
        this.e = onBackInvokedDispatcher;
        this.e(this.g);
    }

    public final void d() {
        boolean bl2;
        boolean bl3;
        block4: {
            bl3 = this.g;
            Object object = this.a;
            bl2 = object.isEmpty();
            boolean bl4 = false;
            if (bl2) {
                bl2 = bl4;
            } else {
                object = object.iterator();
                do {
                    bl2 = bl4;
                    if (!object.hasNext()) break block4;
                } while (!((my)object.next()).b);
                bl2 = true;
            }
        }
        this.g = bl2;
        if (bl2 != bl3 && Build.VERSION.SDK_INT >= 33) {
            this.e(bl2);
        }
    }
}

