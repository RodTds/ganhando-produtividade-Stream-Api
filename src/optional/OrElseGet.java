package optional;

import java.util.Optional;

public class OrElseGet {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier"); //orElseGet
        System.out.println(result);
    }
}
