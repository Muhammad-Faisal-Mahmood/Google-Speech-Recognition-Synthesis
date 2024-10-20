/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 */
package androidx.media;

import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesCompat
implements azt {
    public static final int b = 0;
    private static final SparseIntArray c;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray;
        c = sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.a = audioAttributesImpl;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof AudioAttributesCompat)) {
            return false;
        }
        object = (AudioAttributesCompat)object;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl == null) {
            return ((AudioAttributesCompat)object).a == null;
        }
        return audioAttributesImpl.equals(((AudioAttributesCompat)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

