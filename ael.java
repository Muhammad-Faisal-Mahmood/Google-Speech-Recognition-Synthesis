/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class ael {
    public static final Pattern a;
    private static final ArrayList b;

    static {
        b = new ArrayList();
        a = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static int a(String string) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string);
        int n2 = -1;
        if (bl2) {
            return -1;
        }
        if (ael.c(string)) {
            return 1;
        }
        if (!ael.e(string)) {
            if (!("text".equals(ael.f(string)) || "application/x-media3-cues".equals(string) || "application/cea-608".equals(string) || "application/cea-708".equals(string) || "application/x-mp4-cea-608".equals(string) || "application/x-subrip".equals(string) || "application/ttml+xml".equals(string) || "application/x-quicktime-tx3g".equals(string) || "application/x-mp4-vtt".equals(string) || "application/x-rawcc".equals(string) || "application/vobsub".equals(string) || "application/pgs".equals(string) || "application/dvbsubs".equals(string))) {
                if (ael.d(string)) {
                    return 4;
                }
                if (!("application/id3".equals(string) || "application/x-emsg".equals(string) || "application/x-scte35".equals(string) || "application/x-icy".equals(string) || "application/vnd.dvb.ait".equals(string))) {
                    if (!"application/x-camera-motion".equals(string)) {
                        int n3;
                        int n4 = b.size();
                        int n5 = 0;
                        while (true) {
                            n3 = n2;
                            if (n5 >= n4) break;
                            hti hti2 = (hti)b.get(n5);
                            Object object = hti2.b;
                            if (string.equals(null)) {
                                n5 = hti2.a;
                                n3 = 0;
                                break;
                            }
                            ++n5;
                        }
                        return n3;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }

    public static String b(String string) {
        int n2;
        block15: {
            if (string == null) {
                return null;
            }
            string = fxf.T(string);
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 187090231: {
                    if (!string.equals("audio/mp3")) break;
                    n2 = 1;
                    break block15;
                }
                case -432836267: {
                    if (!string.equals("audio/mpeg-l2")) break;
                    n2 = 5;
                    break block15;
                }
                case -432836268: {
                    if (!string.equals("audio/mpeg-l1")) break;
                    n2 = 4;
                    break block15;
                }
                case -586683234: {
                    if (!string.equals("audio/x-wav")) break;
                    n2 = 2;
                    break block15;
                }
                case -979095690: {
                    if (!string.equals("application/x-mpegurl")) break;
                    n2 = 3;
                    break block15;
                }
                case -1007807498: {
                    if (!string.equals("audio/x-flac")) break;
                    n2 = 0;
                    break block15;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                return string;
                            }
                            return "audio/mpeg-L2";
                        }
                        return "audio/mpeg-L1";
                    }
                    return "application/x-mpegURL";
                }
                return "audio/wav";
            }
            return "audio/mpeg";
        }
        return "audio/flac";
    }

    public static boolean c(String string) {
        return "audio".equals(ael.f(string));
    }

    public static boolean d(String string) {
        return "image".equals(ael.f(string)) || "application/x-image-uri".equals(string);
        {
        }
    }

    public static boolean e(String string) {
        return "video".equals(ael.f(string));
    }

    private static String f(String string) {
        int n2;
        if (string != null && (n2 = string.indexOf(47)) != -1) {
            return string.substring(0, n2);
        }
        return null;
    }
}

