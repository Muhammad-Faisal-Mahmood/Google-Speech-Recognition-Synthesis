/*
 * Decompiled with CFR 0.152.
 */
import j$.util.stream.Stream;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class hjq
implements AutoCloseable {
    public final Stream b;
    public final Function c;
    public final Function d;

    public hjq() {
        throw null;
    }

    public hjq(Stream stream, Function function, Function function2) {
        fxf.K(stream);
        this.b = stream;
        this.c = function;
        this.d = function2;
    }

    public static hjq c(Stream stream) {
        return new hjp(stream, new hjm(1), new hjm(0), stream);
    }

    public Stream a() {
        fbi fbi2 = new fbi(this, new hjn(0), 4);
        return this.b.map(fbi2);
    }

    public final hjq b(BiPredicate biPredicate) {
        return hjq.c(this.a().filter(new fai(biPredicate, 15)));
    }

    @Override
    public final void close() {
        this.b.close();
    }
}

