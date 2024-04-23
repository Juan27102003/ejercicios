package model.dao;

import Datasource.DataSource;

public class DAOFactory {

    public static CocheDao createCocheDao(){
        return new CocheDaoImpl(DataSource.getConnection());
    }
    public static ClienteDao createClienteDao(){
        return new ClienteDaoImpl(DataSource.getConnection());
    }
}
