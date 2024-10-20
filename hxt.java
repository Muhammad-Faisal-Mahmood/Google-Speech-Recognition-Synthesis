/*
 * Decompiled with CFR 0.152.
 */
public class hxt {
    protected volatile hyf a;
    public volatile hvu b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hvu a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = this.a == null ? hvu.b : this.a.e();
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hyf b(hyf hyf2) {
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a != null) {
                return this.a;
            }
            try {
                this.a = hyf2;
                this.b = hvu.b;
            }
            catch (hxn hxn2) {
                this.a = hyf2;
                this.b = hvu.b;
            }
            return this.a;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hxt)) {
            return false;
        }
        object = (hxt)object;
        hyf hyf2 = this.a;
        hyf hyf3 = ((hxt)object).a;
        if (hyf2 == null && hyf3 == null) {
            return this.a().equals(((hxt)object).a());
        }
        if (hyf2 != null && hyf3 != null) {
            return hyf2.equals(hyf3);
        }
        if (hyf2 != null) {
            return hyf2.equals(((hxt)object).b(hyf2.t()));
        }
        return this.b(hyf3.t()).equals(hyf3);
    }

    public int hashCode() {
        return 1;
    }
}

