/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class bm
extends bj {
    public final Activity b;
    public final Context c;
    public final Handler d;
    public final by e;

    public bm(Activity activity, Context context, Handler handler) {
        jse.e(context, "context");
        this.b = activity;
        this.c = context;
        this.d = handler;
        this.e = new by();
    }

    @Override
    public View a(int n2) {
        throw null;
    }

    @Override
    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        throw null;
    }

    public abstract Object e();

    public void j() {
    }

    public boolean o(String string) {
        jse.e(string, "permission");
        return false;
    }

    public void q(PrintWriter printWriter, String[] stringArray) {
    }

    public final void t(Intent intent, int n2, Bundle bundle) {
        jse.e(intent, "intent");
        if (n2 == -1) {
            this.c.startActivity(intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
}

