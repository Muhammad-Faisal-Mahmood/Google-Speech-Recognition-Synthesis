/*
 * Decompiled with CFR 0.152.
 */
public final class dob
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;

    public dob(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public final doa a() {
        return new doa(((ilt)this.a).a(), ((dkp)this.b).a(), this.c, this.d);
    }
}

