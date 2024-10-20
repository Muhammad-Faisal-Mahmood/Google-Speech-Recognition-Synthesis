/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Observable
 */
import android.database.Observable;

final class kg
extends Observable {
    public final void a() {
        int n2 = this.mObservers.size();
        while (--n2 >= 0) {
            ((kh)this.mObservers.get(n2)).onChanged();
        }
    }

    public final void b(int n2, int n3) {
        int n4 = this.mObservers.size();
        while (--n4 >= 0) {
            ((kh)this.mObservers.get(n4)).onItemRangeMoved(n2, n3, 1);
        }
    }

    public final void c(int n2, int n3) {
        this.d(n2, n3, null);
    }

    public final void d(int n2, int n3, Object object) {
        int n4 = this.mObservers.size();
        while (--n4 >= 0) {
            ((kh)this.mObservers.get(n4)).onItemRangeChanged(n2, n3, object);
        }
    }

    public final void e(int n2, int n3) {
        int n4 = this.mObservers.size();
        while (--n4 >= 0) {
            ((kh)this.mObservers.get(n4)).onItemRangeInserted(n2, n3);
        }
    }

    public final void f(int n2, int n3) {
        int n4 = this.mObservers.size();
        while (--n4 >= 0) {
            ((kh)this.mObservers.get(n4)).onItemRangeRemoved(n2, n3);
        }
    }

    public final void g() {
        int n2 = this.mObservers.size();
        while (--n2 >= 0) {
            ((kh)this.mObservers.get(n2)).onStateRestorationPolicyChanged();
        }
    }

    public final boolean h() {
        return !this.mObservers.isEmpty();
    }
}

