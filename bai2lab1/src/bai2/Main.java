package bai2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee("E01", "An", 10000000, 2000000, 500000));
        list.add(new FullTimeEmployee("E02", "Binh", 12000000, 1000000, 0));
        list.add(new FullTimeEmployee("E03", "Chi", 9000000, 0, 300000));
        list.add(new PartTimeEmployee("E04", "Dung", 0, 80, 50000));
        list.add(new PartTimeEmployee("E05", "Em", 0, 120, 45000));

        System.out.println("Danh sach nhan vien");
        for (Employee e : list) {
            System.out.println(e + " -> income = " + String.format("%.2f", e.income()));
        }

        Employee max = list.get(0);
        for (Employee e : list) {
            if (e.income() > max.income()) max = e;
        }
        System.out.println("\nNhan vien co income cao nhat:");
        System.out.println(max + " -> " + String.format("%.2f", max.income()));
    }
}
