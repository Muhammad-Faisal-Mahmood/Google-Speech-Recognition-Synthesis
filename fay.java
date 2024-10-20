/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Predicate$_CC;
import java.io.File;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public final class fay
implements Predicate {
    private final int a;

    public /* synthetic */ fay(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 13: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 12: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 11: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 10: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 9: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 8: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 7: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 6: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 5: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 4: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 3: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 2: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 1: {
                return Predicate$_CC.$default$and(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$negate(this);
            }
            case 13: {
                return Predicate$_CC.$default$negate(this);
            }
            case 12: {
                return Predicate$_CC.$default$negate(this);
            }
            case 11: {
                return Predicate$_CC.$default$negate(this);
            }
            case 10: {
                return Predicate$_CC.$default$negate(this);
            }
            case 9: {
                return Predicate$_CC.$default$negate(this);
            }
            case 8: {
                return Predicate$_CC.$default$negate(this);
            }
            case 7: {
                return Predicate$_CC.$default$negate(this);
            }
            case 6: {
                return Predicate$_CC.$default$negate(this);
            }
            case 5: {
                return Predicate$_CC.$default$negate(this);
            }
            case 4: {
                return Predicate$_CC.$default$negate(this);
            }
            case 3: {
                return Predicate$_CC.$default$negate(this);
            }
            case 2: {
                return Predicate$_CC.$default$negate(this);
            }
            case 1: {
                return Predicate$_CC.$default$negate(this);
            }
            case 0: 
        }
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            default: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 13: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 12: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 11: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 10: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 9: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 8: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 7: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 6: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 5: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 4: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 3: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 2: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 1: {
                return Predicate$_CC.$default$or(this, predicate);
            }
            case 0: 
        }
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        int n2 = this.a;
        boolean bl2 = true;
        switch (n2) {
            default: {
                return ((String)object).startsWith(":");
            }
            case 13: {
                return ((fjv)object).a();
            }
            case 12: {
                return ((ffx)object).c.size() > 0;
            }
            case 11: {
                object = (ffx)object;
                n2 = fje.a;
                return ((ffx)object).c.size() > 0;
            }
            case 10: {
                csf csf2 = (csf)object;
                object = fbm.a;
                return csf2.c.equals("zipfile");
            }
            case 9: {
                csf csf3 = (csf)object;
                object = fbm.a;
                return csf3.c.equals("training_plan_zipfile");
            }
            case 8: {
                object = (Boolean)object;
                return false;
            }
            case 7: {
                object = (Boolean)object;
                return true;
            }
            case 6: {
                object = (csf)object;
                Pattern pattern = fbf.a;
                return ((csf)object).c.equals("zipfile");
            }
            case 5: {
                object = ((csg)object).c;
                return fbf.a.matcher((CharSequence)object).matches();
            }
            case 4: {
                object = (huw)object;
                n2 = ((huw)object).c;
                if ((n2 & 1) != 0 && (n2 & 4) != 0 && (n2 & 2) != 0 && (n2 & 0x800) != 0) {
                    return true;
                }
                hfk hfk2 = (hfk)((hfk)fbe.a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/MddLanguagePackMonitor", "isValidLanguagePackConfig", 150, "MddLanguagePackMonitor.java");
                boolean bl3 = 1 == (((huw)object).c & 1);
                boolean bl4 = (((huw)object).c & 4) != 0;
                boolean bl5 = (((huw)object).c & 2) != 0;
                if ((((huw)object).c & 0x800) == 0) {
                    bl2 = false;
                }
                hfk2.H("LanguagePack config is incompatible with Zipfile downloader due to missing field(s). Existence of [locale: %b, version: %b, downloadUrl: %b, hashValueSha1: %b]", bl3, bl4, bl5, bl2);
                return false;
            }
            case 3: {
                return ((gto)object).g();
            }
            case 2: {
                object = (File)object;
                hfn hfn2 = faz.a;
                n2 = ((File)object).getName().indexOf(45);
                return n2 == 2 || n2 == 3;
                {
                }
            }
            case 1: {
                return ((ezj)object).c();
            }
            case 0: 
        }
        return ((File)object).isDirectory();
    }
}

