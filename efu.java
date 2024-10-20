/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextParams
 *  android.content.ContextParams$Builder
 *  android.media.AudioFormat$Builder
 *  android.media.AudioRecord
 *  android.media.AudioRecord$Builder
 *  android.media.MediaRecorder
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.ContextParams;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Build;

public final class efu {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory");
    private final ege b;

    public efu(ege ege2) {
        jse.e(ege2, "audioRecordAttribution");
        this.b = ege2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AudioRecord a(efx object) {
        Object object2;
        jse.e(object, "params");
        hei hei2 = a;
        ((heg)hei2.f().h(hfo.a, "ALT.AudioRecordFactory").j("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 38, "DefaultAudioRecordFactory.kt")).r("#audio# createAudioRecord");
        Object object3 = object2 = ((efx)object).e;
        if (object2 == null) {
            object3 = eae.a;
        }
        if (((eae)object3).c > MediaRecorder.getAudioSourceMax()) {
            throw new elx("#createAudioRecord failed: invalid android audio source, only non-system supported.", elb.e(ebs.V));
        }
        try {
            int n2;
            AudioFormat.Builder builder = new AudioFormat.Builder();
            object3 = object2 = ((efx)object).e;
            if (object2 == null) {
                object3 = eae.a;
            }
            builder = builder.setEncoding(((eae)object3).f);
            object3 = object2 = ((efx)object).e;
            if (object2 == null) {
                object3 = eae.a;
            }
            builder = builder.setSampleRate(((eae)object3).d);
            if ((((efx)object).b & 0x20) != 0) {
                builder.setChannelIndexMask(((efx)object).j);
            } else {
                object3 = object2 = ((efx)object).e;
                if (object2 == null) {
                    object3 = eae.a;
                }
                builder.setChannelMask(((eae)object3).e);
            }
            AudioRecord.Builder builder2 = new AudioRecord.Builder();
            object3 = object2 = ((efx)object).e;
            if (object2 == null) {
                object3 = eae.a;
            }
            builder = builder2.setAudioSource(((eae)object3).c).setAudioFormat(builder.build());
            object3 = object2 = ((efx)object).e;
            if (object2 == null) {
                object3 = eae.a;
            }
            n2 = (n2 = ((eae)object3).d) > 16000 ? 128000 / n2 : 8;
            builder = builder.setBufferSizeInBytes(Math.max(ekn.a((eae)object3, n2), AudioRecord.getMinBufferSize((int)((eae)object3).d, (int)((eae)object3).e, (int)((eae)object3).f)));
            object2 = this.b;
            jse.b(builder);
            jse.e(builder, "builder");
            jse.e(object, "params");
            int n3 = ((efx)object).c;
            n2 = n3 != 0 ? (n3 != 4 ? (n3 != 6 ? 0 : 2) : 1) : 3;
            if (n2 != 0) {
                block26: {
                    if (--n2 != 0) {
                        if (n2 != 1) {
                            if (n2 == 2) {
                                ((heg)ege.a.f().h(hfo.a, "ALT.AudioRecordAttrId").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAttribution", "attributePermissively", 47, "AudioRecordAttribution.kt")).r("#audio# no audio record attribution specified, continue without...");
                                break block26;
                            } else {
                                object = new joa();
                                throw object;
                            }
                        }
                        if (n3 == 6) {
                            object = object3 = eyf.b((Integer)((efx)object).d);
                            if (object3 == null) {
                                object = eyf.a;
                            }
                        } else {
                            object = eyf.a;
                        }
                        jse.d(object, "getAttributionId(...)");
                        if (Build.VERSION.SDK_INT >= 31) {
                            object2 = ((ege)object2).b;
                            jse.e(object, "attributionId");
                            object3 = object2;
                            if (Build.VERSION.SDK_INT >= 30) {
                                object3 = sk$$ExternalSyntheticApiModelOutline1.m((Context)object2, crh.G((eyf)object));
                                jse.d(object3, "createAttributionContext(...)");
                            }
                            ut$$ExternalSyntheticApiModelOutline0.m((AudioRecord.Builder)builder, (Context)object3);
                        }
                    } else {
                        object = n3 == 4 ? (edk)((efx)object).d : edk.a;
                        jse.d(object, "getAttributionKey(...)");
                        if (Build.VERSION.SDK_INT < 31) {
                            object = new elx("failed to append attribution source, outdated Android SDK.", elb.e(ebs.K));
                            throw object;
                        }
                        object3 = ((ege)object2).c.l((edk)object);
                        if (!((gto)object3).g()) {
                            object = new elx("failed to append attribution source, missing", elb.e(ebs.I));
                            throw object;
                        }
                        object = new ContextParams.Builder();
                        object = ut$$ExternalSyntheticApiModelOutline0.m(ut$$ExternalSyntheticApiModelOutline0.m((ContextParams.Builder)object, ut$$ExternalSyntheticApiModelOutline0.m(((gto)object3).c())));
                        jse.d(object, "build(...)");
                        ut$$ExternalSyntheticApiModelOutline0.m((AudioRecord.Builder)builder, ut$$ExternalSyntheticApiModelOutline0.m(((ege)object2).b, (ContextParams)object));
                    }
                }
                object = builder.build();
                if (object.getState() == 1) {
                    return object;
                }
                ((heg)hei2.h().h(hfo.a, "ALT.AudioRecordFactory").j("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 65, "DefaultAudioRecordFactory.kt")).r("#audio# createAudioRecord failed: state initialized error.");
                object.release();
                object = new elx("#createAudioRecord failed: audio record state initialized error.", elb.e(ebs.q));
                throw object;
            }
            throw null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ((heg)a.h().h(hfo.a, "ALT.AudioRecordFactory").j("com/google/android/libraries/search/audio/audiosource/audiorecord/impl/DefaultAudioRecordFactory", "create", 74, "DefaultAudioRecordFactory.kt")).r("#audio# createAudioRecord failed: error creating audio record.");
            throw new elx("#createAudioRecord failed: error creating audio record.", elb.e(ebs.q), illegalArgumentException);
        }
    }
}

