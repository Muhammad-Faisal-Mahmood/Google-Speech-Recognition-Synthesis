/*
 * Decompiled with CFR 0.152.
 */
final class eoo
extends jqs
implements jro {
    final ebu a;
    final Object b;
    final Object c;
    private final int d;

    public eoo(eoi eoi2, eom eom2, ebu ebu2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = eoi2;
        this.b = eom2;
        this.a = ebu2;
        super(2, jqb2);
    }

    public eoo(eoq eoq2, eom eom2, ebu ebu2, jqb jqb2, int n2) {
        this.d = n2;
        this.b = eoq2;
        this.c = eom2;
        this.a = ebu2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        if (this.d != 0) {
            jns.ak(object);
            object = (heg)eoi.a.f().h(hfo.a, "ALT.AdapterSrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioAdapterAudioSourceDataAccessor$copyStarted$1", "invokeSuspend", 242, "AudioAdapterAudioSourceDataAccessor.kt");
            Object object2 = (eoi)this.c;
            object.G("#audio# copying %s session(%d) source, offset(%s)", ((eoi)object2).o(), new Integer(((eoi)object2).c), this.b);
            object2 = this.c;
            object = ebs.o;
            ((eoi)object2).p((ebs)object);
            object = this.b;
            object2 = this.a;
            return ((eoi)this.c).c((ebu)object2, (eom)object);
        }
        jns.ak(object);
        object = (heg)eoq.a.f().h(hfo.a, "ALT.SrcAccessor").j("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl$copyStarted$1", "invokeSuspend", 179, "AudioSourceDataAccessorImpl.kt");
        Object object3 = this.c;
        object.C("#audio# copying audio source(%s), offset(%s)", ((eoq)this.b).h, object3);
        object3 = this.b;
        object = ebs.o;
        ((eoq)object3).l((ebs)object);
        object3 = this.c;
        object = this.a;
        return ((eoq)this.b).c((ebu)object, (eom)object3);
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.d != 0) {
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((eoo)object2).a(object);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((eoo)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.d != 0) {
            Object object2 = this.c;
            object = this.b;
            ebu ebu2 = this.a;
            return new eoo((eoi)object2, (eom)object, ebu2, jqb2, 1);
        }
        Object object3 = this.b;
        object = this.c;
        ebu ebu3 = this.a;
        return new eoo((eoq)object3, (eom)object, ebu3, jqb2, 0);
    }
}

