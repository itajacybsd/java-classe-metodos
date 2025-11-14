package basico;

import java.util.Objects;

@SuppressWarnings("all")
public class ExemploNull {

    static void main() {
        String a = "";
        IO.println(a.concat("!!!"));

        a = null;
        IO.println(a);

        if(a != null) {
            IO.println(a.concat("!!!"));
            IO.println(a.length());
        }

        IO.println(Objects.requireNonNullElse(a, "").concat("!!!"));
    }
}
