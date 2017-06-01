package com.gui.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


/**
 * Created by Administrator on 2017/6/1.
 */
@Data
@Document(collection = "qardatas")
public class QarData implements Serializable {
    @Id
    private String id;
    private String qarFileName;
    private String headRowid;
    private String tdwnAirport;
    private String createTime;
    private String fdsDecodeDate;
    private String acNo;
    private String lastUpdateTime;
    private String matchStrategy;
    private String lastUpdateUser;
    private String infoId;
    private String headInfoStr;
    private String imported;
    private String toffAirport;
    private String tdwnTime;
    private String toffTime;
    private String flightNo;
    private String fdsDecodeTime;
    private String fdsMetricVersion;
    private String flightDate;
    private String flightSegment;
    private String actionFlag;
    private String acMetricType;
    private String acType;
    private String fdsDecodeDatetime;
    private String utc;
    private String flapr;
    private String lgdl;
    private String alt;
    private String flphdl;
    private String flapl;
    private String flightId;
    private String startTime;
    private String endTime;
    private String ralt;
    private String filePath;

    @Override
    public String toString() {
        return "[ acNo:" + ", flightNo:" + flightNo + ", flightDate:"+flightDate+", toffTime:"+toffTime+", tdwnTime"+
                ", toffAirport:"+toffAirport+", tdwnAirport:"+tdwnAirport + " ]";
    }
}

