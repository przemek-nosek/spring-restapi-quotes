package pl.java.springrest.model;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Quote {
    private String anime;
    private String character;
    private String quote;
}
