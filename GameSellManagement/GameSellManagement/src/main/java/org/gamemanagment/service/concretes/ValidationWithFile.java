package org.gamemanagment.service.concretes;

import org.gamemanagment.model.Player;
import org.gamemanagment.service.abstracts.Validate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ValidationWithFile implements Validate {
    @Override
    public boolean validate(Player player) {
        File file = new File("src/main/java/org/gamemanagment/database/edevlet.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = reader.readLine()) != null) {
                String temp[] = s.split(" ");
                if (temp[0].equals(player.getNationalIdentity()) && temp[1].equals(player.getName()) && temp[2].equals(player.getSurName()) && temp[3].equals(player.getBirthDate())) {
                    return true;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }
}