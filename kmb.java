/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public final class kmb {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public kmb() {
        Object object;
        this.c = new klm();
        this.d = object = new ReentrantLock();
        ReentrantLock reentrantLock = object;
        object = ((ReentrantLock)object).newCondition();
        jse.d(object, "newCondition(...)");
        this.e = object;
        this.f = new klz(this);
        this.g = new kma(this);
    }

    public kmb(khp khp2, kgh kgh2, khl khl2, kib kib2) {
        jse.e(khl2, "finder");
        this.c = khp2;
        this.e = kgh2;
        this.d = khl2;
        this.g = kib2;
        this.f = kib2.c();
    }

    public final kgu a(boolean bl2) {
        kgu kgu2;
        block3: {
            try {
                kgu2 = this.g.b(bl2);
                if (kgu2 == null) break block3;
            }
            catch (IOException iOException) {
                this.d(iOException);
                throw iOException;
            }
            kgu2.i = this;
        }
        return kgu2;
    }

    public final void b() {
        this.g.c().e();
    }

    public final void c() {
        ((khp)this.c).i(this, true, false, null);
    }

    public final void d(IOException iOException) {
        this.a = true;
        ((khl)this.d).b(iOException);
        Object object = this.c;
        this.g.c().g((khp)object, iOException);
    }

    public final IOException e(boolean bl2, boolean bl3, IOException iOException) {
        if (iOException != null) {
            this.d(iOException);
        }
        return ((khp)this.c).i(this, bl3, bl2, iOException);
    }
}

