package top.beanshell.common.service;

/**
 * crud service interface
 * @author binchao
 */
public interface ServiceI<D> {

    /**
     * save entity
     * @param dto
     * @return
     */
    boolean saveEntity(D dto);

    /**
     * update entity by id
     * just update not null property
     * @param dto
     * @return
     */
    boolean updateEntityById(D dto);

    /**
     * get entity by id
     * @param id
     * @return
     */
    D getById(Long id);

    /**
     * remove entity by id
     * @param id
     * @return
     */
    boolean removeById(Long id);

}
