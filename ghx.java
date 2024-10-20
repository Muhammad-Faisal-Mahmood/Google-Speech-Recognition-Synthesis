/*
 * Decompiled with CFR 0.152.
 */
public final class ghx
implements aas {
    private final abg a;
    private final jjk b;

    public ghx(jjk jjk2, abg abg2) {
        this.a = abg2;
        this.b = jjk2;
    }

    @Override
    public final void onCreate(abe abe2) {
        gno.h();
        try {
            this.a.d(aaz.ON_CREATE);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onDestroy(abe abe2) {
        gpf gpf2 = jjk.k(this.b);
        try {
            this.a.d(aaz.ON_DESTROY);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onPause(abe abe2) {
        gno.h();
        try {
            this.a.d(aaz.ON_PAUSE);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onResume(abe object) {
        jjk jjk2 = this.b;
        try {
            object = jjk2.c;
            object = object != null ? ((gqn)object).a() : gno.h();
            try {
                this.a.d(aaz.ON_RESUME);
                return;
            }
            finally {
                object.close();
            }
        }
        finally {
            jjk2.c = null;
        }
    }

    @Override
    public final void onStart(abe abe2) {
        gno.h();
        try {
            this.a.d(aaz.ON_START);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStop(abe abe2) {
        gno.h();
        try {
            this.a.d(aaz.ON_STOP);
            return;
        }
        finally {
            gno.l();
        }
    }
}

