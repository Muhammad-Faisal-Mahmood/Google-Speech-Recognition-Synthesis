/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public final class fps {
    private final Context a;
    private final String b;
    private String c = "files";
    private String d = "common";
    private Account e = fpt.b;
    private String f = "";
    private final gzs g = new gzs();

    public fps(Context context) {
        boolean bl2 = context != null;
        fvc.H(bl2, "Context cannot be null", new Object[0]);
        this.a = context;
        this.b = context.getPackageName();
    }

    private final void f(String string) {
        fvc.H(fpt.d.contains(string), "The only supported locations are %s: %s", fpt.d, string);
        this.c = string;
    }

    public final Uri a() {
        String string = this.c;
        String string2 = this.d;
        String string3 = fpq.b(this.e);
        String string4 = this.f;
        StringBuilder stringBuilder = new StringBuilder("/");
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append(string2);
        stringBuilder.append("/");
        stringBuilder.append(string3);
        stringBuilder.append("/");
        stringBuilder.append(string4);
        string4 = stringBuilder.toString();
        string2 = fqh.a(this.g.g());
        return new Uri.Builder().scheme("android").authority(this.b).path(string4).encodedFragment(string2).build();
    }

    public final void b(String string) {
        block15: {
            Object object;
            Object object2;
            block10: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                block9: {
                                    object2 = fvc.N(this.a);
                                    object = new File((File)object2, "managed").getAbsolutePath();
                                    if (!string.startsWith((String)object)) break block9;
                                    this.f("managed");
                                    object = string.substring(((String)object).length());
                                    break block10;
                                }
                                object = ((File)object2).getAbsolutePath();
                                if (!string.startsWith((String)object)) break block11;
                                this.f("files");
                                object = string.substring(((String)object).length());
                                break block10;
                            }
                            object = this.a.getCacheDir().getAbsolutePath();
                            if (!string.startsWith((String)object)) break block12;
                            this.f("cache");
                            object = string.substring(((String)object).length());
                            break block10;
                        }
                        object = this.a.getExternalFilesDir(null);
                        if (object == null || !string.startsWith((String)(object = ((File)object).getAbsolutePath()))) break block13;
                        this.f("external");
                        object = string.substring(((String)object).length());
                        break block10;
                    }
                    object2 = fvc.M(this.a);
                    object = new File((File)object2, "files").getAbsolutePath();
                    if (!string.startsWith((String)object)) break block14;
                    this.f("directboot-files");
                    object = string.substring(((String)object).length());
                    break block10;
                }
                object = new File((File)object2, "cache").getAbsolutePath();
                if (!string.startsWith((String)object)) break block15;
                this.f("directboot-cache");
                object = string.substring(((String)object).length());
            }
            object2 = Arrays.asList(((String)object).split(File.separator));
            boolean bl2 = object2.size() >= 3;
            fvc.H(bl2, "Path must be in module and account subdirectories: %s", string);
            this.d((String)object2.get(1));
            object2 = (String)object2.get(2);
            if ("managed".equals(this.c) && !fpq.d((String)object2)) {
                try {
                    Integer.parseInt((String)object2);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new IllegalArgumentException(numberFormatException);
                }
                fvc.H(false, "AccountManager cannot be null", new Object[0]);
                try {
                    throw null;
                }
                catch (ExecutionException executionException) {
                    throw new IllegalArgumentException(new fpz(executionException.getCause()));
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    throw new IllegalArgumentException(new fpz(interruptedException));
                }
            }
            string = fpq.a((String)object2);
            fpq.b((Account)string);
            this.e = string;
            this.e(((String)object).substring(this.d.length() + ((String)object2).length() + 2));
            return;
        }
        throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(string)));
    }

    public final void c() {
        this.f("directboot-files");
    }

    public final void d(String string) {
        fvc.H(fpt.a.matcher(string).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", string);
        fvc.H(fpt.c.contains(string) ^ true, "Module name is reserved and cannot be used: %s", string);
        this.d = string;
    }

    public final void e(String object) {
        String string = object;
        if (((String)object).startsWith("/")) {
            string = ((String)object).substring(1);
        }
        object = fpt.a;
        this.f = string;
    }
}

