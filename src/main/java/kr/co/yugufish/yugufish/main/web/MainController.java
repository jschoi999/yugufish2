package kr.co.yugufish.yugufish.main.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(ModelMap model){
        return "main_window";
    }

    // @RequestMapping("/image")
    // public ResponseEntity<byte[]> image() throws IOException{
    //     System.out.println("머임머임?");
    //     InputStream inputStream = new FileInputStream("/Users/jschoi/Documents/img/test.jpg");
    //     byte[] imageByteArray = IOUtils.toByteArray(inputStream);
    //     inputStream.close();

    //     HttpHeaders headers = new HttpHeaders();
    //     headers.setContentType(MediaType.IMAGE_PNG);

    //     return new ResponseEntity<>(imageByteArray, headers, HttpStatus.OK);
    // }
}
