/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

public class r
extends m {
    public final ArrayList al = new ArrayList();

    public void D() {
        ((m)this).q();
        Object object = this.al;
        if (object != null) {
            int n2 = ((ArrayList)object).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object = (m)this.al.get(i2);
                if (!(object instanceof r)) continue;
                ((r)object).D();
            }
        }
    }

    public final void F(m m2) {
        this.al.remove(m2);
        m2.r = null;
    }

    @Override
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override
    public final void n(int n2, int n3) {
        super.n(n2, n3);
        n3 = this.al.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ((m)this.al.get(n2)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override
    public final void q() {
        super.q();
        Object object = this.al;
        if (object != null) {
            int n2 = ((ArrayList)object).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object = (m)this.al.get(i2);
                ((m)object).n(this.b(), this.c());
                if (object instanceof n) continue;
                ((m)object).q();
            }
        }
    }

    @Override
    public final void z(AmbientDelegate ambientDelegate) {
        super.z(ambientDelegate);
        int n2 = this.al.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((m)this.al.get(i2)).z(ambientDelegate);
        }
    }
}

