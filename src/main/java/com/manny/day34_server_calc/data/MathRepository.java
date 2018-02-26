package com.manny.day34_server_calc.data;

import com.manny.day34_server_calc.models.MathEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MathRepository {

    private List<MathEntry> allEntries = new ArrayList<>();

    public List<MathEntry> getAllEntries(){
        return allEntries;
    }

    public void addEntry(MathEntry mathEntry){
        allEntries.add(mathEntry);
    }
}
