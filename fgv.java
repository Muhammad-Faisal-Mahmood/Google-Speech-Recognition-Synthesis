/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class fgv
implements Callable {
    public final fgw a;

    public /* synthetic */ fgv(fgw fgw2) {
        this.a = fgw2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Object object = this.a;
        if (!((fgw)object).b.g.isPresent()) {
            return Uri.EMPTY;
        }
        fkj fkj2 = ((fgw)object).d;
        eae eae2 = ((fgw)object).c();
        Object object2 = ((fgw)object).d();
        object = ((fgw)object).b.g.get();
        Object object3 = eyx.values();
        int n2 = ((eyx[])object3).length;
        int n3 = 0;
        while (n3 < n2) {
            eyx eyx2 = object3[n3];
            if (eyx2.f == object) {
                object = new File(new File(fkj2.b.getFilesDir(), "recordings"), "recording.amr");
                object3 = fkj2.b;
                awg awg2 = ss.b((Context)object3, String.valueOf(object3.getPackageName()).concat(".AudioRecordingProvider"));
                CharSequence charSequence = ((File)object).getCanonicalPath();
                Iterator iterator = ((HashMap)awg2.b).entrySet().iterator();
                object = null;
                while (iterator.hasNext()) {
                    object3 = iterator.next();
                    String string = ((File)object3.getValue()).getPath();
                    if (!awg.g((String)charSequence, string) || object != null && string.length() <= ((File)object.getValue()).getPath().length()) continue;
                    object = object3;
                }
                if (object == null) throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(charSequence)));
                object3 = ((File)object.getValue()).getPath();
                object3 = ((String)object3).endsWith("/") ? ((String)charSequence).substring(((String)object3).length()) : ((String)charSequence).substring(((String)object3).length() + 1);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(Uri.encode((String)((String)object.getKey())));
                ((StringBuilder)charSequence).append('/');
                ((StringBuilder)charSequence).append(Uri.encode((String)object3, (String)"/"));
                object = ((StringBuilder)charSequence).toString();
                object3 = new Uri.Builder().scheme("content").authority((String)awg2.a).encodedPath((String)object).build();
                fkj2.b.revokeUriPermission((Uri)object3, 1);
                object2 = hvu.u((InputStream)object2).y();
                object = eyx2.f;
                if (object == icq.d) {
                    n3 = 8000;
                } else {
                    if (object != icq.j) {
                        if (object != icq.k) throw new RuntimeException("Unsupported AMR encoding: ".concat(String.valueOf(((Enum)object).name())));
                    }
                    n3 = 16000;
                }
                int n4 = eae2.d;
                object = object2;
                if (n4 != n3) {
                    n2 = ((Object)object2).length;
                    ((heg)((heg)fkk.a.f()).j("com/google/android/libraries/speech/transcription/recording/PcmResampler", "resample", 20, "PcmResampler.java")).v("Resampling from %d to %d", n4, n3);
                    fxf.r(true, "length must be greater than or equal to 0");
                    if (n4 == n3) {
                        n3 = n2;
                    } else {
                        if (n4 < n3) throw new UnsupportedOperationException("Upsampling is not supported yet");
                        int n5 = n4 / n3;
                        n3 = n4 = n2 / n5;
                        if ((n4 & 1) == 1) {
                            n3 = n4 + 1;
                        }
                        if ((n4 = n3 - 1) >= n2) {
                            throw new IllegalArgumentException(fvd.aq("The src array does not have enough space to hold the downsampled audio.  Downsampling would write from src[%s] to src[%s], but src terminates at src[%s].", 0, n4, n2 - 1));
                        }
                        for (n2 = 0; n2 < n3; n2 += 2) {
                            n4 = n2 * n5;
                            object2[n2] = object2[n4];
                            object2[n2 + 1] = object2[n4 + 1];
                        }
                    }
                    object = Arrays.copyOf((byte[])object2, n3);
                }
                if ((n3 = eyx2.ordinal()) != 0) {
                    if (n3 != 1) throw new IllegalArgumentException("Encoding not supported: ".concat(String.valueOf(String.valueOf((Object)eyx2))));
                    object = eyy.a((byte[])object, icq.j, false);
                } else {
                    object = eyy.a((byte[])object, icq.d, true);
                }
                object2 = new File(fkj2.b.getFilesDir(), "recordings");
                ((File)object2).mkdir();
                object2 = new File((File)object2, "recording.amr");
                ((File)object2).createNewFile();
                ((heg)((heg)fkj.a.f()).j("com/google/android/libraries/speech/transcription/recording/AudioRecordingProvider", "saveAudioFile", 79, "AudioRecordingProvider.java")).u("Writing audio to file %s", object2);
                object2 = new FileOutputStream((File)object2);
                try {
                    ((FileOutputStream)object2).write((byte[])object);
                    object = object3;
                    return object;
                }
                finally {
                    ((FileOutputStream)object2).close();
                }
                catch (IOException iOException) {
                    object.toString();
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(object.toString()));
                }
            }
            ++n3;
        }
        throw new IllegalArgumentException("invalid recognizer encoding: ".concat(String.valueOf(((icq)object).name())));
    }
}

