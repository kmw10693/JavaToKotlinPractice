import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    // getName() 메서드를 Wrapping 하여 쓰는게 안전
    // Null이 아님을 명시해주자.
    @NotNull
    public String getName() {
        return name;
    }
}
