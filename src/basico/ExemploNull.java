package basico;

import java.util.Objects;

@SuppressWarnings("all")
public class ExemploNull {

    static void main() {
        String a = "";
        System.out.println(a.concat("!!!"));

        a = null;
        System.out.println(a);

        if(a != null) {
            System.out.println(a.concat("!!!"));
            System.out.println(a.length());
        }

        System.out.println(Objects.requireNonNullElse(a, "")
                .concat("!!!x"));
    }
}
