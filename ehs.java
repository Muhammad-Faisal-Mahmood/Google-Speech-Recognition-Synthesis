/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceCallback
 */
import android.media.AudioDeviceCallback;
import java.io.DataOutput;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Objects;

public final class ehs
extends jqs
implements jro {
    final Object a;
    private final int b;

    public ehs(bhd bhd2, jqb jqb2, int n2) {
        this.b = n2;
        this.a = bhd2;
        super(2, jqb2);
    }

    public ehs(eie eie2, jqb jqb2, int n2) {
        this.b = n2;
        this.a = eie2;
        super(2, jqb2);
    }

    public ehs(eie eie2, jqb jqb2, int n2, byte[] byArray) {
        this.b = n2;
        this.a = eie2;
        super(2, jqb2);
    }

    public ehs(eie eie2, jqb jqb2, int n2, char[] cArray) {
        this.b = n2;
        this.a = eie2;
        super(2, jqb2);
    }

    public ehs(evz evz2, jqb jqb2, int n2) {
        this.b = n2;
        this.a = evz2;
        super(2, jqb2);
    }

    public ehs(evz evz2, jqb jqb2, int n2, byte[] byArray) {
        this.b = n2;
        this.a = evz2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        RandomAccessFile randomAccessFile;
                        if (n2 != 4) {
                            jns.ak(object);
                            ((evz)this.a).f();
                            return jon.a;
                        }
                        jns.ak(object);
                        object = (heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initFile", 113, "AudioFileWriter.kt");
                        Object object2 = this.a;
                        Object object3 = (evz)object2;
                        object.u("#audio# persisting audio to %s", ((evz)object3).d());
                        try {
                            object = evz.h(((evz)object2).d());
                            ((evz)object2).i = randomAccessFile = new RandomAccessFile((File)object, "rw");
                        }
                        catch (Throwable throwable) {
                            object = jns.aj(throwable);
                        }
                        if (joe.a(object) == null) {
                            ((evz)object3).j = (File)object;
                            object = object2 = ((evz)object3).j;
                            if (object2 == null) {
                                jse.h("file");
                                object = null;
                            }
                            ((evz)object3).g(((File)object).getParentFile(), "wav");
                            object = object2 = ((evz)object3).i;
                            if (object2 == null) {
                                jse.h("raf");
                                object = null;
                            }
                            object2 = ((evz)object3).e;
                            jse.e(object, "output");
                            int n3 = ((evx)object2).b;
                            n2 = ewj.a(n3) * 8;
                            crh.J((DataOutput)object, "RIFF");
                            crh.I((DataOutput)object, 0, 4);
                            crh.J((DataOutput)object, "WAVE");
                            crh.J((DataOutput)object, "fmt ");
                            crh.I((DataOutput)object, 16, 4);
                            if (n3 == 4) {
                                crh.I((DataOutput)object, 3, 2);
                            } else {
                                crh.I((DataOutput)object, 1, 2);
                            }
                            int n4 = ((evx)object2).c;
                            n3 = ((evx)object2).d;
                            crh.I((DataOutput)object, n4, 2);
                            crh.I((DataOutput)object, n3, 4);
                            int n5 = n2 >> 3;
                            crh.I((DataOutput)object, n3 * n4 * n5, 4);
                            crh.I((DataOutput)object, n4 * n5, 2);
                            crh.I((DataOutput)object, n2, 2);
                            crh.J((DataOutput)object, "data");
                            crh.I((DataOutput)object, 0, 4);
                        } else {
                            ((heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initFile", 118, "AudioFileWriter.kt")).u("#audio# failed to make path %s", ((evz)object3).d());
                        }
                        object3 = this.a;
                        object = (heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initTimestampFile", 133, "AudioFileWriter.kt");
                        object2 = (evz)object3;
                        object.u("#audio# persisting audio timestamps (if present) to %s", ((evz)object2).e());
                        try {
                            object = evz.h(((evz)object3).e());
                            ((evz)object3).k = randomAccessFile = new RandomAccessFile((File)object, "rw");
                        }
                        catch (Throwable throwable) {
                            object = jns.aj(throwable);
                        }
                        if (joe.a(object) == null) {
                            ((evz)object2).l = (File)object;
                            object = ((evz)object2).l;
                            if (object == null) {
                                jse.h("timestampFile");
                                object = null;
                            }
                            ((evz)object2).g(((File)object).getParentFile(), "timestamps");
                        } else {
                            ((heg)evz.a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "initTimestampFile", 140, "AudioFileWriter.kt")).u("#audio# failed to make path %s", ((evz)object2).e());
                        }
                        return jon.a;
                    }
                    jns.ak(object);
                    return ((eie)this.a).c();
                }
                jns.ak(object);
                return ((eie)this.a).e();
            }
            jns.ak(object);
            object = bjc.a;
            bbi.a();
            Objects.toString(this.a);
            return jon.a;
        }
        jns.ak(object);
        object = (eie)this.a;
        ((eie)object).e();
        AudioDeviceCallback audioDeviceCallback = ((eie)object).h;
        ((eie)object).d.registerAudioDeviceCallback(audioDeviceCallback, null);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                            object = jon.a;
                            return ((ehs)object2).a(object);
                        }
                        object = ((jqm)this).c((jvb)object, (jqb)object2);
                        object2 = jon.a;
                        return ((ehs)object).a(object2);
                    }
                    object = ((jqm)this).c((jvb)object, (jqb)object2);
                    object2 = jon.a;
                    return ((ehs)object).a(object2);
                }
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((ehs)object2).a(object);
            }
            object2 = ((jqm)this).c((ass)object, (jqb)object2);
            object = jon.a;
            return ((ehs)object2).a(object);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((ehs)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return new ehs((evz)this.a, jqb2, 5, null);
                        }
                        return new ehs((evz)this.a, jqb2, 4);
                    }
                    return new ehs((eie)this.a, jqb2, 3, null);
                }
                return new ehs((eie)this.a, jqb2, 2, null);
            }
            return new ehs((bhd)this.a, jqb2, 1);
        }
        return new ehs((eie)this.a, jqb2, 0);
    }
}

