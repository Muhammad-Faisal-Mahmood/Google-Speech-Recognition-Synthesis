/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters;
import java.util.Set;
import java.util.regex.Pattern;

public final class gcz {
    static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    public static final int c = 0;

    static hav a(Set object) {
        ov ov2 = new ov(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            if (!string.startsWith("TikTokWorker#")) continue;
            ov2.add(string.substring(13));
        }
        return hav.n(ov2);
    }

    public static String b(String string) {
        return "TikTokWorker#".concat(String.valueOf(string));
    }

    public static String c(WorkerParameters workerParameters) {
        return (String)fvd.Q(gcz.a(workerParameters.c));
    }
}

