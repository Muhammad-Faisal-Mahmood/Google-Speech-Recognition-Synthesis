/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.libraries.assistant.soda.Soda;

public final class cmp
implements hpb {
    private final int a;

    public cmp(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.a != 0) {
            a.as(Soda.a.g(), "Error setting up data provider.", "com/google/android/libraries/assistant/soda/Soda$1", "onFailure", '\u018e', "Soda.java", throwable);
            return;
        }
        a.as(Soda.a.g(), "Error tearing down data provider.", "com/google/android/libraries/assistant/soda/Soda$2", "onFailure", '\u0485', "Soda.java", throwable);
    }

    @Override
    public final void b(Object object) {
        if (this.a != 0) {
            ((heg)((heg)Soda.a.f()).j("com/google/android/libraries/assistant/soda/Soda$1", "onSuccess", 393, "Soda.java")).r("Successfully set up data provider.");
            return;
        }
        ((heg)((heg)Soda.a.f()).j("com/google/android/libraries/assistant/soda/Soda$2", "onSuccess", 1152, "Soda.java")).r("Successfully tore down data provider.");
    }
}

