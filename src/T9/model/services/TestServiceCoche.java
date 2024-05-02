package T9.model.services;

import T9.model.entities.Coche;

import java.util.Date;
import java.util.List;

public class TestServiceCoche {
    public static void main(String[] args) {

        CocheService service = new CocheServiceImpl();

        List<Coche> all = service.findAll();
        for (Coche c: all) {
            System.out.println(c);
        }

        System.out.println("*******************************Criteria******************************");
        List<Coche> byCriteria = service.findByCriteria("","");
        for (Coche c: byCriteria) {
            System.out.println(c);
        }

        System.out.println("*******************************findById******************************");
        System.out.println(service.findById("ZA7777AB"));


        System.out.println("*******************************Insert******************************");
        Coche coche = new Coche();
        coche.setMatricula("2234ABC");
        coche.setMarca("Seat");
        coche.setModelo("Leon");
        coche.setAnio(new Date());
        coche.setPrecio(15000);
        coche.setVendido(false);
        //dao.save(coche);
        System.out.println(coche);

        System.out.println("*******************************Update******************************");
        Coche coche2 = new Coche();
        coche2.setMatricula("2234ABC");
        coche2.setMarca("Seat");
        coche2.setModelo("Ibiza");
        coche2.setAnio(new Date());
        coche2.setPrecio(12000);
        coche2.setVendido(true);
        service.updateCoche(coche2);
        System.out.println(coche2);

        System.out.println("*******************************Delete******************************");
        service.delete(coche2);


    }
}
