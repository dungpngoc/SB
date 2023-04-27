package employee_manager.model;

import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@Setter
@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Worker {
    static int next_id = 1000;
    int id;
    String name;
    String address;
    String phone;
    int level;



    public Worker(int id, String name, String address, String phone, int level) {
        this.id = next_id++;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.level = level;
    }
}
