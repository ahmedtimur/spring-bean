package peaksoft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter @Setter
@ToString
@Component
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
