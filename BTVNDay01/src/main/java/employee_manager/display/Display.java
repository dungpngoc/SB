package employee_manager.display;

import employee_manager.repository.Empoylee_Repository;

import java.util.Scanner;


// 1. Thêm công nhân và in ra danh sách công nhân
// 2. Thêm xưởng và in ra danh sách xưởng


public class Display {
    Empoylee_Repository empoylee_repository = new Empoylee_Repository();

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;
        while (!isQuit) {
            menu();
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    empoylee_repository.add_worker();
                    empoylee_repository.show_workers();
                    break;
                }
                case 2: {
                    empoylee_repository.add_factory();
                    empoylee_repository.show_factories();
                    break;
                }
                case 3: {
                    empoylee_repository.show_workers();
                    break;
                }
                case 4: {
                    empoylee_repository.show_factories();
                    break;
                }
            }
        }
    }

    public void menu() {
        System.out.println("1 -- Thêm công nhân mới và in ra danh sách công nhân");
        System.out.println("2 -- Thêm xưởng mới và in ra danh sách xưởng");
        System.out.println("3 -- Xem danh sách công nhân");
        System.out.println("4 -- Xem danh sách xưởng");
    }
}
