package T9.model.services;

import T9.model.dao.CocheDao;
import T9.model.dao.DAOFactory;
import T9.model.entities.Coche;

import java.util.List;

public class CocheServiceImpl implements CocheService{

    private CocheDao dao;
    public CocheServiceImpl() {
        dao = DAOFactory.createCocheDao();
    }
    @Override
    public List<Coche> findAll() {
        return dao.findAll();
    }

    @Override
    public List<Coche> findByCriteria(String marca, String modelo) {
        return dao.findByCriteria(marca, modelo);
    }

    @Override
    public Coche findById(String matricula) {
        return dao.findById(matricula);
    }

    @Override
    public Coche save(Coche coche) {
        return dao.save(coche);
    }

    @Override
    public void updateCoche(Coche coche) {
        dao.updateCoche(coche);
    }

    @Override
    public void delete(Coche coche) {
        dao.delete(coche);
    }
}
