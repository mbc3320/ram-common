package top.beanshell.common.incrementer;


import top.beanshell.common.utils.IdUtil;

/**
 * Id生成器接口
 * @author beanshell
 */
public interface IdentifierGenerator {

    /**
     * 生成Id
     *
     * @param entity 实体
     * @return id
     */
    Number nextId(Object entity);

    /**
     * 生成uuid
     *
     * @param entity 实体
     * @return uuid
     */
    default String nextUUID(Object entity) {
        return IdUtil.get32UUID();
    }
}
