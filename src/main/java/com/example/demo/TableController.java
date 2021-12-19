/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Reza Ramadhani
 */
@Controller
public class TableController {
    
    @RequestMapping("/datakrs")
    //@ResponseBody
    public String getTable(Model Mahasiswa){
            String result = "Tabel Mahasiswa ";
            Mahasiswa.addAttribute("DataMahasiswa", result);
    
            ArrayList<List<String>> data = new ArrayList<>();
            
            data.add(0,Arrays.asList("ID","Nomor KTP","Nama","Alamat"));
            data.add(1,Arrays.asList("0001","1525014908920001","Aldian Sudha","Belitang"));
            data.add(2,Arrays.asList("0002","2525012005590001","Dicky Mahendra","Baturaja"));
            data.add(3,Arrays.asList("0003","5525017006520020","Leo Fernando","Martapura"));
            data.add(4,Arrays.asList("0004","4525016211930001","Dedy Prassetyo","Kasihan"));
            data.add(5,Arrays.asList("0005","2525011512820002","Usnan","Bangunjiwo"));
            data.add(6,Arrays.asList("0006","7525014305710001","Sandi Perdana","Bangunharjo"));
            data.add(7,Arrays.asList("0007","9525013006770017","Dita Imanda","Bandung"));
            data.add(8,Arrays.asList("0008","4525016011620001","Revi Mariska","Palembang"));
            data.add(9,Arrays.asList("0009","6525013006920008","Madona Astrid","Muara Enim"));
            data.add(10,Arrays.asList("0010","9525014603660003","Alina Oktavianti","Bekasi"));
            data.add(11,Arrays.asList("0011","5525015305700001","Ainun Nabila","Belitang"));
            data.add(12,Arrays.asList("0012","5525013006500003","Abyan Setyawan","Jakarta Selatan"));
            data.add(13,Arrays.asList("0013","6525011006780005","Cindy Rona","Belitang"));
            data.add(14,Arrays.asList("0014","3525016004740003","Shella Cindy","Sleman"));
            data.add(15,Arrays.asList("0015","2525016503880001","Syahril Sidiq","Tegalrejo"));
            data.add(16,Arrays.asList("0016","5525015002690001","Dea Meilinda","Jakarta Utara"));
            data.add(17,Arrays.asList("0017","7525016405740001","Rindy Meilisa","Magelang"));
            data.add(18,Arrays.asList("0018","7525016812770001","Adis Amonra","Oku Timur"));
            data.add(19,Arrays.asList("0019","6525016406730003","Nurul Jannah","Palembang"));
            data.add(20,Arrays.asList("0020","4525014407710003","Aldi Saputra","Jakarta Selatan"));
            
            Mahasiswa.addAttribute("tabel", data);
            
            return "tableviewer";

    }
}