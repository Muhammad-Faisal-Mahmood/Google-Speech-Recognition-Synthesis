/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.libraries.assistant.soda.Soda;

public final class cmk
implements Runnable {
    public final cmn a;
    public final hwg b;
    public final long c;

    public /* synthetic */ cmk(cmn cmn2, hwg hwg2, long l2) {
        this.a = cmn2;
        this.b = hwg2;
        this.c = l2;
    }

    @Override
    public final void run() {
        ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleSharedResourcesTimeout", 280, "ConcurrentSodaManager.java")).t("TTL (%d seconds) reached - delete shared resources", this.b.b);
        cmn cmn2 = this.a;
        long l2 = cmn2.l;
        long l3 = this.c;
        if (l2 == l3) {
            Object object = igs.e;
            ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 651, "ConcurrentSodaManager.java")).u("#clearDiarizationCache: %s", object);
            if (cmn2.l == 0L) {
                object = cmn2.o;
                if (!cmn2.n.isEmpty() && object != null) {
                    cmn2.f(cmn2.n, (cmt)object);
                } else {
                    ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 661, "ConcurrentSodaManager.java")).r("No cache available to delete.");
                    return;
                }
            }
            cmn2.b();
            cmn2.d();
            boolean bl2 = Soda.nativeDeleteSharedResources(cmn2, cmn2.l);
            cmn2.l = 0L;
            cmn2.n = "";
            cmn2.o = null;
            ((heg)((heg)cmn.a.f()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 673, "ConcurrentSodaManager.java")).u("Shared resources deleted. DiarizationProcessor present: %b", bl2);
            if (cmn2.e.isPresent() && bl2) {
                ((cmo)cmn2.e.get()).b();
            }
            return;
        }
        ((heg)((heg)cmn.a.h()).j("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleSharedResourcesTimeout", 285, "ConcurrentSodaManager.java")).y("Attempted to delete shared resources %d but was %d.", l3, cmn2.l);
    }
}

