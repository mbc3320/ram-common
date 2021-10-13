package top.beanshell.common.service;

/**
 * crud service interface
 * @author binchao
 */
public interface ServiceI<D> {

    /**
     * save entity
     * @param dto data
     * @return result
     */
    boolean saveEntity(D dto);

    /**
     * update entity by id
     * just update not null property
     * @param dto data
     * @return result
     */
    boolean updateEntityById(D dto);

    /**
     * get entity by id
     * @param id primaryKey
     * @return dto
     */
    D getById(Long id);

    /**
     * remove entity by id
     * @param id primaryKey
     * @return result
     */
    boolean removeById(Long id);

}
