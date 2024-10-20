/*
 * Decompiled with CFR 0.152.
 */
import org.chromium.base.ApplicationStatus;

public final class kpk
extends kpa
implements kmr {
    private boolean b;

    @Override
    public final void a() {
        int n2;
        if (this.b) {
            return;
        }
        knb knb2 = ApplicationStatus.b;
        if (knb2 != null && (n2 = knb2.a.indexOf(this)) != -1) {
            if (knb2.b == 0) {
                knb2.a.remove(n2);
            } else {
                knb2.d = true;
                knb2.a.set(n2, null);
            }
            --knb2.c;
        }
        this.b = true;
    }

    @Override
    protected final void b(kpb kpb2) {
        this.a = kpb2;
        ApplicationStatus.a(this);
        ApplicationStatus.hasVisibleActivities();
        this.a.f();
    }
}

