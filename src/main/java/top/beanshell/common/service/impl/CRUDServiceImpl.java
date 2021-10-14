package top.beanshell.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.beanshell.common.model.dto.BaseDTO;
import top.beanshell.common.service.ServiceI;

/**
 * CRUD Service impl
 * @author binchao
 */
public class CRUDServiceImpl<D extends BaseDTO, S extends ServiceI<D>> implements ServiceI<D> {

    @Autowired
    protected S daoService;

    /**
     * get dao service
     * @return dao service
     */
    public S getDaoService() {
        return daoService;
    }

    @Override
    public boolean saveEntity(D dto) {
        return daoService.saveEntity(dto);
    }

    @Override
    public boolean updateEntityById(D dto) {
        return daoService.updateEntityById(dto);
    }

    @Override
    public D getById(Long id) {
        return (D) daoService.getById(id);
    }

    @Override
    public boolean removeById(Long id) {
        return daoService.removeById(id);
    }
}
