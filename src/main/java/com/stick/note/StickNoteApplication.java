package com.stick.note;

import com.wesoon.web.mvc.annotation.EnableMybatisPageHelper;
import com.wesoon.web.mvc.annotation.EnableRESTful;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRESTful
@EnableMybatisPageHelper
@SpringBootApplication
public class StickNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(StickNoteApplication.class, args);
    }

}
