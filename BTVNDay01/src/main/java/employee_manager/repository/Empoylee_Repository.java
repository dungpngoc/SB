package employee_manager.repository;


import employee_manager.database.FactoryDB;
import employee_manager.database.WorkerDB;
import employee_manager.model.Factory;
import employee_manager.model.Worker;

import java.util.ArrayList;
import java.util.Scanner;

// Nhập danh sách công nhân mới. In ra danh sách các công nhân đã có
// Nhập danh sách xưởng sản xuất. In ra danh sách xưởng đã có
// Lập Bảng danh sách chấm công cho từng công nhân và in danh sách ra màn hình.
// Sắp xếp danh sách Bảng danh sách phân công
// a. Theo tên công nhân
// b. Theo xưởng
// Lập bảng kê thu nhập cho mỗi công nhân trong tháng. Thu nhập = 450000Bậc lươngHệ số công việc * (số ngày làm việc/22).
public class Empoylee_Repository {
    Scanner sc = new Scanner(System.in);


    public void add_worker() {
        Worker worker = new Worker();
        System.out.print("Nhập tên: ");
        worker.setName(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        worker.setAddress(sc.nextLine());
        System.out.print("Nhập số điện thoại: ");
        worker.setPhone(sc.nextLine());
        System.out.print("Nhập bậc thợ: ");
        worker.setLevel(Integer.parseInt(sc.nextLine()));
        WorkerDB.list_workers.add(worker);
        System.out.println("Thêm công nhân mới thành công");
    }

    public void show_workers() {
        System.out.println("Danh sách công nhân:");
        for (Worker worker: WorkerDB.list_workers) {
            System.out.println(worker);
        }
    }

    public void add_factory() {
        Factory factory = new Factory();
        System.out.print("Nhập tên: ");
        factory.setName(sc.nextLine());
        System.out.print("Mô tả công việc: ");
        factory.setDescription(sc.nextLine());
        System.out.print("Nhập hệ số công việc: ");
        factory.setWork_review(Double.parseDouble(sc.nextLine()));
        FactoryDB.factories.add(factory);
        System.out.println("Thêm xưởng mới thành công");
    }

    public void show_factories() {
        System.out.println("Danh sách xưởng");
        for (Factory factory: FactoryDB.factories) {
            System.out.println(factory);
        }
    }
}
