package map;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import db.DbConnection;

public class Tech {
    String idtech;
    String nom;
    double nbusers;

    public ArrayList<Tech> allTechs() throws Exception{
        DbConnection connection=new DbConnection();
        Connection connect=connection.connect();
        String sqlQuery = "select * from tech";
        Statement stm=connect.createStatement();
        ResultSet rst= stm.executeQuery(sqlQuery);
        ArrayList listTechs=new ArrayList();

        while (rst.next()) {
            Tech tech=new Tech();
            tech.setIdtech(rst.getString("idtech"));
            tech.setNom(rst.getString("nom"));
            tech.setNbusers(rst.getDouble("nbusers"));
            listTechs.add(tech);
        }
        connect.close();
        return listTechs;
    }

    public String getIdtech() {
        return idtech;
    }
    public void setIdtech(String idtech) {
        this.idtech = idtech;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getNbusers() {
        return nbusers;
    }
    public void setNbusers(double nbusers) {
        this.nbusers = nbusers;
    }
}
