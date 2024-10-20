/*
 * Decompiled with CFR 0.152.
 */
final class grj
extends kmp {
    private final gqn a;
    private final kmp b;

    public grj(kmp kmp2, gqn gqn2) {
        super(null);
        this.b = kmp2;
        this.a = gqn2;
    }

    @Override
    public final void W() {
        gpf gpf2 = this.a.a();
        try {
            this.b.W();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void X() {
        gpf gpf2 = this.a.a();
        try {
            this.b.X();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void e() {
        gpf gpf2 = this.a.a();
        try {
            this.b.e();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void f(Object object) {
        gpf gpf2 = this.a.a();
        try {
            this.b.f(object);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void g() {
        gpf gpf2 = this.a.a();
        try {
            this.b.g();
            return;
        }
        finally {
            gpf2.close();
        }
    }
}

