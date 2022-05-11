package peaksoft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@Getter @Setter
@ToString
public class Cat {

    @Value("${cat.name}")
    private String name;

    @Value("${cat.breed}")
    private String breed;

    @Value("${cat.age}")
    private int age;

    @Value("${cat.text}")
    private String text;

}
