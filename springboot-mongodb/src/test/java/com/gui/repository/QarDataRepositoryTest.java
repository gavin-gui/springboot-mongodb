package com.gui.repository;

import com.google.gson.Gson;
import com.gui.model.QarData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class QarDataRepositoryTest {

    @Autowired
    QarDataRepository qarDataRepository;

    @Test
    public void save() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file/B5417-HU6119-2017-02-25-FOC-HFE.json"));
        String line = null;
        StringBuffer buff = new StringBuffer();
        while ((line = br.readLine()) != null) {
            buff.append(line);
        }

        Gson gson = new Gson();
        QarData qarData = gson.fromJson(buff.toString(), QarData.class);
        qarDataRepository.save(qarData);
    }

    @Test
    public void findAll() {
        Gson gson = new Gson();
        List<QarData> qarDatas = qarDataRepository.findAll();

        qarDatas.forEach( it->
                System.out.println(gson.toJson(it))
        );
    }

}