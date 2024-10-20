/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Collection$_EL;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fbf {
    public static final Pattern a;
    private static final hfn b;

    static {
        b = hfn.q();
        a = Pattern.compile(String.format(Locale.US, "%s%s_%s_zipfile", "langpack-domain_", "([^_]*)", "([0-9]+)"));
    }

    public static String a(String string, int n2) {
        return String.format(Locale.US, "%s%s_%s_zipfile", "langpack-domain_", string, Integer.toString(n2));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ezj b(csg object, bmu object2) {
        String string = ((csg)object).c;
        Object object3 = a.matcher(string);
        fxf.v(((Matcher)object3).matches(), "ClientFileGroup name %s does not fit the pattern of a zipfile-based LanguagePack! The caller should carefully check the name.", object);
        string = ((Matcher)object3).group(1);
        fxf.K(string);
        object3 = ((Matcher)object3).group(2);
        fxf.K(object3);
        int n2 = Integer.parseInt((String)object3);
        int n3 = a.v(((csg)object).g);
        if (n3 != 0 && n3 == 2) {
            void var0_3;
            block7: {
                try {
                    object = Uri.parse((String)a.aw(fbf.c((csg)object).d, "/metadata"));
                    object3 = new fqo();
                    ((fqo)object3).b();
                    object = (File)((bmu)object2).w((Uri)object, (fpp)object3);
                }
                catch (NoSuchElementException noSuchElementException) {
                    break block7;
                }
                catch (IOException iOException) {
                    // empty catch block
                    break block7;
                }
                try {
                    object2 = new hhk(null);
                    fxf.K(object);
                    object2 = hjk.b((File)object, (hhk)object2);
                    object3 = hwj.a();
                    object2 = hwv.o(huw.b, (byte[])object2, 0, ((Object)object2).length, (hwj)object3);
                    hwv.D((hwv)object2);
                    object2 = fah.c((huw)object2);
                }
                catch (IOException iOException) {
                    ((hfk)((hfk)((hfk)b.h()).i(iOException)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackParser", "toLanguagePackDescriptor", 122, "MddLanguagePackParser.java")).u("LanguagePack did not have valid metadata file at path %s", ((File)object).getAbsolutePath());
                    return fbf.d(string, n2, 0L);
                }
                if (((huw)object2).k.size() == 0) {
                    ((hfk)((hfk)b.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackParser", "toLanguagePackDescriptor", 129, "MddLanguagePackParser.java")).A("The metadata proto for [%s, %d] is depending on the legacy SupportedDomainIds list. Please migrate to the DomainToRecognizer map.", string, n2);
                }
                return ezj.e(string, n2, fah.b((huw)object2), fah.a((huw)object2), (long)((huw)object2).g * 1000L);
            }
            ((hfk)((hfk)((hfk)b.g()).i((Throwable)var0_3)).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackParser", "toLanguagePackDescriptor", 108, "MddLanguagePackParser.java")).A("LanguagePack %s-v%d seemed to be downloaded, it did not have a metadata file. Undefined behavior may result.", string, n2);
            return fbf.d(string, n2, 0L);
        }
        ((hfk)((hfk)b.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackParser", "toLanguagePackDescriptor", 92, "MddLanguagePackParser.java")).A("LanguagePack %s-v%d is not yet completely downloaded. Returning descriptor without full metadata.", string, n2);
        return fbf.d(string, n2, fbf.c((csg)object).e);
    }

    private static csf c(csg csg2) {
        return (csf)Collection$_EL.stream(csg2.h).filter(new fay(6)).collect(hcd.c);
    }

    private static ezj d(String string, int n2, long l2) {
        return ezj.e(string, n2, hdc.a, hcy.a, l2);
    }
}

