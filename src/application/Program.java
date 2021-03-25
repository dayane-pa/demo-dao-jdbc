package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

//        Department department = new Department(1, "Books");
//        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, department);
//        System.out.println(seller);


        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById =====");
        Seller sellerFindById = sellerDao.findById(3);
        System.out.println(sellerFindById);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2,null);
        List<Seller>sellerList = sellerDao.findByDepartment(department);
        for (Seller seller : sellerList){
            System.out.println(seller);
        }



    }
}
