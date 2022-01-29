package JacksonTre;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost {
    private String userName;
    private String date;
    private String title;
    private String content;
    private int votes;
}

