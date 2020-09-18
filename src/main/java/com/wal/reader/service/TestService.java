package com.wal.reader.service;

import com.wal.reader.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class TestService {
    @Resource
    private TestMapper testMapper;

    public void batchImport(){
        for(int i=0; i<5; i++){
            /*if(i == 3){
                throw new RuntimeException("预期外异常");
            }*/
            testMapper.insertSample();
        }
    }
}
