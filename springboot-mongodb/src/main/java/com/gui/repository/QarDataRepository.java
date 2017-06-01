package com.gui.repository;

import com.gui.model.QarData;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/6/1.
 */
public interface QarDataRepository extends MongoRepository<QarData,Long> {

}
