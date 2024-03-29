package tk.mybatis.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的Mapper
 * 该接口不能被扫描到，否则会报错
 *
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
