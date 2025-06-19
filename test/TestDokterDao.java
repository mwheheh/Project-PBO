/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import DAO.DokterDAO;
import Model.Dokter;
import java.util.List;

public class TestDokterDao {
    public static void main(String[] args) {
        DokterDAO dao = new DokterDAO();
        List<Dokter> dokterList = dao.getAllDokter();

        for (Dokter d : dokterList) {
            System.out.println("ID: " + d.getId() + ", Nama: " + d.getNama() + ", Spesialisasi: " + d.getSpesialisasi());
        }
    }
}


