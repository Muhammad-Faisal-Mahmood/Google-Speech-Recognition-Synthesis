/*
 * Decompiled with CFR 0.152.
 */
public final class eds {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter");
    public final edo a;
    private final ekk c;
    private final ell d;
    private final bzo e;

    public eds(edo edo2, ekk ekk2, bzo bzo2, ell ell2) {
        this.a = edo2;
        this.c = ekk2;
        this.e = bzo2;
        this.d = ell2;
    }

    private final boolean c() {
        eln eln2 = (eln)this.c.d.f();
        if (eln2 == null) {
            return false;
        }
        return !this.d.d(dpf.o(this.a), eln2);
    }

    public final gto a(edq object) {
        jse.e(object, "params");
        if (!this.c.a.isDone()) {
            if (!this.c()) {
                eds eds2 = (eds)this.e.l(this.a).f();
                if (eds2 != null) {
                    object = eds2.a((edq)object);
                    jse.d(object, "startListening(...)");
                    return object;
                }
                ((heg)b.h().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "startListening", 69, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Failed to start listening (%s), no adapter", this.a.name());
                throw new elx(elb.e(ebs.aa));
            }
            ((heg)b.h().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "startListening", 57, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Failed to start listening (%s), no connection", this.a.name());
            throw new elx(elb.e(ebs.Z));
        }
        ((heg)b.h().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "startListening", 47, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Failed to start listening (%s), route disconnected", this.a.name());
        throw new elx(elb.e(ebs.f));
    }

    public final hpn b(edr object) {
        jse.e(object, "params");
        if (this.c.a.isDone()) {
            ((heg)b.f().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "stopListening", 85, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Skipping stop listening (%s), route disconnected", this.a.name());
            object = dww.l(ebq.a.l());
            ((bzb)object).u(ebr.b);
            return hhk.K(((bzb)object).s());
        }
        if (this.c()) {
            ((heg)b.f().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "stopListening", 94, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Skipping stop listening (%s), no connection", this.a.name());
            object = dww.l(ebq.a.l());
            ((bzb)object).u(ebr.b);
            return hhk.K(((bzb)object).s());
        }
        eds eds2 = (eds)this.e.l(this.a).f();
        if (eds2 == null) {
            ((heg)b.f().j("com/google/android/libraries/search/audio/audioadapter/impl/RouteConnectionAwareAudioAdapter", "stopListening", 106, "RouteConnectionAwareAudioAdapter.kt")).u("#audio# Skipping stop listening (%s), no adapter", this.a.name());
            object = dww.l(ebq.a.l());
            ((bzb)object).t(ebp.G);
            return hhk.K(((bzb)object).s());
        }
        return eds2.b((edr)object);
    }
}

