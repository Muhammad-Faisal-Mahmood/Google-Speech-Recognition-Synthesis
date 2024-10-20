/*
 * Decompiled with CFR 0.152.
 */
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.RandomAccessFile;

public final class eme
extends jqs
implements jro {
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public eme(eie eie2, ehb ehb2, ehb ehb3, egz egz2, jqb jqb2, int n2) {
        this.e = n2;
        this.d = eie2;
        this.b = ehb2;
        this.a = ehb3;
        this.c = egz2;
        super(2, jqb2);
    }

    public eme(emg emg2, efo efo2, ebv ebv2, jrk jrk2, jqb jqb2, int n2) {
        this.e = n2;
        this.a = emg2;
        this.b = efo2;
        this.c = ebv2;
        this.d = jrk2;
        super(2, jqb2);
    }

    public eme(evz evz2, hvu hvu2, Integer n2, Long l2, jqb jqb2, int n3) {
        this.e = n3;
        this.c = evz2;
        this.b = hvu2;
        this.a = n2;
        this.d = l2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                jns.ak(object);
                if (!((evz)this.c).h.b() && ((evz)this.c).i != null && !((hvu)this.b).x()) {
                    Object object2 = this.b;
                    object = this.c;
                    Object object3 = ((hvu)object2).y();
                    object = (evz)object;
                    ((evz)object).f += ((byte[])object3).length;
                    Object object4 = ((evz)object).i;
                    object2 = null;
                    object = object4;
                    if (object4 == null) {
                        jse.h("raf");
                        object = null;
                    }
                    object4 = crh.S((RandomAccessFile)object, new etv(object3, 3));
                    object = this.c;
                    if (joe.a(object4) != null) {
                        object4 = (heg)evz.a.h().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter$writeBytesWithMetadata$1", "invokeSuspend", 184, "AudioFileWriter.kt");
                        object = (evz)object;
                        object4.u("#audio# writing audio(%s) failed, finalizing...", ((evz)object).d());
                        ((evz)object).f();
                    }
                    object = object4 = ((evz)this.c).i;
                    if (object4 == null) {
                        jse.h("raf");
                        object = null;
                    }
                    n2 = ((evz)this.c).f;
                    jse.e(object, "output");
                    ((RandomAccessFile)object).seek(4L);
                    crh.I((DataOutput)object, n2 + 36, 4);
                    ((RandomAccessFile)object).seek(40L);
                    crh.I((DataOutput)object, n2, 4);
                    ((RandomAccessFile)object).seek(((RandomAccessFile)object).length());
                    object = this.c;
                    object3 = this.a;
                    object4 = this.d;
                    object = (evz)object;
                    if (((evz)object).k != null && object3 != null && object4 != null) {
                        String string = hms.a(crh.Q((Long)object4)).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd'T'HH:mm:ss.SSS"));
                        jse.d(string, "format(...)");
                        object = ((evz)object).k;
                        if (object == null) {
                            jse.h("timestampRaf");
                            object = object2;
                        }
                        crh.S((RandomAccessFile)object, new evy(object4, (Object)string, object3, 0));
                    }
                    object = (evz)this.c;
                    n2 = ((evz)object).g;
                    if (((evz)object).f >= n2) {
                        ((heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter$writeBytesWithMetadata$1", "invokeSuspend", 192, "AudioFileWriter.kt")).u("#audio# audio(%s) reached maximum size, finalizing...", ((evz)this.c).d());
                        ((evz)this.c).f();
                    }
                }
                return jon.a;
            }
            jns.ak(object);
            object = this.c;
            Object object5 = this.a;
            object = new evy(this.b, object5, object, 1);
            return gpm.y(((eie)this.d).n, (jrk)object);
        }
        jns.ak(object);
        object = this.b;
        try {
            object = object.a();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        Object object6 = this.d;
        Object object7 = this.c;
        ebq ebq2 = ekr.f(ebp.a);
        Object object8 = object;
        if (object instanceof jod) {
            object8 = ebq2;
        }
        object = (ebq)object8;
        jse.b(object);
        object6.a(ekr.i((ebq)object, (ebv)object7));
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((eme)object2).a(object);
            }
            object = ((jqm)this).c((jvb)object, (jqb)object2);
            object2 = jon.a;
            return ((eme)object).a(object2);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((eme)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2 = this.c;
                Object object3 = this.b;
                Object object4 = this.a;
                object = (Long)this.d;
                object4 = (Integer)object4;
                object3 = (hvu)object3;
                return new eme((evz)object2, (hvu)object3, (Integer)object4, (Long)object, jqb2, 2);
            }
            Object object5 = this.d;
            Object object6 = this.b;
            Object object7 = this.a;
            object = (egz)this.c;
            object7 = (ehb)((Object)object7);
            object6 = (ehb)((Object)object6);
            return new eme((eie)object5, (ehb)((Object)object6), (ehb)((Object)object7), (egz)object, jqb2, 1);
        }
        object = this.a;
        Object object8 = this.b;
        Object object9 = this.c;
        Object object10 = this.d;
        object9 = (ebv)object9;
        return new eme((emg)object, (efo)object8, (ebv)object9, (jrk)object10, jqb2, 0);
    }
}

