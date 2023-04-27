package employee_manager.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
@NoArgsConstructor
@Setter
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Factory {
    static int next_id = 100;
    int id;
    String name;
    String description;
    double work_review;

    public Factory(int id, String name,String description, double work_review) {
        this.id = next_id++;
        this.name = name;
        this.description = description;
        this.work_review = work_review;
    }
}
