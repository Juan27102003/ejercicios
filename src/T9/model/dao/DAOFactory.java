package T9.model.dao;

import T9.Datasource.DataSource;

public class DAOFactory {

    public static CocheDao createCocheDao(){
        return new CocheDaoImpl(DataSource.getConnection());
    }
    public static ClienteDao createClienteDao(){
        return new ClienteDaoImpl(DataSource.getConnection());
    }
}
