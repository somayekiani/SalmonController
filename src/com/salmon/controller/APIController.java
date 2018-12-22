package com.salmon.controller;

import com.salmon.Repository.PDFCoreService;
import com.salmon.TO.PdfCore;

import dkproparent.DKProparent;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.rmi.Naming;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
@RequestMapping(value = "/action")
public class APIController {

    @Autowired
    PDFCoreService pdfCoreService;


    @RequestMapping(value="/home")
    @ResponseBody
    public String action(HttpServletRequest request, HttpServletResponse response) throws Exception {



        //RMI connection to server so this is client
        DKProparent dkProparent= (DKProparent) Naming.lookup("//localhost/dkproparent");
        String tags=dkProparent.getText(request.getParameter("externalLink"));

        //get jsonArray that includes taglist and hashkey
//        JSONArray jsonArray=new JSONArray(tags);
//
//        JSONObject tagName=new JSONObject();
//
//        String tag= jsonArray.getJSONObject(1).toString();
//        System.out.println(tag);
//        tagName.put("tag",tag);
//
//
//        System.out.println(tagName);
//        String hashKey=jsonArray.getJSONObject(2).getString("hashkey");
//
//        System.out.println(hashKey);

        //persist information of external link to database
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now=LocalDateTime.now();
//        String date=dateTimeFormatter.format(now);
//        PdfCore pdfCore=new PdfCore();
//        pdfCore.setExternalLink(externalLink);
//        pdfCore.setTitle(userTitle);
//        pdfCore.setUniqueHash(hashKey);
//        pdfCore.setTags(tag);
//        pdfCore.setDate(date);
//        pdfCore.setUsername("?????");
//        pdfCoreService.register(pdfCore);
        System.out.println(tags);
        response.sendRedirect("one.jsp");

        return tags;

    }

    @RequestMapping(value = "/updateTitle")
    public void titleUpdate(HttpServletRequest request){
        for (int i=0;i<10;i++){
            if (!request.getParameter(String.valueOf(i)).equals(" ")){

//               PdfCore pdfCore=new PdfCore();
//               pdfCore.setTags(request.getParameter(String.valueOf(i)));
//               pdfCoreService.update(pdfCore);

            }
        }
    }



}
